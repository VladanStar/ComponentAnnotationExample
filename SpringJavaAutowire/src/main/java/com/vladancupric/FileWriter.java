package com.vladancupric;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

@Qualifier("writeToFile")
public class FileWriter implements LogWriter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Upis u file: " + text);
	}

}
