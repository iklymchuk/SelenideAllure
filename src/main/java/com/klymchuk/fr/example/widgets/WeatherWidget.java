package com.klymchuk.fr.example.widgets;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class WeatherWidget {
	
	public SelenideElement getWeather() {
		return $(".b-link.b-link_black_novisit");
	}
	
	public SelenideElement getMorningWeather() {
		return $(By.xpath(".//*[@class='weather__item']/a[1]"));
	}
	
	public SelenideElement getNightWeather() {
		return $(By.xpath(".//*[@class='weather__item']/a[2]"));
	}
}