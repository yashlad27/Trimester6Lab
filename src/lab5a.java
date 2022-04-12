import java.io.*;
public class lab5a {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);

        FileWriter file = new FileWriter("source.txt");
        BufferedWriter buffer1 = new BufferedWriter(file);

        System.out.println("Enter Total Number of Students: \n");
        int stud = Integer.parseInt(buffer.readLine());

        // array initialisation:-(int marks)
        int[] marks = new int[5];
        int[] total = new int[stud];
        int[] avg = new int[stud];

        for(int i=0; i<stud; i++){
            total[i] = 0;
        }

        // array initialisation:-(string marks)
        String[] marks1 = new String[5];
        String[] name = new String[stud];
        String[] roll = new String[stud];
        String[] grade = new String[stud];

        for(int i=0; i<stud; i++){
            System.out.println("\nEnter the name of Student "+(i+1)+": ");
            name[i] = buffer.readLine();
            buffer1.write(name[i]);
            System.out.println("Enter your Roll NO.: ");
            roll[i] = buffer.readLine();
            buffer1.write(roll[i]);

            for(int j=0; j<5; j++){
                System.out.println("Enter marks for each subject "+(j+1)+": ");
                marks[j] = Integer.parseInt(buffer.readLine());
                total[i] += marks[j];
                marks1[j] = Integer.toString(marks[j]);
                buffer1.write(marks[j]);
            }
            avg[i] = total[i]/5;
            System.out.println("Average Marks are: "+avg);
            if(avg[i]>=70 && avg[i]<=100){
                grade[i] = "A";
                buffer1.write(grade[i]);
            }else if(avg[i]<=30 && avg[i]<=60){
                grade[i] = "B";
                buffer1.write(grade[i]);
            }else{
                grade[i] = "F";
                buffer1.write(grade[i]);
            }
        }

        FileReader f1 = new FileReader("source.txt");
        FileWriter f2 = new FileWriter("target.txt",true);

        int temp;
        while((temp=f1.read())!=-1){
            f2.write((char)temp);
        }

        f1.close();
        f2.close();
        buffer.close();
        buffer1.close();


    }
}
