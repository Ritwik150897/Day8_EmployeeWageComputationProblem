public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program.");

        EmployeeWageComputation ewc = new EmployeeWageComputation();
        ewc.isAbsent();
    }

    void isAbsent(){
        double isAbsent = Math.floor(Math.random() * 10) % 2;
        
        if(isAbsent == 1){
            System.out.println("Employee is Present.");
        }else {
            System.out.println("Employee is Absent.");
        }
    }
}
