package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager{
    String managerName;
    int managerId;

    @Autowired
    Employee emp1;

    public void work() {
        emp1.work();
        System.out.println("Manager name:" + managerName);
        System.out.println("Manager id:" + managerId);
        System.out.println("Manager working");

    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setEmp1(Employee emp1) {
        this.emp1 = emp1;
    }
}
