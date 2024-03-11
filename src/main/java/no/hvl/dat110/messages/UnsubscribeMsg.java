package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 
	private String topic;

    public UnsubscribeMsg(String user, String topic) {
		super(MessageType.UNSUBSCRIBE, user);
		this.topic = topic;

    }

	// TODO:
	// Implement object variables - a topic is required

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

	// toString method
	@Override
	public String toString() {
		return super.toString() + " UnsubscribeMsg [topic=" + topic + "]";
	}
	
}
