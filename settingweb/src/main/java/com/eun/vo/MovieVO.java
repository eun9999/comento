package com.eun.vo;

public class MovieVO {
	private String movie_name;
	private String director;
	private String types;
	
	public MovieVO(String movie_name, String director, String types) {
		this.movie_name = movie_name;
		this.director = director;
		this.types = types;
	}
	
	public String getMovieName() {
		return movie_name;
	}
	
	public void setMovieName(String movie_name) {
		this.movie_name = movie_name;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getTypes() {
		return types;
	}
	
	public void setTypes(String types) {
		this.types = types;
	}
}