/**
 * 
 */
package com.serviceLocator;

/**
 * @author RAyyachamy
 *
 */
public class Service2 implements Service{

	/* (non-Javadoc)
	 * @see com.serviceLocator.Service#getName()
	 */
	@Override
	public String getName() {
		return "Service 2";
	}

	/* (non-Javadoc)
	 * @see com.serviceLocator.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Executing Service2");
		
	}

}
