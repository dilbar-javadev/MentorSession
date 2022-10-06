package mentorSession0706;

public class TestMemberClass {

    public static void main(String[] args) {

        Employee employee = new Employee("Jack", 35, 123456789, "123 Forest Rd, Toronto", 100000, "Java");

        Manager manager = new Manager("Tom", 40, 987654321, "5-3-1 Tokyo, Japan", 150000, "Sales");


        System.out.println(employee);

        System.out.println(manager);

        employee.printSalary();

        manager.printSalary();
    }
}
