package com.face4j.facebook.publish;

import java.util.List;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.Action;
import com.face4j.facebook.entity.Post;
import com.face4j.facebook.entity.Privacy;
import com.face4j.facebook.entity.Targeting;

/**
 * Pass this to {@link Facebook #post()}
 * This class is a stripped down version of {@link Post}
 * @author nischal
 *
 */
public class WallPost {
	
	private String message;
	private String picture;
	private String link;
	private String name;
	private String caption;
	private String description;
	private String source;
	private List<Action> actions;
	private Privacy privacy;
	private Targeting targeting;
	
	/**
	 * @param message The message(Mandatory)
	 */
	public WallPost(String message) {
		super();
		this.message = message;
	}

	/**
	 * If available, a link to the picture included with this post
	 * @return
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * If available, a link to the picture included with this post
	 * @param picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	/**
	 * The link attached to this post
	 * @return
	 */
	public String getLink() {
		return link;
	}

	/**
	 * The link attached to this post
	 * @param link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The name of the link
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * The name of the link
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The caption of the link (appears beneath the link name)
	 * @return
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * The caption of the link (appears beneath the link name)
	 * @param caption
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * A description of the link (appears beneath the link caption)
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * A description of the link (appears beneath the link caption)
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * A URL to a Flash movie or video file to be embedded within the post.
	 * @return
	 */
	public String getSource() {
		return source;
	}

	/**
	 * A URL to a Flash movie or video file to be embedded within the post.
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * A list of available actions on the post (including commenting, liking, and an optional app-specified action)
	 * @return
	 */
	public List<Action> getActions() {
		return actions;
	}

	/**
	 * A list of available actions on the post (including commenting, liking, and an optional app-specified action)
	 * @param actions
	 */
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	/**
	 * The privacy settings of the Post. Publicly accessible. A JSON object containing the value field
	 * and optional friends, networks, allow and deny fields.
	 * 
	 * The value field may specify one of the following JSON strings: EVERYONE, CUSTOM, ALL_FRIENDS,
	 * NETWORKS_FRIENDS, FRIENDS_OF_FRIENDS.
	 * 
	 * The friends field must be specified if value is set to CUSTOM and contain one of the following
	 * JSON strings: EVERYONE, NETWORKS_FRIENDS (when the object can be seen by networks and friends),
	 * FRIENDS_OF_FRIENDS, ALL_FRIENDS, SOME_FRIENDS, SELF, or NO_FRIENDS (when the object can be seen
	 * by a network only).
	 * 
	 * The networks field may contain a comma-separated list of network IDs that can see the object,
	 * or 1 for all of a user's network.
	 * 
	 * The allow field must be specified when the friends value is set to SOME_FRIENDS and must
	 * specify a comma-separated list of user IDs and friend list IDs that 'can' see the post.
	 * 
	 * The deny field may be specified if the friends field is set to SOME_FRIENDS and must specify a
	 * comma-separated list of user IDs and friend list IDs that 'cannot' see the post.
	 * 
	 * Note: This privacy setting only applies to posts to the current or specified user's own Wall.
	 * Facebook ignores this setting for targeted Wall posts (when the user is writing on the Wall of
	 * a friend, Page, event, group connected to the user). Consistent with behavior on Facebook, all
	 * targeted posts are viewable by anyone who can see the target's Wall.
	 * 
	 * Privacy Policy: Any non-default privacy setting must be intentionally chosen by the user. You
	 * may not set a custom privacy setting unless the user has proactively specified that they want
	 * this non-default setting.
	 * 
	 * @return
	 */
	public Privacy getPrivacy() {
		return privacy;
	}

	/**
	 * The privacy settings of the Post. Publicly accessible. A JSON object containing the value field
	 * and optional friends, networks, allow and deny fields.
	 * 
	 * The value field may specify one of the following JSON strings: EVERYONE, CUSTOM, ALL_FRIENDS,
	 * NETWORKS_FRIENDS, FRIENDS_OF_FRIENDS.
	 * 
	 * The friends field must be specified if value is set to CUSTOM and contain one of the following
	 * JSON strings: EVERYONE, NETWORKS_FRIENDS (when the object can be seen by networks and friends),
	 * FRIENDS_OF_FRIENDS, ALL_FRIENDS, SOME_FRIENDS, SELF, or NO_FRIENDS (when the object can be seen
	 * by a network only).
	 * 
	 * The networks field may contain a comma-separated list of network IDs that can see the object,
	 * or 1 for all of a user's network.
	 * 
	 * The allow field must be specified when the friends value is set to SOME_FRIENDS and must
	 * specify a comma-separated list of user IDs and friend list IDs that 'can' see the post.
	 * 
	 * The deny field may be specified if the friends field is set to SOME_FRIENDS and must specify a
	 * comma-separated list of user IDs and friend list IDs that 'cannot' see the post.
	 * 
	 * Note: This privacy setting only applies to posts to the current or specified user's own Wall.
	 * Facebook ignores this setting for targeted Wall posts (when the user is writing on the Wall of
	 * a friend, Page, event, group connected to the user). Consistent with behavior on Facebook, all
	 * targeted posts are viewable by anyone who can see the target's Wall.
	 * 
	 * Privacy Policy: Any non-default privacy setting must be intentionally chosen by the user. You
	 * may not set a custom privacy setting unless the user has proactively specified that they want
	 * this non-default setting.
	 * 
	 * @param privacy
	 */
	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

	/**
	 * Location and language restrictions for Page posts only. manage_pages. A JSON object containing
	 * comma separated lists of valid country , city , region and locale.
	 * 
	 * @return
	 */
	public Targeting getTargeting() {
		return targeting;
	}

	/**
	 * Location and language restrictions for Page posts only. manage_pages. A JSON object containing
	 * comma separated lists of valid country , city , region and locale.
	 * 
	 * @param targeting
	 */
	public void setTargeting(Targeting targeting) {
		this.targeting = targeting;
	}

	/**
	 * The message
	 * @return
	 */
	public String getMessage() {
		return message;
	}
	
	
	

}
