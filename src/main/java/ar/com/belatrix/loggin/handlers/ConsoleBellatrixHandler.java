package ar.com.belatrix.loggin.handlers;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class ConsoleBellatrixHandler {

	
	public ConsoleBellatrixHandler(LoggerProperties loggerProperties) {
	}

	public void log(Level level, CustomLogger customLogger) {

		Logger logger = Logger.getLogger(ConsoleHandler.class.getName());

		logger.log(level, customLogger.getMessageText());

	}

}
