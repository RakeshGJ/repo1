package Stepdefination;

public class Applicationutils extends DriverUtils 
{
	public void launch(String url) 
	{
		System.out.println("launching the application using" + url);
		driver.get(url);
		System.out.println("launching the application successfully");
	}

	public void login(String username, String password) 
	{
		System.out.println("login application using valid credentials");
		type("id", "username", username);
		type("name", "pwd", password);

		System.out.println("login is successfull");
	}

	public void getmodule(String type)
	{
		System.out.println(" select a module of type" + type);
		switch (type.toLowerCase()) {
		case "task":
			click("xpath", "//div[text()='TASKS']");

			break;

		default:
        System.out.println("please check the module present in the application");
			break;
		}
	}

	public void logout() 
	{
		click("id", "logoutLink");
	}

}
