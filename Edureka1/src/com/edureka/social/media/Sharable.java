package com.edureka.social.media;

public interface Sharable extends editable{
	// data members 
	int sharedCount=0; // final values should always be initialized // default: public static final int sharedCount=0;
	
	
	
	
	
	//functionality
	void share(); // in interface always functionality should not have any body // default: public abstract void share();

}
