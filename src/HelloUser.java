
public class HelloUser {
	
	String userName = "no Username";
	public void printAnswer() {
		System.out.println("Hello " + userName +"!");
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
