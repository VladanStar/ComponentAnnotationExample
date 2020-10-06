package com.vladancupric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class Logger {
	@Autowired
	private ConsoleWriter consoleWriter;
	@Autowired
	private FileWriter fileWriter;
	//@Autowired
	/*public Logger() {
		super();
	}
	//@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}*/
	@Autowired
	@Qualifier("writeToConsole")
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	@Autowired
	@Qualifier("writeToFile")
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
	
	

}
