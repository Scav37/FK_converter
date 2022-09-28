import java.util.*;


public class FK_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double T = input.nextDouble();

        double TK = (T+459.67)*5/9;

        System.out.printf("Fahrenheit to Kelvin is: %.2f",TK,"\n");


    }
}
