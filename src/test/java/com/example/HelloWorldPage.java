/**
   Copyright 2010 David Green

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * WebDriver page for the hello world message page.
 * 
 * @author GreenD
 *
 */
public class HelloWorldPage {

	// The web driver
	private WebDriver driver;
	
	/**
	 * Create a new hello world page.
	 * 
	 * @param driver
	 */
	HelloWorldPage( WebDriver driver ) {
		this.driver = driver;
	}
	
	/**
	 * @return The contents of the message
	 */
	public String getMessage() {
		return driver.findElement(By.id("message")).getText();
	}
}
