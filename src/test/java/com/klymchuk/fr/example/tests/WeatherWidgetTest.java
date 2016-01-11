package com.klymchuk.fr.example.tests;

import org.junit.Test;

import com.klymchuk.fr.example.custom.WetherMatcher;
import com.klymchuk.fr.example.steps.WeatherWidgetSteps;

public class WeatherWidgetTest extends BaseTest{
	
	WeatherWidgetSteps widgetSteps = new WeatherWidgetSteps();
	
	@Test
	public void weatherShouldBeAboveZeroInSummer () {
		widgetSteps.wetherShouldBe(WetherMatcher.positiveValue(13));
	}
}
