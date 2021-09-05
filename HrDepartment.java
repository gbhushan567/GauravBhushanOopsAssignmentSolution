package Model;

import Services.SuperDepartment;

public class HrDepartment extends SuperDepartment{
    public HrDepartment(String departmentName, String doActivity, String todayswork, String workDeadline, String todayAholiday) {
        this.departmentName= departmentName;
        this.doActivity =doActivity;
        this.todaysWork =todayswork;
        this.workDeadline = workDeadline;
        this.todayAHoliday = todayAholiday;
    }

    @Override
    public String toString() {
        return "Welcome to " + this.departmentName + "\n" + this.doActivity + "\n" + this.todaysWork + "\n" + this.workDeadline + "\n" + this.todayAHoliday + "\n";

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
    public String getdoActivity() {
        return super.getdoActivity();
    }

    @Override
    public void setdoActivity(String activity) {
        super.setdoActivity(activity);
    }
}
