package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Artist;
import dmacc.beans.Comic;
import dmacc.beans.Writer;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Comic comic() {
		Comic bean = new Comic("Watchmen");
		return bean;
	}
	
	@Bean
	public Artist artist() {
		Artist bean = new Artist("Dave", "Gibbons");
		return bean;
	}
	
	@Bean
	public Writer writer() {
		Writer bean = new Writer("Alan", "Moore");
		return bean;
	}
}
