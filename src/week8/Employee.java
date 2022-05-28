package week8;

import week7.task1.Person;

abstract public class Employee extends Person {
    private String office;
    private String dateHired;
    private double salary;
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Employee(){}

    public Employee(String name) {
        super(name);
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Class Name: Employee\nName: " + getName();
    }

    public abstract void bonus();
    public abstract void emailCheck();
    public abstract double annualSalary();
}
