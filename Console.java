import java.io.*;

public class Console{
	//Этот класс будет служить для работы с консолью.
	Kernel kernel = new Kernel();
	private byte numberOfCommand = 0;
	
	public void doIt(){
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to my program!");
		System.out.println("Please login. Enter your name and password.");
		kernel.initial();
		
		try{
			while (!(kernel.login(buffReader.readLine(), buffReader.readLine()))){
				System.out.print("");
			}
			
			while(numberOfCommand >= 0){
				String command = buffReader.readLine();
				numberOfCommand = getNumberOfCommand(command);
				doCommand(numberOfCommand);		
			}
		} catch (IOException ex){
			System.out.println("Something went wrong!");
			ex.printStackTrace();
		}			
	}
	
	private void doCommand(byte command){
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
				Users.showUsers();
				break;
		}
	}
	
	private byte getNumberOfCommand(String command){
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
}