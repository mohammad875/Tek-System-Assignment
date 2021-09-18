
public class Test

{
    public static void main(String[] args)
    {
        // create an employee object

        Employee ob = new Employee();
       
        ob.setName("Chandler Bing");
        ob.setEmployeeCode(101);
        ob.setSalary(100000);
        ob.setDepartment("Sales");
        ob.setManager(true);
        ob.setPartTime(false);

        System.out.println("Name : " + ob.getName());
        System.out.println("Employee Code : " + ob.getEmployeeCode());
        System.out.println("Salary : $" + ob.getSalary());
        System.out.println("Department : " + ob.getDepartment());
        System.out.println("Manager : " + ob.isManager());
        System.out.println("Part Timer : " + ob.isPartTime());
    }
}