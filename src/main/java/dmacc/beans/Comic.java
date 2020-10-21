package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Comic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	@Autowired
	private Writer writer;
	@Autowired
	private Artist artist;
	
	public Comic( ) {
		super();
	}
	
	public Comic(String title) {
		this.title = title;
	}
	
	public Comic(String title, Writer writer, Artist artist) {
		this.title = title;
		this.writer = writer;
		this.artist = artist;
	}
	
	public Comic(int id, String title, Writer writer, Artist artist) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.artist = artist;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Comic [id=" + id + ", title=" + title + ", writer=" + writer + ", artist=" + artist + "]";
	}



}
