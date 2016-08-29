/**
 * 
 */
package com.serviceLocator;

/**
 * @author RAyyachamy
 *
 */
public class Service1 implements Service {

	/* (non-Javadoc)
	 * @see com.serviceLocator.Service#getName()
	 */
	@Override
	public String getName() {
		return "Service1";
	}

	/* (non-Javadoc)
	 * @see com.serviceLocator.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Executing Service1");
	}

}
