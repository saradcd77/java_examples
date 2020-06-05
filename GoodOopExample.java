public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public Employee(int baseSalary){ // Construction overloading -- (Polymorphism)
        this(setBaseSalary,0)
    }


    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int calculateWage() { // Method overloading -- (Polymorphism)
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) { // Encapsulation
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() { // Encapsulation
        return hourlyRate;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;

    }

    public static void main(String [] args){
        Employee emp = new Employee(5000, 80);
        System.out.println(emp.calculateWage(10));

        Employee emp1 = new Employee(10000);
        System.out.println(emp1.calculateWage());
    }
}

