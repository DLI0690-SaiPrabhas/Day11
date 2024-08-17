import java.io.*;

public class CopyFileContent {

    public static void fileCopy(String sourcepath,String destPath){
        try(FileReader reader=new FileReader(sourcepath);
        FileWriter writer=new FileWriter(destPath)) {

            int ch;
            while ((ch = reader.read()) != -1) {
                    writer.write(ch);
                System.out.println(" "+(char)ch);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        fileCopy("test.txt","destination.txt");


    }
}
