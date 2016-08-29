/**
 * 
 */
package com.businessdelegate;

/**
 * @author RAyyachamy
 *
 */
public enum ServiceTypeEnum {
	
	JMS(1, "JMS"),
	
	/**
	 * Superseded
	 */
	REST(2, "REST"),
	
	/**
	 * INACTIVE
	 */
	EJB(3, "EJB");
	
	private Integer integerValue;
	private String label;

	private ServiceTypeEnum(Integer value, String label)
	{
		this.integerValue = value;
		this.label = label;
	}

	/**
	 * @return the integerValue
	 */
	public Integer getIntegerValue() {
		return integerValue;
	}

	/**
	 * @param integerValue the integerValue to set
	 */
	public void setIntegerValue(Integer integerValue) {
		this.integerValue = integerValue;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

}
