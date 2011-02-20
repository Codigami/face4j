package com.face4j.facebook.fql;

import java.io.Serializable;

public class FqlAlbum implements Serializable {

	private static final long serialVersionUID = -5524527309718264268L;

	private String aid;
	private long owner;
	private String coverPid;
	private String name;
	private String created;
	private String modified;
	private String description;
	private String location;
	private int size;
	private String link;
	private String visible;
	private String modifiedMajor;
	private String editLink;
	private String type;
	private long objectId;
	private boolean canUpload;

	/**
	 * The ID of the album being queried. The aid cannot be longer than 50 characters. <br>
	 * Note: Because the aid is a string, you should always wrap the aid in quotes when referenced in a query. The aid is
	 * unique only for a given user.
	 * 
	 * @return
	 */
	public String getAid() {
		return aid;
	}

	/**
	 * * The ID of the album being queried. The aid cannot be longer than 50 characters. <br>
	 * Note: Because the aid is a string, you should always wrap the aid in quotes when referenced in a query. The aid is
	 * unique only for a given user.
	 * 
	 * @param aid
	 */
	public void setAid(String aid) {
		this.aid = aid;
	}

	/**
	 * The user ID of the owner of the album being queried.
	 * 
	 * @return
	 */
	public long getOwner() {
		return owner;
	}

	/**
	 * The user ID of the owner of the album being queried.
	 * 
	 * @param owner
	 */
	public void setOwner(long owner) {
		this.owner = owner;
	}

	/**
	 * The ID of the photo used as the cover for the album being queried. The cover_pid cannot be longer than 50
	 * characters. <br>
	 * Note: Because the cover_pid is a string, you should always wrap the cover_pid in quotes when referenced in a query.
	 * 
	 * @return
	 */
	public String getCoverPid() {
		return coverPid;
	}

	/**
	 * * The ID of the photo used as the cover for the album being queried. The cover_pid cannot be longer than 50
	 * characters. <br>
	 * Note: Because the cover_pid is a string, you should always wrap the cover_pid in quotes when referenced in a query.
	 * 
	 * @param coverPid
	 */
	public void setCoverPid(String coverPid) {
		this.coverPid = coverPid;
	}

	/**
	 * The name of the album being queried.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * The name of the album being queried.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The date that the album being queried was created.
	 * 
	 * @return
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * The date that the album being queried was created.
	 * 
	 * @param created
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * The date that the album being queried was last updated.
	 * 
	 * @return
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * The date that the album being queried was last updated.
	 * 
	 * @param modified
	 */
	public void setModified(String modified) {
		this.modified = modified;
	}

	/**
	 * The description of the album being queried.
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * The description of the album being queried.
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The location for the album being queried.
	 * 
	 * @return
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * The location for the album being queried.
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * The number of photos in the album being queried.
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * The number of photos in the album being queried.
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * The URL to the album being queried.
	 * 
	 * @return
	 */
	public String getLink() {
		return link;
	}

	/**
	 * The URL to the album being queried.
	 * 
	 * @param link
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * Indicates who can see the album. The value can be one of friends, friends-of-friends, networks, everyone, or custom
	 * (if the visibility doesn't match any of the other values). This information is available only to the album owner.
	 * 
	 * @return
	 */
	public String getVisible() {
		return visible;
	}

	/**
	 * Indicates who can see the album. The value can be one of friends, friends-of-friends, networks, everyone, or custom
	 * (if the visibility doesn't match any of the other values). This information is available only to the album owner.
	 * 
	 * @param visible
	 */
	public void setVisible(String visible) {
		this.visible = visible;
	}

	/**
	 * Indicates the time a major update (like addition of photos) was last made to the album.
	 * 
	 * @return
	 */
	public String getModifiedMajor() {
		return modifiedMajor;
	}

	/**
	 * Indicates the time a major update (like addition of photos) was last made to the album.
	 * 
	 * @param modifiedMajor
	 */
	public void setModifiedMajor(String modifiedMajor) {
		this.modifiedMajor = modifiedMajor;
	}

	/**
	 * The URL for editing the album.
	 * 
	 * @return
	 */
	public String getEditLink() {
		return editLink;
	}

	/**
	 * The URL for editing the album.
	 * 
	 * @param editLink
	 */
	public void setEditLink(String editLink) {
		this.editLink = editLink;
	}

	/**
	 * The type of photo album. Can be one of: profile: The album containing profile pictures mobile: The album containing
	 * mobile upload photos wall The album containing photos posted to a user's Wall normal: For all other albums.
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of photo album. Can be one of: profile: The album containing profile pictures mobile: The album containing
	 * mobile upload photos wall The album containing photos posted to a user's Wall normal: For all other albums.
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * The object_id of the album on Facebook. Use the object_id to let users comment on an album with the Comments API.
	 * 
	 * @return
	 */
	public long getObjectId() {
		return objectId;
	}

	/**
	 * The object_id of the album on Facebook. Use the object_id to let users comment on an album with the Comments API.
	 * 
	 * @param objectId
	 */
	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	/**
	 * Determines whether a given UID can upload to the album. It is true if the following conditions are met: <br>
	 * <li>The user owns the album.</li> <br>
	 * <li>The album is not a special album like the profile pic album.</li> <br>
	 * <li>The album is not full.</li>
	 * 
	 * @return
	 */
	public boolean isCanUpload() {
		return canUpload;
	}

	/**
	 * Determines whether a given UID can upload to the album. It is true if the following conditions are met: <br>
	 * <li>The user owns the album.</li> <br>
	 * <li>The album is not a special album like the profile pic album.</li> <br>
	 * <li>The album is not full.</li>
	 * 
	 * @param canUpload
	 */
	public void setCanUpload(boolean canUpload) {
		this.canUpload = canUpload;
	}

}
