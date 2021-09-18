class Employee

{
    public String name;

    public int EmployeeCode;

    public int salary;

    // true if he is manager

    public boolean manager;

    // true if he is part time

    public boolean part_time;

    public String department;

    // default constructor

    Employee()

    {

        this.name = "";
        this.EmployeeCode = 0;
        this.salary = 0;
        this.manager = false;
        this.department = "";
        this.part_time = false;

    }

    // constructor

    Employee(String name, int EmployeeCode, int salary, boolean manager, String department, boolean part_time)

    {
        this.name = name;
        this.EmployeeCode = EmployeeCode;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
        this.part_time = part_time;

    }

    // getter method

    public String getName()

    {
        return this.name;
    }

    public int getEmployeeCode()

    {
        return this.EmployeeCode;
    }

   public int getSalary()
    {
        return this.salary;
    }

    public String getDepartment()

    {
        return this.department;
    }

    // setter method
    public void setName(String name)

    {
       this.name = name;
    }

   public void setEmployeeCode(int EmployeeCode)
    {
        this.EmployeeCode = EmployeeCode;
    }

    public void setSalary(int salary)

    {
        this.salary = salary;
    }

   

    public void setDepartment(String department)

    {
        this.department = department;
    }

    public void setManager(boolean manager)
    {
        this.manager = manager;
    }

    public void setPartTime(boolean part_time)
    {
        this.part_time = part_time;
    }

    // return true if he is manager
    public boolean isManager()
    {
        return this.manager;
    }

    // return true if he is part timer
    public boolean isPartTime()
    {
        return this.part_time;
    }
}

