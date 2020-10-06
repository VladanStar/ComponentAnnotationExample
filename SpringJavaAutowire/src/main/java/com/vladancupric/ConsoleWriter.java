package com.vladancupric;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

@Qualifier("writeToConsole")
public class ConsoleWriter implements LogWriter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
		
	}

}
