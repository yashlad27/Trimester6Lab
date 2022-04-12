import java.io.IOException;
import java.io.*;
public class lab5 {
    public static void main(String[] args)throws IOException {

        FileReader FR = new FileReader("source.txt");
        FileWriter FW = new FileWriter("target.txt");

        BufferedReader BFR = new BufferedReader(FR);
        BufferedWriter BFW = new BufferedWriter(FW);

        try{
            int temp;
            while((temp = BFR.read())!=-1){
                BFW.write((char)temp);
            }
        }
        finally {
            if(BFR!=null){
                BFR.close();
            }
            if(BFW!=null){
                BFW.close();
            }
        }
    }
}
