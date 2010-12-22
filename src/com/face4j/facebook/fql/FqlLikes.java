package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlLikes implements Serializable {

	private static final long serialVersionUID = 6069894095257026664L;

	private String href;
	private Integer count;
	private Long[] sample;
	private Long[] friends;
	private Boolean userLikes;
	private Boolean canLike;

	/**
	 * The URL to a page showing the other users who've liked this post.
	 * 
	 * @return
	 */
	public String getHref() {
		return href;
	}

	/**
	 * The URL to a page showing the other users who've liked this post.
	 * 
	 * @param href
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * The total number of times users like the post.
	 * 
	 * @return
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * The total number of times users like the post.
	 * 
	 * @param count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * Indicates whether the viewing user likes the post.
	 * 
	 * @return
	 */
	public Boolean isUserLikes() {
		return userLikes;
	}

	/**
	 * Indicates whether the viewing user likes the post.
	 * 
	 * @param userLikes
	 */
	public void setUserLikes(Boolean userLikes) {
		this.userLikes = userLikes;
	}

	/**
	 * Indicates whether the post can be liked.
	 * 
	 * @return
	 */
	public Boolean isCanLike() {
		return canLike;
	}

	/**
	 * Indicates whether the post can be liked.
	 * 
	 * @param canLike
	 */
	public void setCanLike(Boolean canLike) {
		this.canLike = canLike;
	}

	/**
	 * A sample of users who like the post.
	 * 
	 * @return
	 */

	public Long[] getSample() {
		return sample;
	}

	/**
	 * A sample of users who like the post.
	 * 
	 * @param sample
	 */

	public void setSample(Long[] sample) {
		this.sample = sample;
	}

	/**
	 * A list of the viewing user's friends who like the post.
	 * 
	 * @return
	 */

	public Long[] getFriends() {
		return friends;
	}

	/**
	 * A list of the viewing user's friends who like the post.
	 * 
	 * @param friends
	 */

	public void setFriends(Long[] friends) {
		this.friends = friends;
	}

}
