package com.klymchuk.fr.example.custom;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class WetherMatcher extends TypeSafeMatcher<String> {
	
	private Integer expected;

	@Override
	public void describeTo(Description description) {
		description.appendText("Weather value is: ").appendValue(expected);
	}

	@Override
	protected boolean matchesSafely(String actual) {
		
		if (actual.startsWith("+")) {
			actual = actual.substring(0, 3).trim();
			String[] split = actual.split("[-+/]"); //split - remove arg + or -
			Integer actValue = Integer.valueOf(split[1]);
			
			return actValue.equals(expected);
		}
		return false;
	}
	
	public WetherMatcher (Integer expected) {
		this.expected = expected;
	}

	//value positive with prefix "+"
	public static Matcher<? super String> positiveValue(int value) {
		return new WetherMatcher(value);
	}

}
