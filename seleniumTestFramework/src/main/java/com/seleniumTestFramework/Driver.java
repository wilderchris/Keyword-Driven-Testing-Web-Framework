package com.seleniumTestFramework;

import com.seleniumTestFramework.keywordEngine.KeywordEngine;

public class Driver {

	public static void main(String[] args) {
		// TODO would like to make this a command line app with args
		// to decide type of test, file to use, and reporting type
		if (args.length == 0) {
			System.out.println("Usage for app:");
			System.out.println("Driver [type] [file] [?]");
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + " ] = " + args[i]);

			KeywordEngine ke = new KeywordEngine();
			ke.startExecution("sheet1");
			
			if (args[i] == "test") {

			}else if(args[i] == "stats") {
				
			}
		}

	}

}
