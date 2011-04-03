package com.face4j.facebook.util;

import com.face4j.facebook.enums.PictureType;

public class FacebookUtil {
	
	/**
	 * Provide the facebook profile image url. The required parameter to obtain the appropriate small image would be added
	 * @param pictureURL
	 * @return
	 */
	public static String getSmallPictureURL(String pictureURL){
		return appendPictureParam(pictureURL, PictureType.SMALL);
	}
	
	/**
	 * Provide the facebook profile image url. The required parameter to obtain the appropriate square image would be added
	 * @param pictureURL
	 * @return
	 */
	public static String getSquarePictureURL(String pictureURL){
		return appendPictureParam(pictureURL, PictureType.SQUARE);
	}
	
	/**
	 * Provide the facebook profile image url. The required parameter to obtain the appropriate large image would be added
	 * @param pictureURL
	 * @return
	 */
	public static String getLargePictureURL(String pictureURL){
		return appendPictureParam(pictureURL, PictureType.LARGE);
	}
	
	private static String appendPictureParam(String pictureURL, PictureType pictureType){
		return  pictureURL +  (pictureURL.contains("?") ? "&" : "?")+Constants.PARAM_PICTURE_TYPE+"="+pictureType.getType();
	}
	
}