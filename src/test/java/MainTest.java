import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    /**
     * A basic test to test the complete program.
     * Input via test1.in
     * Expected out via test1.out
     *
     * @throws Exception
     */
    @Test
    public void testCaseOne() throws Exception {

        // Setup inputstream from file
        InputStream inFile = new FileInputStream(new File(getClass().getResource("/test1.in").toURI()));
        // Setup out stream to catch System out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        //Run main
        long t1 = System.currentTimeMillis();
        new Main(inFile, outContent);
        long tottime = (System.currentTimeMillis() - t1);

        //Output to string
        String actual = outContent.toString();
        String expected = new String(Files.readAllBytes(Paths.get(getClass().getResource("/test1.out").toURI())));

        assertTrue(tottime < 100, () -> "To slow. Runtime: " + tottime + " ms");
        assertNotEquals(null, actual);
        assertEquals(expected, actual);
        assertEquals(true, false);

    }

}
