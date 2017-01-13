import com.thoughtworks.biblioteca.Application;
import com.thoughtworks.biblioteca.Library;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by wdsand on 1/13/17.
 */
public class ApplicationTest {
    @Test
    public void shouldPrintWelcome(){
        PrintStream printStream = mock(PrintStream.class);
        Application application = new Application(printStream);
        application.welcomeToTheLibrary();
        verify(printStream).println("Welcome");
    }
}