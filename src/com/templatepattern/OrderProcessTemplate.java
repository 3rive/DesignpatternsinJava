/**
 * 
 */
package com.templatepattern;

/**
 * @author RAyyachamy
 * 
 */
public abstract class OrderProcessTemplate {
	
	public boolean isGiftWrap = false;

	public final void processOrder() {
		doSelect();
		doAddTocart();
		doPayment();
		doConfirmOrder();
		doGiftWrap();
	}

	public abstract void doSelect();

	public abstract void doAddTocart();

	public abstract void doPayment();

	public abstract void doConfirmOrder();

	public abstract void doGiftWrap();

}
