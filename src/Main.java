import java.util.*;
public class Main {
   public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static final int MAX_HOURS_IN_MONTH = 100;
    public static int computeEmpWage(){

        int empHrs=0;
        int totalEmpHours=0;

        int totalWorkingDays=0;


while(totalEmpHours<=MAX_HOURS_IN_MONTH && totalWorkingDays <NUM_OF_WORKING_DAYS){
    totalWorkingDays++;
    int random_int = (int) Math.floor(Math.random() * 10) % 3;
    switch (random_int) {
        case IS_PART_TIME:
            empHrs = 4;
            break;

        case IS_FULL_TIME:
            empHrs = 8;
            break;

        default:
            empHrs = 0;

    }
    totalEmpHours += empHrs ;
    System.out.println("Days :" + totalWorkingDays+"Hours :"+totalEmpHours);

}
int totalEmpWage = totalEmpHours*EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage :"+totalEmpWage);
        return totalEmpHours;
    }
    public static void main(String[] args){
        computeEmpWage();
    }
}