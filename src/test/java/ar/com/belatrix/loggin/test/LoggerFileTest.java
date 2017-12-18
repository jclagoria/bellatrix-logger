package ar.com.belatrix.loggin.test;

import ar.com.belatrix.loggin.MyLog;
import ar.com.belatrix.loggin.factory.LoggerFactory;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class LoggerFileTest extends LoggerTest {

    @Test
    public void testLogToFile() throws IOException {

        MyLog logger = LoggerFactory.getLogger("MyLog", config.getLoggerProperties());
        logger.notify("Message de prueba.", "error");

        File file = new File(config.getLoggerProperties().getPathFileLog());
        assertTrue("El archivo existe: ", file.exists());

        final String contentFile = FileUtils.readFileToString(file);
        assertTrue("El archivo contiene texto: ",!contentFile.isEmpty());

    }

}
