package movies;
import java.util.ArrayList;
import java.util.TreeSet;
//This class implements the FilmArchive interface and 
//sorts an ArrayList of Movies using a TreeSet
public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive
{
	//This method will not add the same year and same title
	public boolean add(Movie m)
	{
		for(Movie that : this)
		{
			if(that.getYear() == m.getYear() && that.getTitle().equals(m.getTitle()))
			{
				return false;  //Overrides add method
			}
		}
		boolean reallyAdded = super.add(m);
		return reallyAdded;
	}
	// Sorts an ArrayList Movie using TreeSet
	public ArrayList<Movie> getSorted()
	{
		TreeSet<Movie> tree = new TreeSet<Movie>(this);
		ArrayList<Movie> fewMovies = new ArrayList<Movie>(tree);
		return fewMovies;
	}
	public static void main(String[] args)
	{
		ListFilmArchive archive = new ListFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); for (Movie m: archive)
				System.out.println(m); 
			System.out.println("**************"); 
			for (Movie m: archive.getSorted())
				System.out.println(m);
	}

}
