package ar.com.belatrix.loggin.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import ar.com.belatrix.loggin.loggers.CustomLogger;
import ar.com.belatrix.loggin.properties.LoggerProperties;

public class DatabaseBellatrixHandler extends Handler {

	private Connection connection;


	public DatabaseBellatrixHandler(LoggerProperties loggerProperties) {
		// TODO Auto-generated constructor stub
		try {
			this.connection = getConnection(loggerProperties);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public DatabaseBellatrixHandler() {
		// TODO Auto-generated constructor stub
	}

	public void log(Level level, CustomLogger customLogger) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = this.connection.prepareStatement("insert into LOG_VALUES(type,message) values(?,?)");
			preparedStatement.setInt(1, customLogger.getType());
			preparedStatement.setString(2, customLogger.getMessageText());
			preparedStatement.executeQuery();

			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private Connection getConnection(LoggerProperties loggerProperties) throws SQLException {
		Connection connection = null;
		Properties connectionProps = new Properties();
		connectionProps.put("user", loggerProperties.getUserNameDB());
		connectionProps.put("password", loggerProperties.getPassDB());

		connection = DriverManager.getConnection(loggerProperties.getUrlServerDB(), connectionProps);
		return connection;
	}

	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub

	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
	}

	@Override
	public void close() throws SecurityException {
		// TODO Auto-generated method stub

	}

}
