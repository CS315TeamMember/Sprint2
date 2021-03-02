package sprint2;

public class Main {
	public static void main(String[] args) {
		
		
		
		// This is our first test targetting Photograph
		
		
		
		// Creating two objects of the same picture 
		Photograph newpic = new Photograph("test1name", "test1caption");
		Photograph samepic = new Photograph("test2name", "test2caption");
		
		
		
		// Create a different object
		Photograph difpic = new Photograph("test3name", "test3caption");
		
		
		
		// Testing to make sure our accessors from Photograph work
		System.out.println(newpic.getCaption() + " is the caption for the picture " + newpic.getFileName());	
		System.out.println(samepic.getCaption() + " is the caption for the picture " + samepic.getFileName());
		
		
		

		// Test our equals method		
		if (newpic.equals(samepic)) {
			System.out.println("Both pictures have the file name " + samepic.getFileName() + " and the caption " + samepic.getCaption() + ".");		
		}
		else {
			System.out.println("Different pictures.");	
		}
		
		// Test our equals method when they are different
		if (newpic.equals(difpic)) {
			System.out.println("Both pictures have the file name " + samepic.getFileName() + " and the caption " + samepic.getCaption() + ".");		
		}
		else {
			System.out.println("Different pictures.");	
		}
		
		
		
		
		// Checking the format of our toString()  method
		System.out.println(newpic.toString());
		
		
		
		
		// This is our Second test targeting PhotoLibrary
		
		
		
		// Creates three photolibraries
		PhotoLibrary thelib = new PhotoLibrary("Alex's Pictures", 14);
		PhotoLibrary diflib = new PhotoLibrary("Other's Pictures", 13);
		PhotoLibrary lamelib = new PhotoLibrary("Lame Pictures", 12);
		
		
		
		// Tests getName accessor
		System.out.println(thelib.getName());
		
		
		
		// Tests getId accessor
		System.out.println(thelib.getId());
		
		
		
		//Add photos to our PhotoLibraries
		thelib.addPhoto(difpic);
		thelib.addPhoto(samepic);
		thelib.addPhoto(newpic);
		
		diflib.addPhoto(difpic);
		diflib.addPhoto(samepic);
		
		
		
		// Set a new name for lame pictures library 
		lamelib.setName("Jerry's Library");
		
		
		
		// Tests name change
		System.out.println(lamelib.getName());
		
		
		
		// Tests our accessor to see the photos in a given library
		System.out.println("The pictures in diflib are" + diflib.getPhotos());
		System.out.println("The pictures in Jerry's Library are" + lamelib.getPhotos());
		
		
		
		// Checks to see if our libraries contain photos
		if (lamelib.hasPhoto(difpic)) {
			System.out.println("difpic is contained in this library");
		}
		else {
			System.out.println("difpic is not contained in this library");		
		}
		
		if (thelib.hasPhoto(difpic)) {
			System.out.println("difpic is contained in this library");
		}
		else {
			System.out.println("difpic is not contained in this library");		
		}
		
		
		
		// Test to delete difpic from the library
		thelib.erasePhoto(difpic);
		
		
		
		// Check to see if it is deleted
		System.out.println(thelib.getPhotos());
		
		
		
		// check again if it contains difpic
		if (thelib.hasPhoto(difpic)) {
			System.out.println("difpic is contained in this library");
		}
		else {
			System.out.println("difpic is not contained in this library");		
		}
		
		
		
		// Check the number of photos in a library
		System.out.println(thelib.getName() + " has " + thelib.numPhotographs() + " photo(s) in its library");
		
		
		
		// Check the number of common photos in two libraries
		System.out.println(thelib.getName() + " and " + diflib.getName() + " have " + thelib.similarity(thelib, diflib) + " percent similarity");
		
		
		
		// What pictures are shared between two libraries?
		System.out.println(thelib.commonPhotos(thelib, diflib) + " are the shared photos between the libraries");
		
		
		
		
		
	}

}
