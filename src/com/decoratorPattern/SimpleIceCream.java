/**
 * 
 */
package com.decoratorPattern;

/**
 * @author RAyyachamy
 *
 */
public class SimpleIceCream implements IceCream {
	

	/* (non-Javadoc)
	 * @see com.decoratorPattern.IceCream#makeIceCream()
	 */
	@Override
	public String makeIceCream() {
		return "Icecream base";
	 
	}

}
