package com.seleniumTestFramework;

import com.seleniumTestFramework.keywordEngine.KeywordEngine;

public class Driver {

	public static void main(String[] args) {
		// TODO would like to make this a command line app with args 
		//to decide type of test, file to use, and reporting type
		
		for (int i = 0; i < args.length;i++ ) {
			System.out.println("arg["+i+" ] = " + args[i]);
		}
		
		KeywordEngine ke = new KeywordEngine();
		ke.startExecution("sheet1");
		
	}

}
