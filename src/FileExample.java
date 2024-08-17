import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        File file=new File("test.txt");

        if (file.exists()){
            System.out.println("Existed");
        }
        else {
            try {
                file.createNewFile();
                System.out.println("file created");
            } catch (IOException e) {
                System.out.println(" "+e);
            }


        }
    }
}
