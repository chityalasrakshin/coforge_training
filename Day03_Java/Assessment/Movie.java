package com.coforge.Day3;

public class Movie {
	private String movieName;
	private String director;
	private double rating;

	public Movie(String movieName, String director, double rating) {
		this.movieName = movieName;
		this.director = director;
		this.rating = rating;
	}

	// Getters & Setters
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		if (rating >= 0 && rating <= 10) {
			this.rating = rating;
		} else {
			System.out.println("Invalid rating! Must be between 0 and 10.");
		}
	}

	@Override
	public String toString() {
		return "Movie [Name=" + movieName + ", Director=" + director + ", Rating=" + rating + "]";
	}
}