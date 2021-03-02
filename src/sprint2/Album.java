package sprint2;
import java.util.*;


/**
 * Sprint 2
 * @author Alex Dozzi
 * 
 */

public class Album{

	//A string containing the album's name
	private String name;
	
	
	//Array list of photos in the album
	private ArrayList<Photograph> photos = new ArrayList<Photograph>();

	
	/**
	 * Constructor for an Album object. Takes in a string as the name for a given album.
	 * @param (name): name of the album
	 */
	public Album(String name) {
		this.name = name;
	}

	
	/**
	 * Accessor for an Album object. Returns the name of the album.  
	 * @return (name): name of the album
	 */
	public String getName() {
		return name;
	}
	
	public ArrayList<Photograph> getPhotos() {
		return photos;
	}
	
	/**
	 * Mutator for an Album object. Rename an album.
	 * @param (name): name of the album
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Method that adds a photograph to an Album object.
	 * @param (p): instance of photograph
	 * @return (boolean): returns true or false
	 */
	public boolean addPhoto(Photograph p) {
		if (photos.contains(p)) { //if statements need parentheses around the condition. I've corrected everywhere they've been missing. - Adair
			return false;
		}
		else {
			photos.add(p);
			return true;
		}
		
	}
	
	
	/**
	 * Method that determines if a Photograph is in the Album object.
	 * @param (p): instance of photograph
	 * @return (boolean): returns true or false
	 */
	public boolean hasPhoto(Photograph p) {
		if (photos.contains(p)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Method that removes a Photograph from an Album if it is in the object.
	 * @param (p): instance of photograph
	 * @return (boolean): returns true or false
	 */
	public boolean removePhoto(Photograph p) {
		if (photos.contains(p)) { 
			photos.remove(p);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Method that determines how many Photographs are in the album.
	 * @return (numPhotos): An integer representing the number of photos in the album.
	 */
	public int numPhotographs() {
		int numPhotos = photos.size();
		return numPhotos;
		
	}
	
	/**
	 * Method that determines if the current Album  object's  name  value  is  equal  to  the  name  value  of  the  object passed
	 * @param (p): object being compared to the Album object
	 * @return (boolean): returns true or false
	 */
	public boolean equals(Object o) {
		if  (o instanceof Album) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Method that returns the Album name and the filenames of the photographs in the Album as a string.
	 * @return (String): String of Album name and photos.
	 * @author Adair Tabb
	 */
	public String toString() {
		ArrayList<String> photographs = new ArrayList<String>();
		for(Photograph photo : photos) {
			photographs.add(photo.getFileName());
		}
		return "Photo Album: " + name + "\nPhotographs: " + photographs;		
	}
	
	
	/**
	 * Returns a unique integer that corresponds to the given Album. Overrides hashcode()
	 * @return (int): Returns an integer.
	 */
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
}

