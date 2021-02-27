/**
 * Sprint 2
 * Evelina Teran
 */

package sprint2;
import java.util.*;

public class PhotoLibrary{
	
	/**
	 * "name" is a string containing the PhotoLibrary's name in whatever
	 * form it was provided
	 * 
	 * "id" is an integer containing the PhotoLibrary's unique id. Once
	 * set it will never change.
	 * 
	 * "photos" is an ArrayList<Photograph> of photos the user has posted
	 * to their feed in this library
	 */
	private String name;
	private final int ID;
	private ArrayList<Photograph> photos = new ArrayList<Photograph>(); // Was declared but not instantiated. Fixed! (: -- Adair
	private HashSet<String> albums = new HashSet<String>();
	/**
	 * Constructor for name and id
	 * 
	 * @param name
	 * @param id
	 */
	public PhotoLibrary(String name, int id) {
		this.name = name;
		this.ID = id;		
	}
	
	/**
	 * Accessor/getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Accessor/getter for id
	 * @return ID
	 */
	public int getId() {
		return ID;
	}
	
	/**
	 * Accessor/getter for photos
	 * @return ArrayList for photos
	 */
	public ArrayList<Photograph> getPhotos(){
		return photos;
	}
	
	public HashSet<String> getAlbum(){
		return albums;
	}
	
	/**
	 * Mutator/setter for the field name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	

	/**
	 * Adds the photograph p to the current object's 
	 * photo feed if and only if p is not already in the list
	 * 
	 * @param p represents a photograph
	 * @return boolean operator returns true if photo was added
	 * 		   boolean operator returns false if photo was not added
	 */
	public boolean addPhoto(Photograph p) {
		if (!photos.contains(p)) {
			photos.add(p);
			return photos.add(p);
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param p represents a photograph
	 * @return
	 */
	//Checks to see if p is in the list of photos
	public boolean hasPhoto(Photograph p) {
		if (photos.contains(p)) {
			return getPhotos().contains(p);
		}
		else {
			return false;
		}
	}
	
	//Erases a photo from the feed
	public boolean erasePhoto(Photograph p) {
		if (!photos.contains(p)) {
			return false;
		}
		else {
			photos.remove(p);
			return getPhotos().remove(p);
		}
	}
	
	public int numPhotographs() {
		int numPhotos = photos.size();
		return numPhotos;
	}
	
	/**
	 * This method is meant to compare one PhotoLibrary object against the current Photolibrary object and returns true or false depending on if the IDs match.
	 *
	 * @param o The object being compared to the PhotoLibrary object.
	 * @return If the object is not a PhotoLibrary object, it will return false. If the object is a PhotoLibrary object, but its ID is different from the current PhotoLibrary object, the method will return false. If the object is a PhotoLibrary object AND has the same ID as the current Photolibrary object, it will return true.
	 * @author Adair Tabb
	 */
	public boolean equals(Object o) {
		if (!(o instanceof PhotoLibrary)) {
			return false;
		}
		PhotoLibrary that = (PhotoLibrary) o;
		
		return (this.ID == that.ID);
	}
	
	/**
	 * A method to allow PhotoLibrary's field information to be printed as an easily readable String the object is called in a print() or println().
	 * @return A String containing the PhotoLibrary object's fields in an understandable format.
	 * @author Adair Tabb
	 */
	public String toString() {
		return "Name: " + name + "\n" + "ID: " + ID + "\n" + "Photos: " + photos;
	}

	
	public static ArrayList<Photograph> commonPhotos(PhotoLibrary a, PhotoLibrary b){
		ArrayList<Photograph>aPhotos = a.getPhotos();
		ArrayList<Photograph>bPhotos = b.getPhotos();
		
		ArrayList<Photograph>result = new ArrayList<Photograph>();
		
		// Using for each loops to loop through every photo in the ArrayLists aPhotos and bPhotos
		// Structure for these loops are "for (type variableName : arrayName)"
		for (Photograph photoA : aPhotos) {
			if(bPhotos.contains(photoA)) {
					result.add(photoA);
				}
			}
		return result;
	}
	
	
	
	public static double similarity(PhotoLibrary a, PhotoLibrary b) {
		double simVal;
		
		ArrayList<Photograph>result = PhotoLibrary.commonPhotos(a, b);
		if (result.isEmpty()) {
			return 0.0;
		}
		else {
			// number of common photos divided by total number of photos (percentage of similarity)
			simVal = (double)result.size() / ((double)a.numPhotographs() + (double)b.numPhotographs());
			return simVal;
		}
	}
	
	
	public ArrayList<Photograph> getPhotos(int rating){
		
		if (rating >= 0 && rating <= 5) {
			ArrayList<Photograph>result = new ArrayList<Photograph>();
			for (Photograph photoA : photos) {
				//How do I make sure its the rating for photoA being compared to the goal rating
				if (photoA.getRating() >= rating){
					result.add(photoA);
				}
			}
			
		}
		else {
			return null;
		}
	}
	
	public ArrayList<Photograph> getPhotosInYear(int year){
		ArrayList<Photograph>result = new ArrayList<Photograph>();
		for(Photograph photoA: photos) {
			if(photoA.getYear() = year) {
				result.add(photoA);
			}
		}
		return result;
	}
	
	public ArrayList<Photograph> getPhotosInMonth(int month, int year){
		ArrayList<Photograph>result = new ArrayList<Photograph>();
		for(Photograph photoA: aPhotos) {
			if((year = year) & (month = month)){
				result.add(photoA);
			}
		}
		return result;
	}
	
	public ArrayList<Photograph> getPhotosBetween(String beginDate, String endDate){
		ArrayList<Photograph>photos = a.getPhotos();
		ArrayList<Photograph>result = new ArrayList<Photograph>();
		for(Photograph photoA: aPhotos) {
			if((beginDate ) & (month = month)){
				result.add(photoA);
			}
		}
		return result;
	}
	
	public boolean createAlbum(String albumName) {
		if (!albums.contains(albumName)) {
			albums.add(albumName);
			Album a1 = new Album(albumName);
			return albums.add(albumName);
		}
		else {
			return false;
		}
	}
	
	public boolean removeAlbum(String albumName) {
		if (!albums.contains(albumName)) {
			return false;
		}
		else {
			albums.remove(albumName);
			return getPhotos().remove(albumName);
		}
	}
	
	public boolean addPhotoToAlbum(Photograph p, String albumName) {
		if(!albums.contains(albumName))
			if(!albumName.contains(p)) {
				a1.add(p);
				return albumName.add(p);
			}
		else {
			return false;
		}
	}
	
	public boolean removePhotoFromAlbum(Photograph p, String albumName) {
		if (!albumName.hasPhotos(p)) {
			return false;
		}
		else {
			Albums(albumName).remove(p);
			return getPhotos().remove(p);
		}
	}
	
	private Album getAlbumByName(String albumName) {
		
	}
	
	public boolean erasePhoto(Photograph p) {
		//Modify original one actually
	}
	
	public String toString() {
		//Modify original one actually 
	}
}
