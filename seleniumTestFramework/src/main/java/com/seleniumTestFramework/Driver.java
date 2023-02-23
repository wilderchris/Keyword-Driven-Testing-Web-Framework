package com.seleniumTestFramework;

import com.seleniumTestFramework.keywordEngine.KeywordEngine;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeywordEngine ke = new KeywordEngine();
		ke.startExecution("sheet1");;
	}

}
