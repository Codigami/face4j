package com.face4j.facebook.wrapper;

import com.face4j.facebook.enums.StreamColumn;

public class StreamColumnCriteria {

	private static final String isHidden = "is_hidden";

	private String postId;
	private Integer viewerId;
	private Integer appId;
	private Integer sourceId;
	private Long updatedTimeGreaterThan;
	private Long createdTimeGreaterThan;
	private Long updatedTimeLessThan;
	private Long createdTimeLessThan;
	private String filterKey;
	private String attribution;
	private String actorId;
	private String targetId;
	private Integer xid;
	private boolean isDefaultXid;
	private Integer limit;
	private boolean isShowHidden;
	

	public String getPostId() {
		return postId;
	}

	/**
	 * The ID of the post from the user's stream. This field, when used as an index, is primarily used to re-retrieve
	 * posts. Otherwise, it is used to specify a post when using any of the stream setters.
	 * 
	 * @param postId
	 */
	public void setPostId(String postId) {
		this.postId = postId;
	}

	public Integer getViewerId() {
		return viewerId;
	}

	/**
	 * The ID of the user whose stream you are querying. The viewer_id defaults to the active session key.
	 * 
	 * @param viewerId
	 */
	public void setViewerId(Integer viewerId) {
		this.viewerId = viewerId;
	}

	public Integer getAppId() {
		return appId;
	}

	/**
	 * The application ID for the application through which the post was published. This includes application IDs for
	 * Facebook applications like Photos and Video.
	 * 
	 * @param appId
	 */
	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getSourceId() {
		return sourceId;
	}

	/**
	 * The ID of the user, Page, group, or event whose posts you want to retrieve. This includes both posts that the user
	 * or Page has authored (that is, the actor_id is the source_id) and posts that have been directed at this target
	 * user, Page, group, or event (that is, the target_id is the source_id).
	 * 
	 * @param sourceId
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	public Long getUpdatedTimeGreaterThan() {
		return updatedTimeGreaterThan;
	}

	/**
	 * The time the post was last updated, which occurs when a user comments on the post.
	 * 
	 * @param updatedTimeGreaterThan
	 */
	public void setUpdatedTimeGreaterThan(Long updatedTimeGreaterThan) {
		this.updatedTimeGreaterThan = updatedTimeGreaterThan;
	}

	public Long getCreatedTimeGreaterThan() {
		return createdTimeGreaterThan;
	}

	/**
	 * The time the post was published to the user's stream.
	 * 
	 * @param createdTimeGreaterThan
	 */
	public void setCreatedTimeGreaterThan(Long createdTimeGreaterThan) {
		this.createdTimeGreaterThan = createdTimeGreaterThan;
	}

	public String getFilterKey() {
		return filterKey;
	}

	/**
	 * The filter key to fetch data with. This key should be retrieved from stream.getFilters or querying the
	 * stream_filter FQL table.
	 * 
	 * @param filterKey
	 */
	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}

	public String getAttribution() {
		return attribution;
	}

	/**
	 * For posts published by applications, this is the string that states through which application the post was
	 * published. For example, "Joe loves the Social Web (by MicroBloggerApp)."
	 * 
	 * @param attribution
	 */
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

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

	public Integer getXid() {
		return xid;
	}

	/**
	 * When querying for the feed of a live stream box, this is the xid associated with the Live Stream box
	 * 
	 * @param xid
	 */
	public void setXid(Integer xid) {
		this.xid = xid;
	}

	public boolean isDefaultXid() {
		return isDefaultXid;
	}

	/**
	 * If xid is not available set this as true and it will set the xid as default.
	 * 
	 * @param isDefaultXid
	 */
	public void setDefaultXid(boolean isDefaultXid) {
		this.isDefaultXid = isDefaultXid;
	}

	public Long getUpdatedTimeLessThan() {
		return updatedTimeLessThan;
	}

	public void setUpdatedTimeLessThan(Long updatedTimeLessThan) {
		this.updatedTimeLessThan = updatedTimeLessThan;
	}

	public Long getCreatedTimeLessThan() {
		return createdTimeLessThan;
	}

	public void setCreatedTimeLessThan(Long createdTimeLessThan) {
		this.createdTimeLessThan = createdTimeLessThan;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public boolean isShowHidden() {
		return isShowHidden;
	}

	public void setShowHidden(boolean isShowHidden) {
		this.isShowHidden = isShowHidden;
	}

	@Override
	public String toString() {
		
		StringBuilder criteria = new StringBuilder();

			if (this.isDefaultXid()) {
				criteria.append(" AND " + StreamColumn.XID.toString() + " = 'default'");
			} else if (this.getXid() != null) {
				criteria.append(" AND " + StreamColumn.XID.toString() + " = " + this.getXid());
			}

			if (this.getActorId() != null) {
				criteria.append(" AND " + StreamColumn.ACTOR_ID.toString() + " = '" + this.getActorId() + "'");
			}

			if (this.getAppId() != null) {
				criteria.append(" AND " + StreamColumn.APP_ID.toString() + " = " + this.getAppId());
			}

			if (this.getAttribution() != null) {
				criteria.append(" AND " + StreamColumn.ATTRIBUTION.toString() + " = '" + this.getAttribution() + "'");
			}

			if (this.getCreatedTimeGreaterThan() != null) {
				criteria.append(" AND " + StreamColumn.CREATED_TIME.toString() + " > "
						+ this.getCreatedTimeGreaterThan());
			}

			if (this.getCreatedTimeLessThan() != null) {
				criteria.append(" AND " + StreamColumn.CREATED_TIME.toString() + " < "
						+ this.getCreatedTimeLessThan());
			}

			if (this.getFilterKey() != null) {
				criteria.append(" AND " + StreamColumn.FILTER_KEY.toString() + " = '" + this.getFilterKey() + "'");
			}

			if (this.getPostId() != null) {
				criteria.append(" AND " + StreamColumn.POST_ID.toString() + " = '" + this.getPostId() + "'");
			}

			if (this.getSourceId() != null) {
				criteria.append(" AND " + StreamColumn.SOURCE_ID.toString() + " = " + this.getSourceId());
			}

			if (this.getTargetId() != null) {
				criteria.append(" AND " + StreamColumn.TARGET_ID.toString() + " = '" + this.getTargetId() + "'");
			}

			if (this.getUpdatedTimeGreaterThan() != null) {
				criteria.append(" AND " + StreamColumn.UPDATED_TIME.toString() + " > "
						+ this.getUpdatedTimeGreaterThan());
			}

			if (this.getUpdatedTimeLessThan() != null) {
				criteria.append(" AND " + StreamColumn.UPDATED_TIME.toString() + " < "
						+ this.getUpdatedTimeLessThan());
			}

			if (this.getViewerId() != null) {
				criteria.append(" AND " + StreamColumn.VIEWER_ID.toString() + " = " + this.getViewerId());
			}

			// We will always be passing this param
			// TODO: Do we need to always set this?
			if (this.isShowHidden()) {
				criteria.append(" AND " + isHidden + " = 0 ");
			} else {
				// criteria.append(" AND " + isHidden + " = 1 ");
			}

			// This should be in the end
			if (this.getLimit() != null) {
				criteria.append(" LIMIT " + this.getLimit());
			}

		return criteria.toString();
	}
	
}
