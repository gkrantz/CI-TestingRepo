import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    private Kattio io;

    /**
     * Constructor.
     * DO YOUR STUFF HERE.
     *
     * @param in  InputStream to handle program input
     * @param out OutputStream to handle program output
     */
    public Main(InputStream in, OutputStream out) {
        // Set streams
        this.io = new Kattio(in, out);

        //---------------------
        // Do stuff here!
        // use Kattio for input parsing
        // ex. int n = io.getInt();
        //---------------------

        // Make sure to close the streams
        io.close();
        


    }

    /**
     * Main method. Do not write anything here to make it easy to test.
     * (We want to be able to set in and out stream outside static main.)
     * @param args main args
     */
    public static void main(String args[]) {
        new Main(System.in, System.out);
    }


}
