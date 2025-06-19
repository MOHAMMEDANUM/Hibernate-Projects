package oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String directorName;
	private int yor;
	private double rating;
	
	@OneToMany
	private Song s;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public int getYor() {
		return yor;
	}

	public void setYor(int yor) {
		this.yor = yor;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Song getS() {
		return s;
	}

	public void setS(Song s) {
		this.s = s;
	}

	public Movie(int id, String title, String directorName, int yor, double rating, Song s) {
		super();
		this.id = id;
		this.title = title;
		this.directorName = directorName;
		this.yor = yor;
		this.rating = rating;
		this.s = s;
	}

	public Movie() {
		super();
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", directorName=" + directorName + ", yor=" + yor + ", rating="
				+ rating + ", s=" + s + "]";
	}
	
	
	
}
