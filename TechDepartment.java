package Model;

import Services.SuperDepartment;

public class TechDepartment extends SuperDepartment{

    public TechDepartment(String departmentName, String todaysWork, String workDeadline, String techStackInformation, String todayAHoliday){
        this.departmentName = departmentName;
        this.todaysWork = todaysWork;
        this.workDeadline = workDeadline;
        this.techStackInformation = techStackInformation;
        this.todayAHoliday = todayAHoliday;
    }

    @Override
    public String toString() {
        return "Welcome to " + this.departmentName + "\n" + this.todaysWork + "\n" + this.workDeadline + "\n" + this.techStackInformation + "\n" + this.todayAHoliday + "\n";

    }

    @Override
    public String getDepartmentName() {
        return null;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        super.setDepartmentName(departmentName);
    }

    @Override
    public String getTodaysWork() {
        return null;
    }

    @Override
    public void setTodaysWork(String todaysWork) {
        super.setTodaysWork(todaysWork);
    }

    @Override
    public String getWorkDeadline() {
        return super.getWorkDeadline();
    }

    @Override
    public void setWorkDeadline(String workDeadline) {
        super.setWorkDeadline(workDeadline);
    }

    @Override
    public String getTodayAHoliday() {
        return super.getTodayAHoliday();
    }

    @Override
    public void setTodayAHoliday(String todayAHoliday) {
        super.setTodayAHoliday(todayAHoliday);
    }

    @Override
    public String getTechStackInformation() {
        return super.getTechStackInformation();
    }

    @Override
    public void setTechStackInformation(String techStackInformation) {
        super.setTechStackInformation(techStackInformation);
    }
}
