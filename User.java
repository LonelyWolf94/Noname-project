import java.util.ArrayList;

public class User{
	private String name;
	private String password;
	private ArrayList<Message> outMessages = new ArrayList<Message>();
	private ArrayList<Message> inMessages = new ArrayList<Message>();
	
	public User(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString(){
		return "" + this.name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void createMessage(String strUserReciever, String message){
		User userReciever = validateUserFromString(strUserReciever);
		if(userReciever == null){
			System.out.println("Invalid user reciever.");
		} else {
			Message newMessage = new Message(this, userReciever, message);
			outMessages.add(newMessage);
			System.out.println("Message was created.");
		}
	}
	
	private static User validateUserFromString(String strUser){
		User user = null;
		for(User tempUser : Users.users){
			if(tempUser.getName().equals(strUser)){
				user = tempUser;
			}
		}
		
		return user;
	}
	
	public void showAllOutMessages(){
		if(outMessages.size() == 0){
			System.out.println("There is no messages.");
		} else {
			for(Message outMessage: outMessages){
				System.out.println(outMessage);
			}
		}
	}
}

