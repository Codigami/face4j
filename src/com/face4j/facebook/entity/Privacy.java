package com.face4j.facebook.entity;

import java.io.Serializable;

import com.face4j.facebook.enums.Friends;
import com.face4j.facebook.enums.Value;

/**
 * This privacy setting only applies to posts to the current or specified user's own Wall. 
 * Facebook ignores this setting for targeted Wall posts (when the user is writing on the Wall of a friend, Page, event, group 
 * connected to the user). Consistent with behavior on Facebook, all targeted posts are viewable by anyone who can see the target's Wall. 
 * @author nischal
 *
 */
public class Privacy implements Serializable{

	private static final long serialVersionUID = 7258483404711070333L;
	
	private Value value;
	private Friends friends;
	private String networks;
	private String allow;
	private String deny;
	
	/**
	 * The value field may specify one of the following JSON strings: EVERYONE, CUSTOM, ALL_FRIENDS, NETWORKS_FRIENDS, FRIENDS_OF_FRIENDS.
	 * @return
	 */
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	
	/**
	 * The friends field must be specified if value is set to CUSTOM and 
	 * contain one of the following JSON strings: EVERYONE, NETWORKS_FRIENDS (when the object can be seen by networks and friends), 
	 * FRIENDS_OF_FRIENDS, ALL_FRIENDS, SOME_FRIENDS, SELF, or NO_FRIENDS (when the object can be seen by a network only).
	 * @return
	 */
	public Friends getFriends() {
		return friends;
	}
	public void setFriends(Friends friends) {
		this.friends = friends;
	}
	
	/**
	 * The networks field may contain a comma-separated list of network IDs that can see the object, or 1 for all of a user's network.
	 * @return
	 */
	public String getNetworks() {
		return networks;
	}
	public void setNetworks(String networks) {
		this.networks = networks;
	}
	
	/**
	 * The allow field must be specified when the friends value is set to SOME_FRIENDS and 
	 * must specify a comma-separated list of user IDs and friend list IDs that 'can' see the post.
	 * @return
	 */
	public String getAllow() {
		return allow;
	}
	public void setAllow(String allow) {
		this.allow = allow;
	}
	
	/**
	 * The deny field may be specified if the friends field is set to SOME_FRIENDS and must specify a comma-separated list of user IDs and 
	 * friend list IDs that 'cannot' see the post.
	 * @return
	 */
	public String getDeny() {
		return deny;
	}
	public void setDeny(String deny) {
		this.deny = deny;
	}
	
}