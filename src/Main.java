import java.util.*;
public class Main {
   public static final int IS_PART_TIME =1;
    public static final int IS_FULL_TIME=2;
    private String company;
    private int empRatePerHour;
    private int noOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;
    public Main(String company,int empRatePerHour,int noOfWorkingDays, int maxHoursPerMonth){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.noOfWorkingDays=noOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;


    }
    public void computeEmpWage(){

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
 totalEmpWage= totalEmpHours*empRatePerHour;


    }
    public String toString(){
        return "Total emp wage of "+company+" is :"+totalEmpWage;
    }
    public static void main(String[] args){
        Main dMart = new Main("Dmart",20,20,100);
        Main Relaince = new Main("Relaince",20,20,100);
        dMart.computeEmpWage();
        System.out.println(dMart);
        Relaince.computeEmpWage();
        System.out.println(Relaince);
    }
}