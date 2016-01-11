package com.klymchuk.fr.example.steps;

import org.hamcrest.Matcher;

import ru.yandex.qatools.allure.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;

import com.klymchuk.fr.example.widgets.WeatherWidget;

public class WeatherWidgetSteps {
	
	WeatherWidget widget;
	
	public WeatherWidgetSteps () {
		widget = new WeatherWidget();
	}
	
	@Step
	public void wetherShouldBe (Matcher<? super String> matcher) {
		String text = widget.getWeather().getText();
		assertThat(text, matcher); 
	}

}
