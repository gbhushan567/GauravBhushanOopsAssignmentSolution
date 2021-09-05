package Model;

import Services.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
    public AdminDepartment(String departmentName, String todaysWork, String workDeadline, String todayAHoliday){
        super.departmentName =departmentName;
        super.todaysWork = todaysWork;
        super.workDeadline = workDeadline;
        super.todayAHoliday = todayAHoliday;
    }

     @Override
     public String toString() {
         return "Welcome to " + this.getDepartmentName() + "\n" + this.getTodaysWork() + "\n" + this.getWorkDeadline() + "\n" + this.getTodayAHoliday() + "\n";
     }

     @Override
     public String getDepartmentName() {

         return this.departmentName;
     }

     @Override
     public void setDepartmentName(String departmentName) {

         super.setDepartmentName(departmentName);
     }

     @Override
     public String getTodaysWork() {
         return this.todaysWork;
     }

     @Override
     public void setTodaysWork(String todaysWork) {
         this.setTodaysWork(todaysWork);
     }

     @Override
     public String getWorkDeadline() {
         return this.workDeadline;
     }

     @Override
     public void setWorkDeadline(String workDeadline) {
         this.setWorkDeadline(workDeadline);
     }
 }