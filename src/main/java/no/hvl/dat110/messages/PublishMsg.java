package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	private String topic;
	private String message;

	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text

	// Getter for the topic
	public String getTopic() {
		return topic;
	}

	// Setter for the topic
	public void setTopic(String topic) {
		this.topic = topic;
	}


	// Getter for the message
	public String getMessage() {
		
		return message;
	}

	// Setter for the message
	public void setMessage(String message) {
		this.message = message;
		
	}

	// toString method
	@Override
	public String toString() {
		return super.toString() + " PublishMsg [topic=" + topic + ", message=" + message + "]";
	}

}

