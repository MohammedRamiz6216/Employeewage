import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int Is_Full_Time=1;


        int random_int = (int)Math.floor(Math.random() *10)%2;
        if(random_int == Is_Full_Time)
            System.out.println("Present");
        else
            System.out.println("Absent");


    }
}