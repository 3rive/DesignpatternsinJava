/**
 * 
 */
package com.serviceLocator;

/**
 * @author RAyyachamy
 *
 */
public class ServiceLocatorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	      service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	}

}
