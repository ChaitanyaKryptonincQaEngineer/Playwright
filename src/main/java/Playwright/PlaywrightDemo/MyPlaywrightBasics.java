package Playwright.PlaywrightDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MyPlaywrightBasics {

	
	public static void main(String[] args) {
		
		
		Playwright play = Playwright.create();
		Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.google.com/");
		System.out.println("Title of the page is " +page.title());
		
		browser.close();
		page.close();
		
		
	}
}
