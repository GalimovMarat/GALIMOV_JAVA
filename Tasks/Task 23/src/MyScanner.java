import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MyScanner {
    InputStream inputStream;

    public MyScanner(String filename) throws FileNotFoundException {
        this.inputStream = new FileInputStream(filename);
    }
}
