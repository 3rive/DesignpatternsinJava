/**
 * 
 */
package com.frontControllerPattern;

/**
 * @author RAyyachamy
 *
 */
public class Dispatcher extends AbstractDispatcher{
	
	private AbstractView view;
	
	

	/* (non-Javadoc)
	 * @see com.frontControllerPattern.AbstractDispatcher#dispatch(java.lang.String)
	 */
	@Override
	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("STUDENT")){
			view = new StudentView();
		}
		else{
			view = new HomeView();
		}
		
		view.showView();
	}

}
