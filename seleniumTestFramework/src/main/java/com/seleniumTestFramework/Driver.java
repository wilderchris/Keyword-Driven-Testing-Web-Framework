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
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println("arg[" + i + " ] = " + args[i]);
			
			if (args[i] == "test") {
				KeywordEngine ke = new KeywordEngine();
				ke.startExecution("sheet1");
				
			}else if(args[0] == "stats") {
				System.out.println(" stats have not been created ye use \"test\"");
				break; // add after 
			}//  need to update for the selenium commands
			// maybe easier to use an enum
		}	//dfoknadfnakanfkjangkjadmknkn
				//just adding for the github stat today
	}		// wedrdfcnrgipurgiorwiowhunmvlvljhvlhjvljhvlhj
	//adding for more

}
