package comm.example;

import org.openqa.selenium.By;

public interface Locatorss {
	String base_url = "http://automationexercise.com";
	By signupLoginButton = By.linkText("Signup / Login");
	By Display_Text_NewUserSignup = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
	By NameForSignup = By.name("name");
	By EmailForSignup = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By ClickSignup = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	By SelectTitle = By.xpath("//*[@id='id_gender2']");
	By Password = By.xpath("//*[@id=\"password\"]");
	By DOBDay = By.xpath("//*[@id=\"days\"]");
	By DOBMonth = By.xpath("//*[@id=\"months\"]");
	By DOBYear = By.xpath("//*[@id=\"years\"]");
	By CheckNewsletter = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label");
	By CheckSpecialOffers = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]/label");
	By EnterFirstName = By.xpath("//*[@id=\"first_name\"]");
	By EnterLastName = By.xpath("//*[@id=\"last_name\"]");
	By CompanyName = By.xpath("//*[@id=\"company\"]");
	By Address = By.xpath("//*[@id=\"address1\"]");
	By Address2 = By.xpath("//*[@id=\"address2\"]");
	By SelectCountry = By.name("country");
	By EnterState = By.xpath("//*[@id=\"state\"]");
	By EnterCity = By.xpath("//*[@id=\"city\"]");
	By EnterZipCode = By.xpath("//*[@id=\"zipcode\"]");
	By EnterMobileNo = By.xpath("//*[@id=\"mobile_number\"]");
	By CreateAccButton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	By ContinueButton = By.linkText("Continue");
	By UserName = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
}
