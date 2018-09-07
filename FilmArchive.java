package movies;
import java.util.ArrayList;

//Defines two methods getSorted and add
public interface FilmArchive 
{
	public ArrayList<Movie> getSorted();
	public boolean add(Movie m);
}
