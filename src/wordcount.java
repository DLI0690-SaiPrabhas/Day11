import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordcount {
    public static void main(String[] arg){
        int count=0;
        try(BufferedReader reader=new BufferedReader(new FileReader("test.txt"))){
            String ch;

            while ((ch=reader.readLine())!=null){
                System.out.println(" "+(String) ch);
                count++;


            }
            } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The total letters are : "+count);
    }
    }

