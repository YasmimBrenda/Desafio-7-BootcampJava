import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogManager {
    private static LogManager instance;
    private PrintWriter writer;

    private LogManager() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        writer.println(message);
    }

    public void close() {
        writer.close();
    }
}
