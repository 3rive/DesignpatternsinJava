/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public class BusinessDelegate {

	private BusinessLookUp lookupService = new BusinessLookUp();
	
	private BusinessService businessService;
	
	private int serviceType;

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	 public void doTask(){
	      businessService = lookupService.getBusinessService(serviceType);
	      businessService.doProcessing();		
	   }
	
}
