import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int IS_FULL_TIME=1;


        int empHrs =0;
        int empWage =0;

        int random_int = (int)Math.floor(Math.random() *10)%2;
        if(random_int == IS_FULL_TIME)
            System.out.println("Present");
        else
            System.out.println("Absent");


    }
}