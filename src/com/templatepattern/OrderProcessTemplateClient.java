/**
 * 
 */
package com.templatepattern;

/**
 * @author RAyyachamy
 *
 */
public class OrderProcessTemplateClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	OrderProcessTemplate storeOrder = new StoreOrder();
	storeOrder.processOrder();
	
	OrderProcessTemplate netOrder = new NetOrder();
	netOrder.processOrder();

	}

}
