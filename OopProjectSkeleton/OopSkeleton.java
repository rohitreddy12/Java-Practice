package OopProjectSkeleton;

public class OopSkeleton {
   
}

class Employee{
    private int empId;
    private String empName;
    private String empLocation;

    
    public Employee(int empId, String empName, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empLocation = empLocation;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpLocation() {
        return empLocation;
    }
    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    
}

class Manager extends Employee{
    private int noOfEmp;

    public Manager(int empId, String empName, String empLocation, int noOfEmp) {
        super(empId, empName, empLocation);
        this.noOfEmp = noOfEmp;
    }

    public int getNoOfEmp() {
        return noOfEmp;
    }

    public void setNoOfEmp(int noOfEmp) {
        this.noOfEmp = noOfEmp;
    }
}

class Developer extends Employee{
    private String manager;

    public Developer(int empId, String empName, String empLocation, String manager) {
        super(empId, empName, empLocation);
        this.manager = manager;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
