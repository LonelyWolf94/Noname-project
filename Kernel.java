import java.util.ArrayList;

public class Kernel{
	public static User currentUser = null;
	
	public void initial(){
		User user1 = new User("artem","7");
		User user2 = new User("oleksiy", "5678");
		User user3 = new User("vanya", "1");
		Users.addUser(user1);
		Users.addUser(user2);
		Users.addUser(user3);
	}
	public boolean login(String name, String password){
		boolean result = false;		
		for(User user : Users.users){		
			if(user.getName().equals(name)){
				if(user.getPassword().equals(password)){
					currentUser = user;
					result = true;
					break;
				} 			
			}
		}
		
		if(result){
			System.out.println("Welcome " + currentUser.getName() + ".");
		} else {
			System.out.println("Invalid user name or password.");
		}
		
		return result;
	}
}