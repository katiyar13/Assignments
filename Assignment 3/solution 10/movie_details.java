
public class movie_details {
	String movname;
	String lactor;
	String lactress;
	String genre;
	public String getMovname() {
		return movname;
	}
	public void setMovname(String movname) {
		this.movname = movname;
	}
	public String getLactor() {
		return lactor;
	}
	public void setLactor(String lactor) {
		this.lactor = lactor;
	}
	public String getLactress() {
		return lactress;
	}
	public void setLactress(String lactress) {
		this.lactress = lactress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGene(String genre) {
		this.genre = genre;
	}
	public movie_details(String movname, String lactor, String lactress, String genre) {
		this.movname = movname;
		this.lactor = lactor;
		this.lactress = lactress;
		this.genre = genre;
	}
	public String toString() {
        return "Movie:" +
                "movie Name:" + movname +
                "\nlead actor:" + lactor +
                "\nlead actress:" + lactress +
                "\ngenre=" + genre;
    }
}