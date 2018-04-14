import java.io.*;

public class Start{
	public static void main(String[] args){
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
				System.out.print("Please, write a command: ");
				break;
			case 1:
				System.out.println("You need help?");
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
				numberOfCommand = 0;
				break;
			case "help":
				numberOfCommand = 1;
				break;				
		}
		
		return numberOfCommand;
	}
	
	private void init(){
		//В этом методы мы будем инициализировать наши данные.
		User user1 = new User("Oleksiy", "lthtdj444");
	}	
}

class NoCommandException extends Exception{
}