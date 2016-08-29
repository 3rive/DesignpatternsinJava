/**
 * 
 */
package com.proxyDesignPattern;

/**
 * @author RAyyachamy
 *
 */
public class ProxyImage implements Image {
	
	private RealImage realImage;
	
	private String fileName;
	
	public ProxyImage(String fileName){
		this.fileName=fileName;
	}

	/* (non-Javadoc)
	 * @see com.proxyDesignPattern.Image#display()
	 */
	@Override
	public void display() {
		if(realImage ==null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
