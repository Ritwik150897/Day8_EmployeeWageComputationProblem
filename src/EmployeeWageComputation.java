public class EmployeeWageComputation {
    int FULL_TIME = 1, PART_TIME = 2, WAGE_PER_HOUR = 20, TOTAL_WORKING_DAYS = 20, MAX_WORKING_HRS = 100;
    int empHrs = 0, dailyWage = 0, totalWage = 0, totalWorkingDays = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program.");
        System.out.println("---------------------------------------------");

        EmployeeWageComputation ewc = new EmployeeWageComputation();
        ewc.monthlyWage();
        ewc.totalMonthlyWage();
    }

    void isAbsent(){
        double isAbsent = Math.floor(Math.random() * 10) % 3;
        if(isAbsent == FULL_TIME){
            System.out.println("Employee is Present.");
        } else if (isAbsent == PART_TIME) {
            System.out.println("Employee is Present Part-Time.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }

    void dailyWageCalculation(){
        double isAbsent = Math.floor(Math.random() * 10) % 3;
        if(isAbsent == 1){
            empHrs = 8;
            System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
        } else if (isAbsent == 2) {
            empHrs = 4;
            System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
        } else {
            System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
        }
    }

    void empAttendance(){
        double isAbsent = Math.floor(Math.random() * 10) % 3;
        switch ((int) isAbsent){
            case 1:
                empHrs = 8;
                System.out.println("Employee is Present for Full-Time.");
                System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
                break;

            case 2:
                empHrs = 4;
                System.out.println("Employee is Present for Part-time.");
                System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
                break;

            default:
                System.out.println("Employee is Absent.");
                System.out.println("Employee Daily Wage is: " + empHrs * WAGE_PER_HOUR);
                break;
        }
    }

    void monthlyWage(){
        while(totalWorkingDays < TOTAL_WORKING_DAYS && empHrs < MAX_WORKING_HRS){
            totalWorkingDays++;

            double isAbsent = Math.floor(Math.random() * 10) % 3;

            switch ((int) isAbsent){
                case 1:
                    empHrs = 8;
                    dailyWage = empHrs * WAGE_PER_HOUR;
                    System.out.println("Day: " + totalWorkingDays);
                    System.out.println("Employee is Present for Full-Time.");
                    System.out.println("Employee Daily Wage is: " + dailyWage);
                    System.out.println("-------------------------");
                    break;

                case 2:
                    empHrs = 4;
                    dailyWage = empHrs * WAGE_PER_HOUR;
                    System.out.println("Day: " + totalWorkingDays);
                    System.out.println("Employee is Present for Part-time.");
                    System.out.println("Employee Daily Wage is: " + dailyWage);
                    System.out.println("-------------------------");
                    break;

                default:
                    dailyWage = empHrs * WAGE_PER_HOUR;
                    System.out.println("Day: " + totalWorkingDays);
                    System.out.println("Employee is Absent.");
                    System.out.println("Employee Daily Wage is: " + dailyWage);
                    System.out.println("-------------------------");
                    break;
            }
            totalWage += dailyWage;
        }
    }

    void totalMonthlyWage(){
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
