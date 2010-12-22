package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.List;

public class FqlComments implements Serializable {

	private static final long serialVersionUID = 383394113986607215L;

	private Boolean canRemove;
	private Boolean canPost;
	private Integer count;
	List<FqlComment> commentList;

	/**
	 * Indicates whether users can remove comments.
	 * 
	 * @return
	 */
	public Boolean isCanRemove() {
		return canRemove;
	}

	/**
	 * Indicates whether users can remove comments.
	 * 
	 * @param canRemove
	 */
	public void setCanRemove(Boolean canRemove) {
		this.canRemove = canRemove;
	}

	/**
	 * Indicates whether users can post comments.
	 * 
	 * @return
	 */
	public Boolean isCanPost() {
		return canPost;
	}

	/**
	 * Indicates whether users can post comments.
	 * 
	 * @param canPost
	 */
	public void setCanPost(Boolean canPost) {
		this.canPost = canPost;
	}

	/**
	 * The total number of comments added to the post.
	 * 
	 * @return
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * The total number of comments added to the post.
	 * 
	 * @param count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * A list of comment-type comments for this post. Comments are formatted as
	 * they would be when returned by the comment (FQL) table.
	 * 
	 * @return
	 */
	public List<FqlComment> getCommentList() {
		return commentList;
	}

	/**
	 * A list of comment-type comments for this post. Comments are formatted as
	 * they would be when returned by the comment (FQL) table.
	 * 
	 * @param commentList
	 */
	public void setCommentList(List<FqlComment> commentList) {
		this.commentList = commentList;
	}

}
