import java.util.ArrayList;

public class Kernel{
	public static User currentUser = null;
	
	public void initial(){
		User user1 = new User("artem","7");
		User user2 = new User("oleksiy", "5678");
		Users.addUser(user1);
		Users.addUser(user2);
	}
	public boolean login(String name, String password){
		boolean result = false;
		for(User user : Users.users){
			if(user.getName().equals(name)){
				if(user.getPassword().equals(password)){
					currentUser = user;
					result = true;
				} else {
					System.out.println("Invalid password");
				}
			} else {
				System.out.println("Invalid name of user");
			}
		}
		
		if(result){
			System.out.println("Welcome " + currentUser.getName() + ".");
		}
		
		return result;
	}
}