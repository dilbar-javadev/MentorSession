package mentorSession0706;

public class Manager extends Member{

    private String department;

    public Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
