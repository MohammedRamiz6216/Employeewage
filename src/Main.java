import java.util.*;
public class Main {
   public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME=2;

    public static int computeEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxHoursPerMonth){

        int empHrs=0;
        int totalEmpHours=0;

        int totalWorkingDays=0;


while(totalEmpHours<=maxHoursPerMonth && totalWorkingDays <noOfWorkingDays){
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
int totalEmpWage = totalEmpHours*empRatePerHour;
        System.out.println("Total Emp Wage :"+totalEmpWage);
        return totalEmpHours;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
         String s = sc.next();
         int emp    = sc.nextInt();
         int num = sc.nextInt();
         int max = sc.nextInt();
        computeEmpWage(s,emp,num,max);}
    }
}