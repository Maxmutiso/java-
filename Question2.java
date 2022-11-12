package question.pkg2;
import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five units:\n");

        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();
        
        float total;
        float average;
        
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        average = (float)(total / 5.00);
        
        System.out.println("The Average marks = " + average);
    }
    
}
    
    