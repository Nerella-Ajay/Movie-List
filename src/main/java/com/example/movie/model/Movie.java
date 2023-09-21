package com.example.movie.model;

import javax.persistence.*;


@Entity
@Table(name = "MOVIELIST")
public class Movie{

    @movieId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("movieId")
    private int movieId;

    @Column("movieName")
    private String movieName;

    @Column("leadActor")
    private String leadActor;

    public Movie(){}
    public Movie(int movieId, String movieName, String leadActor){
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public String getLeadActor(){
        return leadActor;
    }
    public void setLeadActor(String leadActor){
        this.leadActor = leadActor;
    }
}

// Write your code here