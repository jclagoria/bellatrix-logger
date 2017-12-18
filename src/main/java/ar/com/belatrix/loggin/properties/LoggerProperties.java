package ar.com.belatrix.loggin.properties;

public class LoggerProperties {

    private String urlServerDB;
    private String userNameDB;
    private String passDB;
    private String pathFileLog;

    private boolean levelWarnimg;
    private boolean levelError;
    private boolean levelMessage;

    private boolean logToDataBase;
    private boolean logToConsole;
    private boolean logToFile;

    public String getUrlServerDB() {
        return urlServerDB;
    }

    public void setUrlServerDB(String urlServerDB) {
        this.urlServerDB = urlServerDB;
    }

    public String getUserNameDB() {
        return userNameDB;
    }

    public void setUserNameDB(String userNameDB) {
        this.userNameDB = userNameDB;
    }

    public String getPassDB() {
        return passDB;
    }

    public void setPassDB(String passDB) {
        this.passDB = passDB;
    }

    public String getPathFileLog() {
        return pathFileLog;
    }

    public void setPathFileLog(String pathFileLog) {
        this.pathFileLog = pathFileLog;
    }

    public boolean isLevelWarnimg() {
        return levelWarnimg;
    }

    public void setLevelWarnimg(boolean levelWarnimg) {
        this.levelWarnimg = levelWarnimg;
    }

    public boolean isLevelError() {
        return levelError;
    }

    public void setLevelError(boolean levelError) {
        this.levelError = levelError;
    }

    public boolean isLevelMessage() {
        return levelMessage;
    }

    public void setLevelMessage(boolean levelMessage) {
        this.levelMessage = levelMessage;
    }

    public boolean isLogToDataBase() {
        return logToDataBase;
    }

    public void setLogToDataBase(boolean logToDataBase) {
        this.logToDataBase = logToDataBase;
    }

    public boolean isLogToConsole() {
        return logToConsole;
    }

    public void setLogToConsole(boolean logToConsole) {
        this.logToConsole = logToConsole;
    }

    public boolean isLogToFile() {
        return logToFile;
    }

    public void setLogToFile(boolean logToFile) {
        this.logToFile = logToFile;
    }
}
