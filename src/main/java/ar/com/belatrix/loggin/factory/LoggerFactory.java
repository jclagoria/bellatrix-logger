package ar.com.belatrix.loggin.factory;

import java.util.logging.Level;

import ar.com.belatrix.loggin.MyLog;
import ar.com.belatrix.loggin.enums.LoggerBellatrixEnum;
import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class LoggerFactory {

	private static LoggerProperties loggerProperties;

	/**
	 *
	 * @param string
	 * @param loggerProperties
	 * @return
	 */
	public static MyLog getLogger(String string, LoggerProperties loggerProperties) {
		return new MyLog(loggerProperties);
	}

	/**
	 *
	 * @param loggerProperties
	 */
	public void setConfig(LoggerProperties loggerProperties) {
		this.loggerProperties = loggerProperties;
	}

	/**
	 *
	 * @param levelParam
	 * @param mensaje
	 */
	public static void log(String levelParam, String mensaje) {
		Level level = null;
		CustomLogger customLogger = null;

		if (loggerProperties.isLevelMessage()) {
			 customLogger = new CustomLogger(true);
			customLogger.setValores(mensaje, LoggerBellatrixEnum.ERROR);
		} else if (loggerProperties.isLevelWarnimg()) {
			 customLogger =  new CustomLogger(true);
			customLogger.setValores(mensaje, LoggerBellatrixEnum.WARNING);
		} else if (loggerProperties.isLevelError()) {
			customLogger = new CustomLogger(true);
			customLogger.setValores(mensaje, LoggerBellatrixEnum.ERROR);
		}
		


	}

}
