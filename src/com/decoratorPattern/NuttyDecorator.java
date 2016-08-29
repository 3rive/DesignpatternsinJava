/**
 * 
 */
package com.decoratorPattern;

/**
 * @author RAyyachamy
 *
 */
public class NuttyDecorator extends IceCreamDecorator{

	/**
	 * @param specialIceCream
	 */
	public NuttyDecorator(IceCream specialIceCream) {
		super(specialIceCream);
	}

	/* (non-Javadoc)
	 * @see com.decoratorPattern.IceCreamDecorator#makeIceCream()
	 */
	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream()+addNuts();
	}

	/**
	 * @return
	 */
	private String addNuts() {
		// TODO Auto-generated method stub
		return "+ tasty and crunchy nuts";
	}
	
	

}
