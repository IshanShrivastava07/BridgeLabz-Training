package com.streams.toptrendingmovies;

import java.util.*;



class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " " + rating + " " + year;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("A", 4.8, 2024),
                new Movie("B", 4.5, 2023),
                new Movie("C", 4.9, 2022),
                new Movie("D", 4.6, 2024),
                new Movie("E", 4.7, 2023),
                new Movie("F", 4.3, 2021)
        );

       movies.stream()
       .filter(x -> x.year >= 2022)
       .sorted((a,b) -> Double.compare(b.rating,a.rating))
       .limit(5)
       .forEach(System.out::println);
    }
}
