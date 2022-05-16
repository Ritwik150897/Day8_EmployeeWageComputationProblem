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

    double todaysAttendance(){
        return Math.floor(Math.random() * 10) % 3;
    }

    void monthlyWage(){
        while(totalWorkingDays < TOTAL_WORKING_DAYS && empHrs < MAX_WORKING_HRS){

            totalWorkingDays++;

            EmployeeWageComputation e = new EmployeeWageComputation();
            double attendance = e.todaysAttendance();

            switch ((int) attendance){
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
