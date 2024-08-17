
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try(FileWriter write = new FileWriter("test.txt")){
            write.write("Hey this is prabhas");
            write.write(549);

        } catch (Exception e) {
            System.out.println(" "+e);
        }
        try(FileReader reader=new FileReader("test.txt")) {

            int ch;
            while ((ch=reader.read())!=-1){
                System.out.println(" "+(char) ch);

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
