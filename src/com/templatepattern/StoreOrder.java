/**
 * 
 */
package com.templatepattern;

/**
 * @author RAyyachamy
 *
 */
public class StoreOrder extends OrderProcessTemplate {

	/**
	 * 
	 */
	public StoreOrder() {
		System.out.println("-------------------------");
		System.out.println("Welcome to the Store!!!!!");
		System.out.println("-------------------------");
		System.out.println("Customer visits the Store !!!");
	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doSelect()
	 */
	@Override
	public void doSelect() {
		System.out.println("Customer selects the Product !!!");

	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doAddTocart()
	 */
	@Override
	public void doAddTocart() {
		System.out.println("Customer adds the Product to cart!!!");

	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doPayment()
	 */
	@Override
	public void doPayment() {
		System.out.println("Customer does the Payment in the counter!!!");
		isGiftWrap = true;

	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doConfirmOrder()
	 */
	@Override
	public void doConfirmOrder() {
		System.out.println("Customer collects the bill!!!");

	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doGiftWrap()
	 */
	@Override
	public void doGiftWrap() {
		if(isGiftWrap){
			System.out.println("Product giftwraped!!!");
		}

	}

}
