/**
 * 
 */
package com.templatepattern;

/**
 * @author RAyyachamy
 *
 */
public class NetOrder extends OrderProcessTemplate {

	/**
	 * 
	 */
	public NetOrder() {
		System.out.println("-------------------------");
		System.out.println("Welcome to the Website Store!!!!!");
		System.out.println("-------------------------");
		System.out.println("Customer visits the Website Store !!!");
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
		System.out.println("Customer does the Payment through online banking!!!");

	}

	/* (non-Javadoc)
	 * @see com.templatepattern.OrderProcessTemplate#doConfirmOrder()
	 */
	@Override
	public void doConfirmOrder() {
		System.out.println("Order confirmed message received!!!");

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
