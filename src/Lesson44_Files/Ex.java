package Lesson44_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources");
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Директория "+path +" создана");
        }


        Path file1 =path.resolve("reports");
        if (!Files.exists(file1)) {
            Files.createDirectory(file1);
            System.out.println("Директория "+file1 +" создана");
            }
        
        

for (int i=1 ; i<6; i++){
        Path filePath = file1.resolve("report1.txt");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
            System.out.println("Файл " + filePath + " создан");
        }
        }
    }
}
