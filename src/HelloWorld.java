import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloUser helloUser = new HelloUser();
		
		System.out.println("Hello ASE2017 - How are youu? :)");
		
		System.out.print("Please enter your name: ");
		
		Scanner in  = new Scanner(System.in);
		String name = in.nextLine();
		
		helloUser.setUserName(name);
		helloUser.printAnswer();
		
		
	}

}

