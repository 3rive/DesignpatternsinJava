/**
 * 
 */
package com.decoratorPattern;

/**
 * @author RAyyachamy
 *
 */
abstract class IceCreamDecorator implements IceCream {
	
	protected IceCream specialIceCream;

	/**
	 * 
	 */
	public IceCreamDecorator(IceCream specialIceCream) {
		this.specialIceCream = specialIceCream;
	}



	/* (non-Javadoc)
	 * @see com.decoratorPattern.IceCream#makeIceCream()
	 */
	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream();
	}

}
