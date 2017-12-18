package ar.com.belatrix.loggin.loggers;

import ar.com.belatrix.loggin.enums.LoggerBellatrixEnum;

import java.text.DateFormat;
import java.util.Date;

public class CustomLogger {
	
	private String messageText;

	public String getMessageText() {
		return this.messageText;
	}

	private boolean printFlag;
	private int type;

	public CustomLogger(boolean printFlag) {
		this.printFlag=printFlag;
	}

	public CustomLogger(boolean printFlag, String messageText) {
		this.printFlag=printFlag;
		this.messageText = messageText;
	}
	
	public String getMessageFormatted(String message) {
		return  DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + message;
	}

	public boolean isPrintFlag() {
		return printFlag;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setMessageText(String message) {
		this.messageText = message;
	}
	
	public void setValores(String message, LoggerBellatrixEnum eBellatrixLogger) {
		String formatedMessage= eBellatrixLogger.getDescLoggBellatrix()+ " -  " + getMessageFormatted(message);
		setType(eBellatrixLogger.getIdLoggBellatrix());
		setMessageText(formatedMessage);
	}

}
