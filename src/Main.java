import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int ispresent =0;
        int isabsent =1;

        int random_int = (int)Math.floor(Math.random() *(isabsent - ispresent + 1) + ispresent);
        if(random_int == 0){
            System.out.println("Absent");
        }
        else{
            System.out.println("Present");
        }

    }
}