package com.goda5.hagendaz.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuhnValidator {
	private static Logger LOGGER = LoggerFactory.getLogger(LuhnValidator.class);
	public boolean isValid(int[] digits) {
		assert digits.length == 16;
		int oddDigitsSum = 0, evenDigitsSum = 0;
		for(int i=digits.length-1;i>=1;i-=2) {
			oddDigitsSum += digits[i];
		}
		LOGGER.debug("Odd digits sum: " + oddDigitsSum);
		
		for(int i=digits.length-2;i>=0;i-=2) {
			evenDigitsSum += digits[i] * 2>=9?(digits[i] * 2 - 9):(digits[i] * 2);
		}
		LOGGER.debug("Even digits sum: " + evenDigitsSum);
		return (oddDigitsSum + evenDigitsSum)%10==0;
	}
	
	public boolean isValid(String digits) {
		int[] digitsInInt = new int[digits.length()];
		for(int i=0;i<digits.length();i++) {
			digitsInInt[i] = Character.digit(digits.charAt(i), 10);
		}
		return isValid(digitsInInt);
	}
}
