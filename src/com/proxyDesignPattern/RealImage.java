/**
 * 
 */
package com.proxyDesignPattern;

/**
 * @author RAyyachamy
 *
 */
public class RealImage implements Image {
	
	private String fileName;
	
	

	/**
	 * @param fileName
	 */
	public RealImage(String fileName) {
		System.out.println("Creating a new Instance of Real Image");
		this.fileName = fileName;
		loadFromDisk(fileName);
	}



	/**
	 * @param fileName2
	 */
	private void loadFromDisk(String fileName) {
		
		System.out.println("Loading the image" +fileName);
	}



	/* (non-Javadoc)
	 * @see com.proxyDesignPattern.Image#display()
	 */
	@Override
	public void display() {
		System.out.println("Displaying Image "+fileName);

	}

}
