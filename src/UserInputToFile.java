import java.io.*;
import java.util.Scanner;

public class UserInputToFile {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input to add into a file ");
        String ip=sc.nextLine();

        try(BufferedWriter writer=new BufferedWriter(new FileWriter("user_input.txt"))){

                writer.write(ip);
            }
        catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader=new BufferedReader(new FileReader("user_input.txt"))){
            String ch;
            while ((ch=reader.readLine())!=null){
                System.out.println(""+(String) ch);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }




