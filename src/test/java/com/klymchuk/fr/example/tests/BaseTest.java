package com.klymchuk.fr.example.tests;

import org.junit.Before;
import static com.codeborne.selenide.Selenide.open;

//Abstract
public abstract class BaseTest {
	
	private static final String URL = "https://www.yandex.ua/";
	
	@Before
	public void setUp() {
		 open(URL);
	}

}
