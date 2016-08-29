/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public class Client {
	
	BusinessDelegate businessDelegate;

	/**
	 * @param businessDelegate
	 */
	public Client(BusinessDelegate businessDelegate) {
		super();
		this.businessDelegate = businessDelegate;
	}
	
	public void doTask(){		
		businessDelegate.doTask();
	   }

}
