import java.io.*;

public class BufferExample {
    public static void main(String[] args) {

        try(BufferedReader reader=new BufferedReader(new FileReader("test.txt"))) {
            String ch;
            while ((ch=reader.readLine())!=null){
                System.out.println(" "+(String) ch);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
