package com.rohit.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "department", catalog = "rrd")
public class Department {
    @Id
    int departmentId;
    String departmentName;
    int departmentStrength;
    String departmentLocation;
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentStrength() {
        return departmentStrength;
    }

    public void setDepartmentStrength(int departmentStrength) {
        this.departmentStrength = departmentStrength;
    }



    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }



}


