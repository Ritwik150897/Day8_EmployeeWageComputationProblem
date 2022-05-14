public class EmployeeWageComputation {
    double isAbsent = Math.floor(Math.random() * 10) % 3;
    int FULL_TIME = 1;
    int PART_TIME = 2;
    int WAGE_PER_HOUR = 20;
    int empHrs = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program.");

        EmployeeWageComputation ewc = new EmployeeWageComputation();
        ewc.isAbsent();
        ewc.dailyWageCalculation();
    }

    void isAbsent(){
        if(isAbsent == 1){
            System.out.println("Employee is Present.");
        } else if (isAbsent == 2) {
            System.out.println("Employee is Present Part-Time.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }

    void dailyWageCalculation(){
        if(isAbsent == 1){
            empHrs = 8;
            System.out.println("Employee Daily Wage is: "+ empHrs * WAGE_PER_HOUR);
        } else if (isAbsent == 2) {
            empHrs = 4;
            System.out.println("Employee Daily Wage is: "+ empHrs * WAGE_PER_HOUR);
        } else {
            System.out.println("Employee Daily Wage is: "+ empHrs * WAGE_PER_HOUR);
        }
    }
}
