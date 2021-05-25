import java.util.*;

class Employee {
    public String name;
    public int yearofjoining;
    public int salary;
    public String address;
    ArrayList<String> nameList = new ArrayList<String>();
    ArrayList<String> yearofjoiningList = new ArrayList<String>();
    ArrayList<String> salaryList = new ArrayList<String>();
    ArrayList<String> addressList = new ArrayList<String>();
    
    public static char choice = 'n';
    public Employee() {
    }

    public Employee(String name, int salary, int yearofjoining, String address) {
        // this keyword refers to the current object in a method or constructor.
        this.name = name;
        this.salary = salary;
        this.yearofjoining = yearofjoining;
        this.address = address;
    }

    public void GetEmployeeData() {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of employee: ");
            name = sc.next();
            nameList.add(name);
            System.out.println("Enter the salary of employee: ");
            salary = sc.nextInt();
            salaryList.add(Integer.toString(salary));
            System.out.println("Enter the date of joining of employee: ");
            yearofjoining = sc.nextInt();
            yearofjoiningList.add(Integer.toString(yearofjoining));

            System.out.println("Enter the address of the employee : ");
            address = sc.next();
            addressList.add(address);
            System.out.println("Do You Want to Enter More : y/n?");
            choice = sc.next().charAt(0);
        }
    }

    public void DisplayEmployee() {
        System.out.println("Name\tYearofjoining\tAddress\tsalary");
        for (int i = 0;i<nameList.size();i++) {
        System.out.println(nameList.get(i)+'\t'+yearofjoiningList.get(i)+'\t'+'\t'+addressList.get(i)+'\t'+salaryList.get(i));
        }
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        do
        {
            
            // Showing Employee details
            emp.GetEmployeeData();
        }
        while(choice =='y');
        emp.DisplayEmployee();
    }
}

