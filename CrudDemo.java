import java.util.*;

// CRUD (Create Read Update delete) Program 

class Employee{
    private int empno;
    private int salary;
    private String ename;
    Employee (int empno, String ename, int salary)   // create constructor 
    {

        // create instance variable

        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
    }

     // create Get_method
    public int getempno(){
        return empno;
    }
    public int getsalary(){
        return salary;
    }
    public String getename(){
        return ename;
    }
    public String toString()
    {
        return empno+""+ename+""+salary;
        }

}

    // create Main  Method

class CrudDemo
{  
    public static void main(String args[]){
        List<Employee>c = new ArrayList<Employee>();  
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;     // create choice variable
        do{
                // Display message to the user 

                System.out.println("1.INSERT");
                System.out.println("2.DISPLAY");
                System.out.println("3.SEARCH");
                System.out.println("4.DELETE");
                System.out.println("5.UPDATE");

                ch=s.nextInt();

                switch (ch) {
                    case 1:
                              // this case is used for insert data
                    System.out.print("Enter empno:");
                        int eno=s.nextInt();
                    System.out.print("Enter empname:");
                        String ename=s1.nextLine();
                    System.out.print("Enter empsalary");
                        int salary=s.nextInt();

                    c.add(new Employee(eno,ename,salary));
                        break;

                    case 2:
                                // this case is used for Display data
                        System.out.println("----------------------------");
                        Iterator<Employee>i =c.iterator();
                        while(i.hasNext()){
                            Employee e= i.next();
                            System.out.println(e);
                        }
                        System.out.println("----------------------------");
                        break;

                        case 3:
                                // this case is used for Search 
                        boolean found=false;
                        System.out.print("Enter Empno to Search");
                        int empno= s.nextInt();
                        System.out.println("----------------------------");
                        i= c.iterator();
                        while(i.hasNext()){
                            Employee e= i.next();
                            if(e.getempno()== empno){
                                System.out.println(e);
                                found =true;
                            }
                        }if(!found){
                            System.out.println("Record Not Found");
                        }
                        System.out.println("----------------------------");
                        break;

                    case 4:
                                // this case is for delete data
                    found=false;
                    System.out.print("Enter Empno to Delete");
                        empno= s.nextInt();
                    System.out.println("----------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Employee e= i.next();
                        if(e.getempno()== empno){
                            i.remove();
                            found =true;
                        }
                    }if(!found){
                        System.out.println("Record Not Found");
                    }
                    else{
                        
                        System.out.println("Record is Delete Successfully");
                    }
                    System.out.println("----------------------------");
                    break;

                    case 5:
                            // this case is for Update data
                    found=false;
                    System.out.print("Enter Empno to update");
                        empno= s.nextInt();
                    System.out.println("----------------------------");
                    ListIterator<Employee>li = c.listIterator();
                    while(li.hasNext()){
                        Employee e= li.next();
                        if(e.getempno()== empno){
                           System.out.print("Enter new Name");
                           ename=s1.nextLine(); 

                           System.out.print("Enter new salary");
                           salary=s.nextInt(); 
                            li.set(new Employee(empno,ename,salary));
                            found =true;
                        }
                    }if(!found){
                        System.out.println("Record Not Found");
                    }
                    else{
                        
                        System.out.println("Record is Update Successfully");
                    }
                    System.out.println("----------------------------");
                    break;

                    default:
                        break;
                }
        }
        while(ch!=0);
}
}  
