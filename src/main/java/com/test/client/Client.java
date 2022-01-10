package com.test.client;

import com.test.service.Calculator;
import org.apache.log4j.Logger;

public class Client {
	private static final Logger logger = Logger.getLogger(Client.class.toString());
	public static void main(String[] args) {
		Calculator cobj = new Calculator();
		int sum = cobj.addition(10, 10);
		logger.info("SUM : {}" + sum);
	}
}