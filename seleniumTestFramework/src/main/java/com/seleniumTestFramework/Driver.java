package com.seleniumTestFramework;

import com.seleniumTestFramework.keywordEngine.KeywordEngine;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Driver {

	public static void main(String[] args) {
		// TODO would like to make this a command line app with args
		// to decide type of test, file to use, and reporting type
		if (args.length == 0) {
			System.out.println("Usage for app:");
			System.out.println("Driver [type] [file] [?]");//?
		}// args will be used for file name to run the tests and browser type and then a report type
			// report type will be able to run for statistics and for testing
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + " ] = " + args[i]);
			
			if (args[i] == "test") {
				KeywordEngine ke = new KeywordEngine();
				ke.startExecution("sheet1");
				
			}else if(args[0] == "stats") {
				System.out.println(" stats have not been created ye use \"test\"");
				break; // add after 
			}

		}	//updating the framework for a selenium easy of use
		}
			
}
