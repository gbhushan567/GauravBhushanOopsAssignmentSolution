package Main;

import Model.AdminDepartment;
import Model.HrDepartment;
import Model.TechDepartment;

public class Main {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment("Admin Department", "Complete your documents Submission", "Complete by EOD ", "Today is not a holiday");
        System.out.println(adminDepartment);

        HrDepartment hrDepartment = new HrDepartment("HR Department", "Team Lunch", "Fill today's timesheet and mark your attendance", "Complete by EOD", "Today is not a Holiday");
        System.out.println(hrDepartment);

        TechDepartment techDepartment = new TechDepartment("Tech Department", "Complete Coding Module 1", "Complete by EOD", "Core Java", "Today is a holiday");
        System.out.println(techDepartment);
    }
}
