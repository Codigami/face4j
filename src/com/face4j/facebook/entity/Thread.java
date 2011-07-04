package com.face4j.facebook.entity;

import java.io.Serializable;

public class Thread implements Serializable {

	private static final long serialVersionUID = -5804257226308284578L;

	private String id;
	private String snippet;
	private String updatedTime;
	private Integer messageCount;
	private Integer unreadCount;
	private GenericEntity[] tags;
	private Participant[] participants;
	private Participant[] formerParticipants;
	private Participant[] senders;
	private Message[] messages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Integer getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}

	public Integer getUnreadCount() {
		return unreadCount;
	}

	public void setUnreadCount(Integer unreadCount) {
		this.unreadCount = unreadCount;
	}

	public GenericEntity[] getTags() {
		return tags;
	}

	public void setTags(GenericEntity[] tags) {
		this.tags = tags;
	}

	public Participant[] getParticipants() {
		return participants;
	}

	public void setParticipants(Participant[] participants) {
		this.participants = participants;
	}

	public Participant[] getFormerParticipants() {
		return formerParticipants;
	}

	public void setFormerParticipants(Participant[] formerParticipants) {
		this.formerParticipants = formerParticipants;
	}

	public Participant[] getSenders() {
		return senders;
	}

	public void setSenders(Participant[] senders) {
		this.senders = senders;
	}

	public Message[] getMessages() {
		return messages;
	}

	public void setMessages(Message[] messages) {
		this.messages = messages;
	}

	//TODO: Connections - tags
	//TODO: Connections - participants
	//TODO: Connections - formerParticipants
	//TODO: Connections - senders
	//TODO: Connections - messages
	
}
