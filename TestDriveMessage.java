public class TestDriveMessage{
		public static void main(String[] args){
			User user1 = new User("Oleksiy","1234");
			User user2 = new User("Vitaliy","5678");
			Message message = new Message(user1, user2, "Hello, Vitaliy");
			System.out.println(message.toString());
		}
}