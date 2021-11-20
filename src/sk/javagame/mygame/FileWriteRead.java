package sk.javagame.mygame;
import java.io.*;


public class FileWriteRead {

    public static void write(String text, String pathUrl){
        try{
            File file = new File(pathUrl);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
        }
    }

    public static String read(String pathUrl){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathUrl));
            String line = bufferedReader.readLine();

            bufferedReader.close();
            return line;
        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
        return "null";
    }
}
