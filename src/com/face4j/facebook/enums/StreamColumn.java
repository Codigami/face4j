package com.face4j.facebook.enums;

public enum StreamColumn {
	/**
	 * The ID of the post from the user's stream. This field, when used as an index, is primarily used to re-retrieve
	 * posts. Otherwise, it is used to specify a post when using any of the stream setters.
	 */
	POST_ID("post_id"),

	/**
	 * The ID of the user whose stream you are querying. The viewer_id defaults to the active session key.
	 */
	VIEWER_ID("viewer_id"),

	/**
	 * The application ID for the application through which the post was published. This includes application IDs for
	 * Facebook applications like Photos and Video.
	 */
	APP_ID("app_id"),

	/**
	 * The ID of the user, Page, group, or event whose posts you want to retrieve. This includes both posts that the user
	 * or Page has authored (that is, the actor_id is the source_id) and posts that have been directed at this target
	 * user, Page, group, or event (that is, the target_id is the source_id).
	 */
	SOURCE_ID("source_id"),

	/**
	 * The time the post was last updated, which occurs when a user comments on the post.
	 */
	UPDATED_TIME("updated_time"),

	/**
	 * The time the post was published to the user's stream.
	 */
	CREATED_TIME("created_time"),

	/**
	 * The filter key to fetch data with. This key should be retrieved from stream.getFilters or querying the
	 * stream_filter FQL table.
	 */
	FILTER_KEY("filter_key"),

	/**
	 * For posts published by applications, this is the string that states through which application the post was
	 * published. For example, "Joe loves the Social Web (by MicroBloggerApp)."
	 */
	ATTRIBUTION("attribution"),

	/**
	 * The user ID of the person who is the user taking the action in the post.
	 */
	ACTOR_ID("actor_id"),

	/**
	 * The user or Page to whom the post was directed.
	 */
	TARGET_ID("target_id"),

	/**
	 * The message written by the user.
	 */
	MESSAGE("message"),

	/**
	 * An array of application-specific information supplied to Facebook to create the attachment to the post.
	 */
	APP_DATA("app_data"),

	/**
	 * An array containing the text and URL for each action link.
	 */
	ACTION_LINKS("action_links"),

	/**
	 * An array of information about the attachment to the post. This is the attachment that Facebook returns.
	 */
	ATTACHMENT("attachment"),

	/**
	 * A sample array of comments added to a post. This list contains up to two comments to display along with stream
	 * content. To get the full list of comments, use stream.getComments or query the comment FQL table using the post_id
	 * of this post. The array contains the following fields:
	 * <ul>
	 * <li>can_remove (bool): Indicates whether users can remove comments. can_post
	 * <li>(bool): Indicates whether users can post comments.
	 * <li>count (i32): The total number of comments added to the post.
	 * <li>comment_list (array): A list of comment-type comments for this post. Comments are formatted as they would be
	 * when returned by the comment (FQL) table.
	 * </ul>
	 */
	COMMENTS("comments"),

	/**
	 * An array of likes associated with the post. The array contains the following fields:
	 * <ul>
	 * <li>href (string): The URL to a page showing the other users who've liked this post.
	 * <li>count (i32): The total number of times users like the post.
	 * <li>sample (array): A sample of users who like the post.
	 * <li>friends (array): A list of the viewing user's friends who like the post.
	 * <li>user_likes (bool): Indicates whether the viewing user likes the post.
	 * <li>can_like (bool): Indicates whether the post can be liked.
	 * </ul>
	 */
	LIKES("likes"),

	/**
	 * The privacy setting for a post, indicating which of a user's friends or others can see the content.
	 */
	PRIVACY("privacy"),

	/**
	 * Do not use this field as it's been deprecated. To determine what sort of post gets returned, look for the presence
	 * of an attachment (lack of an attachment indicates a status update), and if one is present, look at the attachment's
	 * media type (photo, Flash, mp3) to determine how you want to handle the post. Facebook for Adobe AIR uses this
	 * method, for example.
	 */
	TYPE("type"),

	/**
	 * A link to the stream post.
	 */
	PERMALINK("permalink"),

	/**
	 * When querying for the feed of a live stream box, this is the xid associated with the Live Stream box (you can
	 * provide 'default' if one is not available).
	 */
	XID("xid");

	private String columnName;

	private StreamColumn(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return this.columnName;
	}

}
