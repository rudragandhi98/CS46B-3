package movies;
import java.util.ArrayList;
import java.util.TreeSet;
//This class implements the interface FilmArchive
public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive
{
	//This returns a list of sorted movies
	public ArrayList<Movie> getSorted() 
	{
		ArrayList<Movie> fewMovies = new ArrayList<Movie>(this);
		return fewMovies;
	}
	public static void main(String[] args) 
	{
		TreeFilmArchive archive = new TreeFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
	}


}