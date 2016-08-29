/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public class BusinessDelegatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType(ServiceTypeEnum.EJB.getIntegerValue());
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType(ServiceTypeEnum.JMS.getIntegerValue());
		client.doTask();
		businessDelegate.setServiceType(ServiceTypeEnum.REST.getIntegerValue());
		client.doTask();
	}

}
