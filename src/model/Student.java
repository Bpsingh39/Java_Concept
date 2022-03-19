package model;

import java.util.Objects;

public class Student {
    String name;
    int roll_no;
    String branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no;
    }

    @Override
    public int hashCode() {
        return roll_no;
    }

    public Student(String name, int roll_no, String branch) {
        this.name = name;
        this.roll_no = roll_no;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
