package ar.com.belatrix.loggin.handlers;

import java.io.IOException;
import java.util.logging.*;

import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class FileBellatrixHandler {

	private FileHandler fileHandler ;
	Logger logger = Logger.getLogger(FileBellatrixHandler.class.getName());

	public FileBellatrixHandler(LoggerProperties loggerProperties) {
		try {

			 fileHandler = new FileHandler(loggerProperties.getPathFileLog());
			 fileHandler.setEncoding("UTF-8");
			 fileHandler.setFormatter(new SimpleFormatter());

			 logger.addHandler(fileHandler);

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void log(Level level, CustomLogger customLogger) {

		logger.log(level, customLogger.getMessageText());

		//Logger.getLogger("MyLog").addHandler(fileHandler);
		//Logger.getLogger("MyLog").log(level, customLogger.getMessageText());
	}

}
