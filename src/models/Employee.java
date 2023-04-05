package models;

import java.util.Date;

public abstract class Employee {
    private Integer bemsid;
    private String name;
    private Enum gender;
    private Enum role;
    private String password;
    Date date;

    public Integer getBemsid() {
        return bemsid;
    }

    public void setBemsid(Integer bemsid) {
        this.bemsid = bemsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    public Enum getRole() {
        return role;
    }

    public void setRole(Enum role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "bemsid=" + bemsid +
            ", name='" + name + '\'' +
            ", gender=" + gender +
            ", role=" + role +
            ", password='" + password + '\'' +
            '}';
    }
}
