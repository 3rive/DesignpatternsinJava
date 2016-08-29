/**
 * 
 */
package com.serviceLocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RAyyachamy
 *
 */
public class Cache {
	
	private List<Service> services;
	
	public Cache(){
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName){
		
		for (Service service : services) {
			System.out.println("Returning cached  " + serviceName + " object");
            return service;	
		}
		return null;
	}
	public void addService(Service newService){
		boolean exists = false;
		for (Service service : services) {
	         if(service.getName().equalsIgnoreCase(newService.getName())){
	            exists = true;
	         }
	      }
	      if(!exists){
	         services.add(newService);
	      }
	}
}
