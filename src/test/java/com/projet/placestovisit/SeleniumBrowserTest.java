package com.projet.placestovisit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// 
public class SeleniumBrowserTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Test affichage page d'accueil
		String url = "https://secure-crag-94496.herokuapp.com/";
		driver.get(url);

		// Récupérer titre de la page
		String title = driver.getTitle();
		int titleLength = title.length();
		System.out.println("Titre page = " + title);
		System.out.println("Longueur titre : " + titleLength);

		// vérifier exactitude l'URL
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Sccuès : URL correct");
		} else {
			System.out.println("Echec : URL incorrect");

			System.out.println("URL = " + actualUrl);
			System.out.println("URL attendue : " + url);
		}

		// Longueur de la page
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("Page source : " + pageSource);
		System.out.println("Longueur totale page source = " + pageSourceLength);

		// driver.close();
	}

}