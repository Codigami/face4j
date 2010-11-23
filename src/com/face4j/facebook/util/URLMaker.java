package com.face4j.facebook.util;

import com.face4j.facebook.enums.PictureType;

/**
 * All URL creation should happen in this class. This will help make changes easily when things change. Since we are dealing with 3rd party APIs,
 * frequent changes are expected
 * @author nischal.shetty
 *
 */
public class URLMaker {
	
	/**
	 * Returns the image url of a facebook object
	 * @param username
	 * @return
	 */
	public static String getImageURL(String username){
		return getImageURL(username, null);	
	}
	
	/**
	 * Returns the image url of a facebook object
	 * @param id
	 * @return
	 */
	public static String getImageURL(long id){
		return getImageURL(""+id);	
	}

	/**
	 * Returns the image url of a facebook object
	 * @param username
	 * @param pictureType
	 * @return
	 */
	public static String getImageURL(String username, PictureType pictureType){
		String tempURL = Constants.FACEBOOK_GRAPH_URL+"/"+username+"/"+Constants.PICTURE;
		if(pictureType!=null){
			tempURL += "?"+Constants.PARAM_PICTURE_TYPE+"="+pictureType.getType();
		}
		return tempURL;	
	}
	
	/**
	 * Returns the image url of a facebook object
	 * @param id
	 * @param pictureType
	 * @return
	 */
	public static String getImageURL(long id, PictureType pictureType){
		return getImageURL(""+id, pictureType);	
	}

}
