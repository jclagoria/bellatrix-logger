package ar.com.belatrix.loggin.utils;

import ar.com.belatrix.loggin.properties.LoggerProperties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private Properties prop = new Properties();
    private InputStream input = null;
    private LoggerProperties loggerProperties;

    private static String propFileName = "config.properties";

    public Config(){
        try {
            this.getPropValues();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getPropValues() throws IOException {

        try {
            input = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (input != null) {
                prop.load(input);
                loggerProperties = new LoggerProperties();
                setLoggerProperties(prop);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            input.close();
        }

    }

    private void setLoggerProperties(Properties properties){

       loggerProperties.setLevelError(Boolean.parseBoolean(properties.getProperty("log.error")));
       loggerProperties.setLevelMessage(Boolean.parseBoolean(properties.getProperty("log.message")));
       loggerProperties.setLevelWarnimg(Boolean.parseBoolean(properties.getProperty("log.warning")));

       loggerProperties.setPathFileLog(properties.getProperty("log.file.path"));
       loggerProperties.setUrlServerDB(properties.getProperty("url.servidor.bbdd"));
       loggerProperties.setUserNameDB(properties.getProperty("user.servidor.bbdd"));
       loggerProperties.setPassDB(properties.getProperty("pass.servidor.bbdd"));

       loggerProperties.setLogToConsole(Boolean.parseBoolean(properties.getProperty("log.to.console")));
       loggerProperties.setLogToDataBase(Boolean.parseBoolean(properties.getProperty("log.to.dataBase")));
       loggerProperties.setLogToFile(Boolean.parseBoolean(properties.getProperty("log.to.file")));


    }

    public LoggerProperties getLoggerProperties() {
        return loggerProperties;
    }


}
