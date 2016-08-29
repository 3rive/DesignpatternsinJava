/**
 * 
 */
package com.decoratorPattern;

/**
 * @author RAyyachamy
 *
 */
public class HoneyDecorator extends IceCreamDecorator {

	/**
	 * 
	 */
	public HoneyDecorator(IceCream specialIceCream) {
		super(specialIceCream);
	}

	/* (non-Javadoc)
	 * @see com.decoratorPattern.IceCream#makeIceCream()
	 */
	@Override
	public String makeIceCream() {
		return specialIceCream.makeIceCream()+addHoney();
	}

	/**
	 * @return
	 */
	private String addHoney() {
		return "+ sweet honey";
	}

}
