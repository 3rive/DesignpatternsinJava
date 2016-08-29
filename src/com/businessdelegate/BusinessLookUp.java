/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public class BusinessLookUp {
	
	BusinessService businessService;
	
	public BusinessService getBusinessService(int id) {
		switch (id) {
		case 1:
			businessService = new JMSService();
			break;
		case 2:
			businessService = new RestFulService();
			break;
		default:
			businessService = new EJBMessageService();
			break;
		}
		return businessService;
	}

}
