package ar.com.belatrix.loggin;

import java.util.logging.Level;

import ar.com.belatrix.loggin.handlers.ConsoleBellatrixHandler;
import ar.com.belatrix.loggin.handlers.DatabaseBellatrixHandler;
import ar.com.belatrix.loggin.handlers.FileBellatrixHandler;
import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class MyLog {

	private LoggerProperties loggerProperties;

	public MyLog(LoggerProperties loggerProperties) {

		this.loggerProperties = loggerProperties;

	}

	public void notify(String messageText, String level) throws RuntimeException {
		notify(new MessageLog(messageText, level));
	}

	private void notify(MessageLog message) {

		if (message.getMessageText() == null || message.getMessageText().isEmpty()) {
			throw new RuntimeException("Message is Null");
		}
		if (!loggerProperties.isLogToConsole() && !loggerProperties.isLogToFile() && !loggerProperties.isLogToDataBase()) {
			throw new RuntimeException("Invalid configuration");
		}

		if ((!loggerProperties.isLevelError() && !loggerProperties.isLevelMessage() && !loggerProperties.isLevelWarnimg())) {
			throw new RuntimeException("Error or Warning or Message must be specified");
		}

		Level level = null;
		CustomLogger customLogger = new CustomLogger(false);

		if (loggerProperties.isLevelMessage()) {
			level = Level.INFO;
		} else if (loggerProperties.isLevelWarnimg()) {

			level = Level.WARNING;
		} else if (loggerProperties.isLevelError()) {
			level = Level.SEVERE;
		}

		customLogger.setMessageText(message.getMessageText());

		if (loggerProperties.isLogToConsole()) {
			new ConsoleBellatrixHandler(loggerProperties).log(level, customLogger);
		}
		
		if(loggerProperties.isLogToFile()) {
			new FileBellatrixHandler(loggerProperties).log(level, customLogger);
		}
		
		if(loggerProperties.isLogToDataBase()) {
			new DatabaseBellatrixHandler(loggerProperties).log(level, customLogger);
		}


	}

}
