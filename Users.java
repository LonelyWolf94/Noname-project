import java.util.ArrayList;

public class Users{
	static ArrayList<User> myUsers = new ArrayList<User>();
	
	public void showUsers(){
		for(int i = 0; i < myUsers.size(); i++){
			System.out.println(i+1 + ") " + myUsers.get(i).getName());
		}
		System.out.println("Total number: " + myUsers.size());
	}	
}