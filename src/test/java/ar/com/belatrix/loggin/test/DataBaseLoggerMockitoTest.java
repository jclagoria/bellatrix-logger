package ar.com.belatrix.loggin.test;



import ar.com.belatrix.loggin.handlers.DatabaseBellatrixHandler;
import ar.com.belatrix.loggin.loggers.CustomLogger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

import java.util.logging.Level;

@RunWith(MockitoJUnitRunner.class)
public class DataBaseLoggerMockitoTest {

    @Mock
    DatabaseBellatrixHandler databaseHandlerMock;

    @Mock
    CustomLogger customLoggerMock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void messageToDataBase() {

        doNothing().when(databaseHandlerMock).log(any(Level.class), any(CustomLogger.class) );
        databaseHandlerMock.log(Level.INFO, customLoggerMock);

        verify(databaseHandlerMock, times(1)).log(Level.INFO, customLoggerMock);

    }



}
