import java.io.*;

public class Start{
	public static Users users = new Users();
	
	public static void main(String[] args){
		Start start = new Start();
		start.init();
		
		
		System.out.println("Welcome to my program!");
		byte numberOfCommand = 0;
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		
		while(numberOfCommand >= 0){
			try{
				String command = buffReader.readLine();
				numberOfCommand = getNumberOfCommand(command);
				doCommand(numberOfCommand);
			} catch (IOException ex){
				System.out.println("Something went wrong!");
				ex.printStackTrace();
			}			
		}
	}
	
	private static void doCommand(byte command){
		switch(command){
			case -1:
				System.out.println("Bye! Have a nice day!");
				break;
			case 0:
				System.out.println("Unknown command. If you need help type help.");				
			case 1:
				System.out.print("Please, write a command: ");
				break;
			case 2:
				System.out.print("List of commands:\n" +
				"-show users\n" +
				"-help\n" +
				"-exit\n");
				break;
			case 3:
				users.showUsers();
				break;
		}
	}
	
	private static byte getNumberOfCommand(String command){
		byte numberOfCommand = 0;
			
		switch(command){
			case "exit":
				numberOfCommand = -1;
				break;
			case "":
				numberOfCommand = 1;
				break;
			case "help":
				numberOfCommand = 2;
				break;
			case "show users":
				numberOfCommand = 3;
				break;
		}
		
		return numberOfCommand;
	}
	
	private void init(){
		//В этом методы мы будем инициализировать наши данные.
		User user1 = new User("Oleksiy", "lthtdj444");
		Users.myUsers.add(user1);
	}	
}

class NoCommandException extends Exception{
}

class Login{
	public void login(String name, String password){
		for(int numberOfUser = 0; numberOfUser < Start.users.myUsers.size(); numberOfUser++){
			if(Start.users.myUsers.get(numberOfUser).getName == name){
				System.out.println("У нас есть такой пользователь!");
			}			
		}
	}
}