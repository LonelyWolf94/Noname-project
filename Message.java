public class Message{
	User fromUser;
	User toUser;
	String message;
	
	public Message(User fromUser, User toUser, String message){
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.message = message;
	}
	
	@Override
	public String toString(){
		String string = new String();
		return string + "Message from " + fromUser.getName() +
		" to " + toUser.getName() + " \n" +
		message;
	}
}