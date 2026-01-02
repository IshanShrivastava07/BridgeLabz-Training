package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieNode {
String title, director;
int year;
double rating;

MovieNode prev;
MovieNode next;

public MovieNode(String title, String diector, int year, double rating) {
	this.title = title;
    this.director = director;
    this.year = year;
    this.rating = rating;
}

}
