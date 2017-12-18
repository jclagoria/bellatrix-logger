package ar.com.belatrix.loggin.enums;

public enum LoggerBellatrixEnum {

    WARNING(3, "Warning"),
    ERROR(2, "Error"),
    MESSAGE(1, "Message");

    private int idLoggBellatrix;
    private String descLoggBellatrix;

    LoggerBellatrixEnum(int id, String descLogg){
        this.idLoggBellatrix = id;
        this.descLoggBellatrix = descLogg;
    }

    public int getIdLoggBellatrix() {
        return idLoggBellatrix;
    }

    public String getDescLoggBellatrix() {
        return descLoggBellatrix;
    }

}
