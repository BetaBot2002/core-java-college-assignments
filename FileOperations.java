import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        File file1 = new File("Files/File1.txt");
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String content="Hello World";

        try (FileWriter fw = new FileWriter(file1)) {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String reversed=new StringBuilder(content).reverse().toString();

        File file2 = new File("Files/File2.txt");
        if (file2.exists()) {
            long length = file2.length();
            if (length >= 20) {
                System.out.println("File2 is too long.");
                return;
            }
        } else {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fw = new FileWriter(file2, true)) {
            fw.append(reversed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}