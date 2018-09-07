package movies;
// This class implements the comparable interface
public class Movie implements Comparable<Movie> 
{
	private String title; 
	private int year;
	public Movie(String title, int year)
	{
		this.title = title;
		this.year = year;
	}
	//Compare title, then year
	public int compareTo(Movie m)
	{
		if(title.compareTo(m.title) > 0)
		{
			return 1;
		}
		else if(title.compareTo(m.title) < 0)
		{
			return -1;
		}
		//Titles are equal, comparing by the year
		else if(this.year > m.year)		
		{
			return 1;
		}
		else if(this.year < m.year)
		{
			return -1;
		}
		else
			//Movies are in deep equality 
		{
			return 0;
		}

	}
	public String getTitle() 
	{
		return title;
	}
	public int getYear() 
	{
		return year;
	}
	//This is an equal method that satisfies compatibility
	public boolean equals(Object x)
	{
		Movie m = (Movie)x;
		return this.compareTo(m) == 0;
	}
	public String toString()
	{
		return "Movie" + title + "(" + year +")";
	}
	//By giving the list of all movies with different or same titles and years 
	//it will return all movies
	public static Movie[] getTestMovies()
	{
		Movie[] allMovies = new Movie[10];
		allMovies[0] = new Movie("The Thomas Crown Affair", 1968);
		allMovies[1] = new Movie("The Thomas Crown Affair", 1999);
		allMovies[2] = new Movie("The Martian", 2015);
		allMovies[3] = new Movie("Bridge of Spies", 2015);
		allMovies[4] = new Movie("Get Out", 2017);
		allMovies[5] = new Movie("Get Out", 2017);
		allMovies[6] = new Movie("The Intern", 2015);
		allMovies[7] = new Movie("Maleficent", 2013);
		allMovies[8] = new Movie("Up", 2008);
		allMovies[9] = new Movie("Black Panther", 2018);
		return allMovies;
	}
	public int hashCode() 
	{
		return title.hashCode() + year; 
	}
}

