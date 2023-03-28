

public class Employee {

    String fullName;
    int department;
    static float salary;
    int id;
    static int count=0;

    public Employee (String fullName,int department,float salary){
        this.fullName=fullName;
        this.department=department;
        this.salary=salary;
        count++;
        this.id=count;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary(float salary) {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }



        }













