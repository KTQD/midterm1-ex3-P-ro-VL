import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String text;
            while((text = reader.readLine()) != null) {
                writer.write(text.replaceAll("Nha Trang", "Vũng Tàu") + "\n");
            }

            reader.close();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
