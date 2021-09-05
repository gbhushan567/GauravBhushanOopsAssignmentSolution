package Services;

public abstract class SuperDepartment {
    protected String departmentName;

    protected String todaysWork;
    protected String workDeadline;
    protected String todayAHoliday;
    protected String doActivity;
    protected String techStackInformation;

    public abstract String getDepartmentName();
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public abstract String getTodaysWork();

    public void setTodaysWork(String todaysWork) {
        this.todaysWork = todaysWork;
    }

    public String getWorkDeadline() {
        return workDeadline;
    }

    public void setWorkDeadline(String workDeadline) {
        this.workDeadline = workDeadline;
    }

    public String getTodayAHoliday() {
        return todayAHoliday;
    }

    public void setTodayAHoliday(String todayAHoliday) {
        this.todayAHoliday = todayAHoliday;
    }

    public String getdoActivity() {
        return doActivity;
    }

    public void setdoActivity(String activity) {
        this.doActivity = doActivity;
    }

    public String getTechStackInformation() {
        return techStackInformation;
    }

    public void setTechStackInformation(String techStackInformation) {
        this.techStackInformation = techStackInformation;
    }
}
