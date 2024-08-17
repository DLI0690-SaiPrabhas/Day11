import java.io.*;

public class CopyingFileContents {

    public static void fileCopy(String sourcepath,String destPath){
        try(BufferedReader reader=new BufferedReader(new FileReader(sourcepath));
            BufferedWriter writer=new BufferedWriter(new FileWriter(destPath))) {

            String ch;
            while ((ch = reader.readLine()) != null) {
                writer.write(ch);
                writer.newLine();
                System.out.println(" "+ch);
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        fileCopy("test.txt","destination1.txt");


    }
}
