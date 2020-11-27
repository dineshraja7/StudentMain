package com.rohit.student.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "subject", catalog = "rrd")
public class Subject {
    @Id
    int subjectId;
    String subjectName;
    int handlingStaff;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getHandlingStaff() {
        return handlingStaff;
    }

    public void setHandlingStaff(int handlingStaff) {
        this.handlingStaff = handlingStaff;
    }
}
