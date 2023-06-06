import java.io.FileWriter;
import java.io.IOException;

public class SaveData {

    private String fileName;

    public static void saveFile(String[] strings) {
        String fileName = strings[0];
        try (FileWriter writer = new FileWriter(fileName, true)) {
            for (String s : strings) {
                writer.write("<" + s + ">");
                writer.flush();
            }
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
