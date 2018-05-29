public class Message{
	User userSender;
	User userReciever;
	String message;
	
	public Message(User userSender, User userReciever, String message){
		this.userSender = userSender;
		this.userReciever = userReciever;
		this.message = message;
	}
	
	@Override
	public String toString(){
		String string = new String();
		return string + "Message from " + userSender.getName() +
		" to " + userReciever.getName() + " \n" +
		message;
	}
}