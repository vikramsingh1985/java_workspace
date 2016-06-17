package test;

import java.util.ArrayList;
import java.util.Collections;

public class ComprableExample {
	
	
	public static void main(String args[]){
		ArrayList<Movie> list = new ArrayList<>();
		
		list.add(new Movie("Hindustan ki kasam",4,2005));
		list.add(new Movie("Ram Narayan Baja bajata",4,1991));
		list.add(new Movie("Hathi mera sathi",5,1986));
		list.add(new Movie("Lagan",5,2001));
		list.add(new Movie("Ye kasam hum na todege",3,1981));
		
		Collections.sort(list);
		System.out.println("Movies after sortings: ");
		
		for(Movie movie : list){
			System.out.println("Movie Name: "+movie.getName()+"\n Movie Ratins:  "+movie.getRatings()+"  \n Movie Year : "+movie.getYear());
		}
		
	}

}

class Movie implements Comparable<Movie>{
	private String name;
	private int ratings;
	private int year;
	
	
	public Movie(String name,int ratings,int year) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.ratings = ratings;
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRatings(){
		return ratings;
	}
	
	public int getYear(){
		return year;
	}

	
	
}
