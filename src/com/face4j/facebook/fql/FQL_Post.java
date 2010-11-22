package com.face4j.facebook.fql;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FQL_Post implements Serializable {

	private static final long serialVersionUID = 6550520319195729998L;

	private String postId;
	private Integer viewerId;
	private Integer appId;
	private Integer sourceId;
	private Date updatedTime;
	private Date createdTime;
	private String filterKey;
	private String attribution;
	private String actorId;
	private String targetId;
	private String message;
	private Integer type;
	private List<FQL_ActionLink> actionLinks;
	private FQL_Attachment attachment;
	private FQL_Comments comments;
	private FQL_Likes likes;
	private FQL_Privacy privacy;
	private List<Long> taggedIds;
	private Boolean isHidden;
	private String permalink;

	// TODO: private FQL_AppData appData;

	/**
	 * The ID of the post from the user's stream. This field, when used as an
	 * index, is primarily used to re-retrieve posts. Otherwise, it is used to
	 * specify a post when using any of the stream setters.
	 * 
	 * @return postId
	 */
	public String getPostId() {
		return postId;
	}

	/**
	 * The ID of the post from the user's stream. This field, when used as an
	 * index, is primarily used to re-retrieve posts. Otherwise, it is used to
	 * specify a post when using any of the stream setters.
	 * 
	 * @param postId
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}

	/**
	 * The ID of the user whose stream you are querying. The viewer_id defaults
	 * to the active session key.
	 * 
	 * @return
	 */
	public Integer getViewerId() {
		return viewerId;
	}

	/**
	 * The ID of the user whose stream you are querying. The viewer_id defaults
	 * to the active session key.
	 * 
	 * @param viewerId
	 */
	public void setViewerId(Integer viewerId) {
		this.viewerId = viewerId;
	}

	/**
	 * The application ID for the application through which the post was
	 * published. This includes application IDs for Facebook applications like
	 * Photos and Video.
	 * 
	 * @return
	 */
	public Integer getAppId() {
		return appId;
	}

	/**
	 * The application ID for the application through which the post was
	 * published. This includes application IDs for Facebook applications like
	 * Photos and Video.
	 * 
	 * @param appId
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	/**
	 * The ID of the user, Page, group, or event whose posts you want to
	 * retrieve. This includes both posts that the user or Page has authored
	 * (that is, the actor_id is the source_id) and posts that have been
	 * directed at this target user, Page, group, or event (that is, the
	 * target_id is the source_id).
	 * 
	 * @return
	 */
	public Integer getSourceId() {
		return sourceId;
	}

	/**
	 * The ID of the user, Page, group, or event whose posts you want to
	 * retrieve. This includes both posts that the user or Page has authored
	 * (that is, the actor_id is the source_id) and posts that have been
	 * directed at this target user, Page, group, or event (that is, the
	 * target_id is the source_id).
	 * 
	 * @param sourceId
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	/**
	 * The time the post was last updated, which occurs when a user comments on
	 * the post.
	 * 
	 * @return
	 */
	public Date getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * The time the post was last updated, which occurs when a user comments on
	 * the post.
	 * 
	 * @param updatedTime
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The time the post was published to the user's stream.
	 * 
	 * @return
	 */
	public Date getCreatedTime() {
		return createdTime;
	}

	/**
	 * The time the post was published to the user's stream.
	 * 
	 * @param createdTime
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The filter key to fetch data with. This key should be retrieved from
	 * stream.getFilters or querying the stream_filter FQL table.
	 * 
	 * @return
	 */
	public String getFilterKey() {
		return filterKey;
	}

	/**
	 * The filter key to fetch data with. This key should be retrieved from
	 * stream.getFilters or querying the stream_filter FQL table.
	 * 
	 * @param filterKey
	 */
	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	/**
	 * For posts published by applications, this is the string that states
	 * through which application the post was published. For example,
	 * "Joe loves the Social Web (by MicroBloggerApp)."
	 * 
	 * @return
	 */
	public String getAttribution() {
		return attribution;
	}

	/**
	 * For posts published by applications, this is the string that states
	 * through which application the post was published. For example,
	 * "Joe loves the Social Web (by MicroBloggerApp)."
	 * 
	 * @param attribution
	 */
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	/**
	 * The user ID of the person who is the user taking the action in the post.
	 * 
	 * @return
	 */
	public String getActorId() {
		return actorId;
	}

	/**
	 * The user ID of the person who is the user taking the action in the post.
	 * 
	 * @param actorId
	 */
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	/**
	 * The user or Page to whom the post was directed.
	 * 
	 * @return
	 */
	public String getTargetId() {
		return targetId;
	}

	/**
	 * The user or Page to whom the post was directed.
	 * 
	 * @param targetId
	 */
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	/**
	 * The message written by the user.
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * The message written by the user.
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Do not use this field as it's been deprecated. To determine what sort of
	 * post gets returned, look for the presence of an attachment (lack of an
	 * attachment indicates a status update), and if one is present, look at the
	 * attachment's media type (photo, Flash, mp3) to determine how you want to
	 * handle the post. Facebook for Adobe AIR uses this method, for example.
	 * 
	 * @return
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * Do not use this field as it's been deprecated. To determine what sort of
	 * post gets returned, look for the presence of an attachment (lack of an
	 * attachment indicates a status update), and if one is present, look at the
	 * attachment's media type (photo, Flash, mp3) to determine how you want to
	 * handle the post. Facebook for Adobe AIR uses this method, for example.
	 * 
	 * @param type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * List containing {@link FQL_ActionLink} which consists of the text and URL
	 * for each action link.
	 * 
	 * @return
	 */
	public List<FQL_ActionLink> getActionLinks() {
		return actionLinks;
	}

	/**
	 * List containing {@link FQL_ActionLink} which consists of the text and URL
	 * for each action link.
	 * 
	 * @param actionLinks
	 */
	public void setActionLinks(List<FQL_ActionLink> actionLinks) {
		this.actionLinks = actionLinks;
	}

	/**
	 * {@link FQL_Attachment} that contains information about the attachment to
	 * the post. This is the attachment that Facebook returns.
	 * 
	 * @return
	 */
	public FQL_Attachment getAttachment() {
		return attachment;
	}

	/**
	 * {@link FQL_Attachment} that contains information about the attachment to
	 * the post. This is the attachment that Facebook returns.
	 * 
	 * @param attachment
	 */
	public void setAttachment(FQL_Attachment attachment) {
		this.attachment = attachment;
	}

	/**
	 * {@link FQL_Comments} added to a post. This contains up to two comments to
	 * display along with stream content. To get the full list of comments, use
	 * stream.getComments or query the comment FQL table using the post_id of
	 * this post. {@link FQL_Comments} contains the following fields:
	 * 
	 * <ul>
	 * <li>canRemove (bool): Indicates whether users can remove comments.
	 * <li>canPost (bool): Indicates whether users can post comments.
	 * <li>count (i32): The total number of comments added to the post.
	 * <li>commentList (List of {@link FQL_Comment}): A list of comment-type
	 * comments for this post. Comments are formatted as they would be when
	 * returned by the comment (FQL) table.
	 * </ul>
	 * 
	 * @return
	 */
	public FQL_Comments getComments() {
		return comments;
	}

	/**
	 * {@link FQL_Comments} added to a post. This contains up to two comments to
	 * display along with stream content. To get the full list of comments, use
	 * stream.getComments or query the comment FQL table using the post_id of
	 * this post. {@link FQL_Comments} contains the following fields:
	 * 
	 * <ul>
	 * <li>canRemove (bool): Indicates whether users can remove comments.
	 * <li>canPost (bool): Indicates whether users can post comments.
	 * <li>count (i32): The total number of comments added to the post.
	 * <li>commentList (List of {@link FQL_Comment}): A list of comment-type
	 * comments for this post. Comments are formatted as they would be when
	 * returned by the comment (FQL) table.
	 * </ul>
	 * 
	 * @param comments
	 */
	public void setComments(FQL_Comments comments) {
		this.comments = comments;
	}

	/**
	 * Likes associated with the post. Contains the following fields:
	 * 
	 * <ul>
	 * <li>href (string): The URL to a page showing the other users who've liked
	 * this post.
	 * <li>count (Integer): The total number of times users like the post.
	 * <li>sample (List<Long>): A sample of users who like the post.
	 * <li>friends (List<Long>): A list of the viewing user's friends who like
	 * the post.
	 * <li>user_likes (Boolean): Indicates whether the viewing user likes the
	 * post.
	 * <li>can_like (Boolean): Indicates whether the post can be liked.
	 * 
	 * @return
	 */
	public FQL_Likes getLikes() {
		return likes;
	}

	/**
	 * Likes associated with the post. Contains the following fields:
	 * 
	 * <ul>
	 * <li>href (string): The URL to a page showing the other users who've liked
	 * this post. count (Integer): The total number of times users like the
	 * post.
	 * <li>sample (List<Long>): A sample of users who like the post.
	 * <li>friends (List<Long>): A list of the viewing user's friends who like
	 * the post.
	 * <li>user_likes (Boolean): Indicates whether the viewing user likes the
	 * post.
	 * <li>can_like (Boolean): Indicates whether the post can be liked.
	 * </ul>
	 * 
	 * @param likes
	 */
	public void setLikes(FQL_Likes likes) {
		this.likes = likes;
	}

	/**
	 * The privacy setting for a post, indicating which of a user's friends or
	 * others can see the content.
	 * 
	 * @return
	 */
	public FQL_Privacy getPrivacy() {
		return privacy;
	}

	/**
	 * The privacy setting for a post, indicating which of a user's friends or
	 * others can see the content.
	 * 
	 * @param privacy
	 */
	public void setPrivacy(FQL_Privacy privacy) {
		this.privacy = privacy;
	}

	public List<Long> getTaggedIds() {
		return taggedIds;
	}

	public void setTaggedIds(List<Long> taggedIds) {
		this.taggedIds = taggedIds;
	}

	public Boolean getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	/**
	 * A link to the stream post.
	 * 
	 * @return
	 */
	public String getPermalink() {
		return permalink;
	}

	/**
	 * A link to the stream post.
	 * 
	 * @param permalink
	 */
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	/**
	 * An array of application-specific information supplied to Facebook to
	 * create the attachment to the post. This information is not needed to
	 * render a user's stream in your application, unless you need this
	 * information for special handing of your own application posts. This array
	 * includes:
	 * 
	 * <ul>
	 * <li>tbid (i64): A 64-bit int representing the template bundle ID, for
	 * posts that entered the stream through the now discontinued method
	 * feed.publishUserAction and similar calls that are not stream publishing
	 * methods (like stream.publish or Facebook.streamPublish).
	 * <li>attachment_data (array): An array containing the template data, for
	 * posts that entered the stream through the now discontinued method
	 * feed.publishUserAction and similar calls that are not stream publishing
	 * methods (like stream.publish or Facebook.streamPublish).
	 * <li>images (array): A JSON-encoded object containing any images
	 * associated with the story. These images are specified in Attachment
	 * (Streams) (and used to be specified in Template Data, if an application
	 * used a now discontinued method like feed.publishUserAction to create the
	 * post originally).
	 * <li>action_links (array): An array containing the text and URL for each
	 * action link.
	 * </ul>
	 * 
	 * @return
	 */
	/*
	 * public FQL_AppData getAppData() { return appData; }
	 */

	/**
	 * An array of application-specific information supplied to Facebook to
	 * create the attachment to the post. This information is not needed to
	 * render a user's stream in your application, unless you need this
	 * information for special handing of your own application posts. This array
	 * includes:
	 * 
	 * <ul>
	 * <li>tbid (i64): A 64-bit int representing the template bundle ID, for
	 * posts that entered the stream through the now discontinued method
	 * feed.publishUserAction and similar calls that are not stream publishing
	 * methods (like stream.publish or Facebook.streamPublish).
	 * <li>attachment_data (array): An array containing the template data, for
	 * posts that entered the stream through the now discontinued method
	 * feed.publishUserAction and similar calls that are not stream publishing
	 * methods (like stream.publish or Facebook.streamPublish).
	 * <li>images (array): A JSON-encoded object containing any images
	 * associated with the story. These images are specified in Attachment
	 * (Streams) (and used to be specified in Template Data, if an application
	 * used a now discontinued method like feed.publishUserAction to create the
	 * post originally).
	 * <li>action_links (array): An array containing the text and URL for each
	 * action link.
	 * </ul>
	 * 
	 * @param appData
	 */
	/*
	 * public void setAppData(FQL_AppData appData) { this.appData = appData; }
	 */

}
