package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Artist;
import dmacc.beans.Comic;
import dmacc.beans.Writer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComicRepository;


@SpringBootApplication
public class SpringComicsApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringComicsApplication.class, args);
	}
	
	@Autowired
	ComicRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//persist an existing bean
		Comic co = appContext.getBean("comic", Comic.class);
		co.setTitle("(The) Watchmen");
		repo.save(co);
		
		//creating a bean to use = not managed by spring
		Comic c = new Comic("Uzumaki");
		Artist a = new Artist("Junji", "Ito");
		Writer w = new Writer("Hayao", "Miyazaki");
		c.setWriter(w);
		c.setArtist(a);
		repo.save(c);
		
		List<Comic> allMyComics = repo.findAll();
		for(Comic people: allMyComics) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
