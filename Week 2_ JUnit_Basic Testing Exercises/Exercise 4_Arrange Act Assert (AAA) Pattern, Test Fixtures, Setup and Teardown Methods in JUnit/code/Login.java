package login;
public class Login 
{
	public boolean login(String username, String password) 
	{
        if (username == null || password == null) 
        	return false;
        if (username.equals("admin") && password.equals("password123"))
        	return true;
        return false;
    }

    public boolean isUsernameValid(String username) 
    {
        if(username != null && username.length() >= 5)
        	return true;
        return false;
    }

}
