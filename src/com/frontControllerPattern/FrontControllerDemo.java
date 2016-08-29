/**
 * 
 */
package com.frontControllerPattern;

/**
 * @author RAyyachamy
 *
 */
public class FrontControllerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FrontController controller = new FrontController();
		controller.dispatchRequest("STUDENT");
		controller.dispatchRequest("HOME");

	}

}
