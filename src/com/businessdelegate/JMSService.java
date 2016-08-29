/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public class JMSService implements BusinessService {

	/* (non-Javadoc)
	 * @see com.businessdelegate.BusinessService#doProcessing()
	 */
	@Override
	public void doProcessing() {
		System.out.println("Invoking Service through JMS @ Service");

	}

}
