package mentorSession0706;

public class Employee extends Member{

    private String specialization;

    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


}
