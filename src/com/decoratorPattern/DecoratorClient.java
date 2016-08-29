/**
 * 
 */
package com.decoratorPattern;

/**
 * @author RAyyachamy
 *
 */
public class DecoratorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  IceCream iceCream = new NuttyDecorator(new HoneyDecorator(new SimpleIceCream()));
	  System.out.println(iceCream.makeIceCream());

	}

}
