class InvalidUsername extends Exception
{
	public InvalidUsername(String message)
	{
		super(message);
	}
}
class InvalidPassword extends Exception
{
	public InvalidPassword(String message)
	{
		super(message);
	}
}
class Emailid{
	String username;
	String password;
	public Emailid(String username,String password) throws InvalidUsername,InvalidPassword{
	if(username.matches("[a-zA-Z0-9]+")){
	this.username=username;
	}
	else
	{
		throw new InvalidUsername("Invalid Username Format....");
	}
	if(password.length()>=4){
	this.password=password;
	}
	else
	{
		throw new InvalidUsername("Invalid Password....");
	}
	}
}
public class Q2{
	public static void main(String args[])
	{
		try
		{
		String username=args[0];
		String password=args[1];
		Emailid email=new Emailid(username,password);
		System.out.println("Email ID created sucessfully!");
		System.out.println("Username:"+email.username);
		System.out.println("Password:"+email.password);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		 System.out.println("Please provide Email-Id & Password as command line argument.");
		}
		catch(InvalidUsername|InvalidPassword e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
}
