package com.doitgeek.jersey_heroku_webapp;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Note {

	private Long id;
	private String title;
	private String author;
	
	public Note() {
		super();
	}

	public Note(Long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	@XmlElement
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@XmlElement
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
