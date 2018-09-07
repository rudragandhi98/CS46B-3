package movies;
import java.util.ArrayList;
import java.util.HashSet;

//This class implements the FilmArchive interface
public class HashFilmArchive extends HashSet<Movie> implements FilmArchive 
{
	//This returns the list of movies by using hashSet
	public ArrayList<Movie> getSorted()
	{
		HashSet<Movie> hashMovieList = new HashSet<Movie>(this);
		ArrayList<Movie> fewMovies = new ArrayList<Movie>(hashMovieList);
		return fewMovies;
	}
	public static void main(String[] args) 
	{
		HashFilmArchive archive = new HashFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
	}

}
