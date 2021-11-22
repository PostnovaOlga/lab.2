import java.util.InputMismatchException;
import java.util.Scanner;

public class laba {

    public static void main(String[] args){
        int num = 0;
        try{
            Scanner in = new Scanner(System.in);
        System.out.println("Write_an_int_number_0-14");
        num = in.nextInt();}
        catch(InputMismatchException e) {
        System.out.println("Incorrect_data");
        System.exit(1);
        }
        if (num < 0) {
            System.out.println("The_number_should_be_positive");
            System.exit(0);}
        if (num >= 15) {
            System.out.println("The_number_should_be_less_than_15");
            System.exit(0);}

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
            }
        System.out.println(result);
        }
}
