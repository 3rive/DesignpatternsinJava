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
		Image image = new ProxyImage("test.jpg");
		image.display();
		System.out.println(" ");
		image.display();
		

	}

}
