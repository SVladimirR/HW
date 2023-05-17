package hw5;

public class Employee {
    private String fullName;
    private String jobTitel;
    private int phone;
    private int age;

    public Employee(String fullName, String jobTitel, int phone, int age) {
        this.fullName = fullName;
        this.jobTitel = jobTitel;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitel() {
        return jobTitel;
    }

    public void setJobTitel(String jobTitel) {
        this.jobTitel = jobTitel;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
