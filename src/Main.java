import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int fdew=1;
        int pdew=2;
        int wph = 20;




        int random_int = (int)Math.floor(Math.random() *(pdew-fdew+1)+fdew);
        if(random_int == 1){
            System.out.println("Absent");
        }
        else{
            System.out.println("Present");
        }
        if(random_int==fdew){
            System.out.println("The daily employee wage is :"+wph*8);
        }
        else{
            System.out.println("The part time employee wage is :"+ wph*8);
        }


        switch (random_int){
            case 1:
                System.out.println("The daily employee wage is  :"+wph*8);
                break;

            case 2:
                System.out.println("The part time employee wage is :"+wph*8);
                break;

        }
    }
}