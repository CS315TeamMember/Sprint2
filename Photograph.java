package sprint1;

/**
 * Sprint 1
 * @author Adair Tabb
 * 
 */

public class Photograph {
	/**
	 * Stores the permanent filename of a Photograph object.
	 */
	private final String FILENAME;
	/**
	 * Stores the permanent caption of a Photograph object.
	 */
	private final String CAPTION;
	
	/**
	 * Constructor for a Photograph object, taking a filename and caption, which are then stored in the class fields.
	 * @param filename The filename of the photograph object.
	 * @param caption  The caption of the photograph object.
	 */
	Photograph(String filename, String caption) {
		this.FILENAME = filename;
		this.CAPTION = caption;
	}
	
	/**
	 * Gets and returns the filename stored in the corresponding class field.
	 * @return The string currently stored in the FILENAME class field.
	 */
	public String getFileName() {
		return FILENAME;
	}
	
	/**
	 * Gets and returns the caption stored in the corresponding class field.
	 * @return The string currently stored in the CAPTION class field.
	 */
	public String getCaption() {
		return CAPTION;
	}
	
	/**
	 * A method that is meant to compare a different Photograph object to the current Photograph object.
	 * @param o The object to be compared to the current Photograph object.
	 * @return Returns false if the object is not a Photograph, or if the Photograph being compared to the current Photograph has a different value FILENAME and CAPTION. Returns true if the object is a Photograph and has the same value FILENAME and CAPTION.
	 */
	public boolean equals(Object o) {
		if (!(o instanceof Photograph)) {
			return false;
		}
		Photograph that = (Photograph) o;
		
		return this.FILENAME.equals(that.FILENAME) && this.CAPTION.equals(that.CAPTION);
	}
	
	/**
	 * A method to allow a Photograph object's field information to be printed as an easily readable String when the object is called in a print() or println().
	 * @return A String containing the Photograph object's fields in an understandable format. 
	 */
	public String toString() {
		return "Filename: " + FILENAME + "\n" + "Caption: " + CAPTION;
	}
	
}
