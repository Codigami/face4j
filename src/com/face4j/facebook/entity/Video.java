package com.face4j.facebook.entity;

import java.io.Serializable;

/**
 * An individual Video in the Graph API.
 * 
 * To read a Video, issue an HTTP GET request to /VIDEO_ID. You will need the user_videos permission
 * to perform this operation.
 * 
 * The User, Application, and Page objects have a videos connection. We support the following
 * formats for uploading videos to these connections:
 * <ul>
 * <li>3g2 (Mobile Video)</li>
 * <li>3gp (Mobile Video)</li>
 * <li>3gpp (Mobile Video)</li>
 * <li>asf (Windows Media Video)</li>
 * <li>avi (AVI Video)</li>
 * <li>dat (MPEG Video)</li>
 * <li>divx (DIVX Video)</li>
 * <li>dv (DV Video)</li>
 * <li>f4v (Flash Video)</li>
 * <li>flv (Flash Video)</li>
 * <li>m2ts (M2TS Video)</li>
 * <li>m4v (MPEG-4 Video)</li>
 * <li>mkv (Matroska Format)</li>
 * <li>mod (MOD Video)</li>
 * <li>mov (QuickTime Movie)</li>
 * <li>mp4 (MPEG-4 Video)</li>
 * <li>mpe (MPEG Video)</li>
 * <li>mpeg (MPEG Video)</li>
 * <li>mpeg4 (MPEG-4 Video)</li>
 * <li>mpg (MPEG Video)</li>
 * <li>mts (AVCHD Video)</li>
 * <li>nsv (Nullsoft Video)</li>
 * <li>ogm (Ogg Media Format)</li>
 * <li>ogv (Ogg Video Format)</li>
 * <li>qt (QuickTime Movie)</li>
 * <li>tod (TOD Video)</li>
 * <li>ts (MPEG Transport Stream)</li>
 * <li>vob (DVD Video)</li>
 * <li>wmv (Windows Media Video)</li>
 * </ul>
 * The aspect ratio of the video must be between 9x16 and 16x9, and the video cannot exceed 1024MB
 * or 180 minutes in length.
 * 
 * @author nischal
 * 
 */
public class Video implements Serializable {

	private static final long serialVersionUID = 1049597554515895302L;

	private String id;
	private From from;
	private Tag[] tags;
	private String name;
	private String description;
	private String picture;
	private String embedHtml;
	private String icon;
	private String source;
	private String createdTime;
	private String updatedTime;
	private Comment[] comments;

	/**
	 * The video ID
	 * 
	 * PERMISSION: user_videos
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The profile (user or page) that created the video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public From getFrom() {
		return from;
	}

	public void setFrom(From from) {
		this.from = from;
	}

	/**
	 * The users who are tagged in this video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	/**
	 * The video title or caption
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The html element that may be embedded in an Web page to play the video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getEmbedHtml() {
		return embedHtml;
	}

	public void setEmbedHtml(String embedHtml) {
		this.embedHtml = embedHtml;
	}

	/**
	 * The icon that Facebook displays when video are published to the Feed
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * A URL to the raw, playable video file
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * The time the video was initially published
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return string containing a IETF RFC 3339 datetime
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * The last time the video or its caption were updated
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return string containing a IETF RFC 3339 datetime
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * All of the comments on this video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public Comment[] getComments() {
		return comments;
	}

	/**
	 * The URL for the thumbnail picture for the video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * The description of the video
	 * 
	 * PERMISSION: user_videos 
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	
	//TODO: Connection - likes
	//TODO: Connection - comments
	//TODO: Connection - picture

}
