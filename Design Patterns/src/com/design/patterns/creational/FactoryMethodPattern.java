package com.design.patterns.creational;

enum Logger {
	FILE, DATABASE, CONSOLE;
}

interface AppLogger {
	public void log(String message);
}

class FileLogger implements AppLogger {
	@Override
	public void log(String message) {
		System.out.println("writing message to file :: " + message);
	}
}

class DatabaseLogger implements AppLogger {
	@Override
	public void log(String message) {
		System.out.println("writing message to database :: " + message);
	}
}

class ConsoleLogger implements AppLogger {
	@Override
	public void log(String message) {
		System.out.println("displaying message on console  :: " + message);
	}
}

class LogFactory {

	public static AppLogger getLogger(Logger logger) {
		if (logger.equals(Logger.FILE)) {
			return new FileLogger();
		} else if (logger.equals(Logger.DATABASE)) {
			return new DatabaseLogger();
		} else if (logger.equals(Logger.CONSOLE)) {
			return new ConsoleLogger();
		} else {
			return null;
		}
	}
}

public class FactoryMethodPattern {

	public static void main(String[] args) {
		AppLogger logger = LogFactory.getLogger(Logger.FILE);
		logger.log("Logged Message One");
		
		logger = LogFactory.getLogger(Logger.DATABASE);
		logger.log("Logged Message Two");
		
		logger = LogFactory.getLogger(Logger.CONSOLE);
		logger.log("Logged Message Three");
	}
}
