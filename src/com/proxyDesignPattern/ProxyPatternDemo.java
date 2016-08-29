/**
 * 
 */
package com.proxyDesignPattern;

/**
 * @author RAyyachamy
 *
 */
public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Trying to load the image");
		Image image = new ProxyImage("test.jpg");
		image.display();
		System.out.println(" ");
		image.display();
		

	}

}
