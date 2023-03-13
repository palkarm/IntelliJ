import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadData{
    public static void main(String[] args) throws FileNotFoundException {
        Map<Integer,String> stringMap = new HashMap<>();


        try {
            File myFile = new File("/Users/manasipalkar/Downloads/Database/src/File1");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                int user_id = scanner.nextInt();
                String user_name = scanner.next();
                stringMap.put(user_id,user_name);
            }
        }catch(Exception ex){
            throw  new FileNotFoundException("File not found");
        }

        System.out.println(stringMap);
    }
}
