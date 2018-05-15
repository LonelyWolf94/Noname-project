import java.util.ArrayList;

public class Users{
	private ArrayList<Message> messages = new ArrayList<Message>();
	public static ArrayList<User> users = new ArrayList<User>();
	
	public static void addUser(User user){
		users.add(user);
	}
	
	public void createMessage(){
		
	}
	
	public static void showUsers(){
		for(int i = 0; i < users.size(); i++){
			System.out.println(i+1 + ") " + users.get(i).getName());
		}
		System.out.println("Total number: " + users.size());
	}	
}