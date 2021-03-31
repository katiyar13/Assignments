import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class movie_Detail_List {
	Scanner sc=new Scanner(System.in);
	List<movie_details> m=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie_Detail_List mdl=new movie_Detail_List();
		mdl.addMovie();
		mdl.addMovie();
		mdl.findMoviebyname();
		mdl.find_Moviebygenre();
		mdl.remove_movie();
		mdl.remove_all_movies();

	}
	void addMovie() {
        System.out.print("Movie name: ");
        String movname = sc.nextLine();
        System.out.print("Lead Actor name: ");
        String lactor = sc.nextLine();
        System.out.print("Lead Actress name: ");
        String lactress = sc.nextLine();
        System.out.print("Name of genre: ");
        String genre = sc.nextLine();
        movie_details M = new movie_details(movname,lactor,lactress,genre);
        m.add(M);
        System.out.println();
	}
	void remove_movie() {
		System.out.println("movie name to be removed:");
		String s=sc.nextLine();
		movie_details S = null;
		for(movie_details M : m)
        {
            if(M.getMovname().equalsIgnoreCase(s))
            {
                S = M;
                break;
            }
        }
        if(S==null)
            System.out.println("This movie is not present");
        else {
            m.remove(S);
            System.out.println("Movie deleted");}
		
	}
	public void remove_all_movies()
    {
        m.removeAll(m);
        System.out.println(" Movies Deleted");
    }
    public void findMoviebyname()
    {
        String s;
        System.out.println("Movie name:");
        s=sc.nextLine();
        for (movie_details M : m)
        {
            if(M.getMovname().equalsIgnoreCase(s))
            {
                System.out.println(M.toString());
            }
        }
    }
    public void find_Moviebygenre()
    {
        String s;
        for (movie_details M : m)
        {
            if(M.getGenre().equalsIgnoreCase(s))
            {
                System.out.println(M.toString());
            }
        }
    }
}
