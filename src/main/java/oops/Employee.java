package oops;

public class Employee {

	
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*Employee(int id,String name,int sal,int dno){
		
		id=empid;
		name=empname;
		sal=salary;
		dno=deptno;
	}*/
	
	
	void setdata(int id,String name,int sal,int dno){
		id=empid;
		name=empname;
		sal=salary;
		dno=deptno;
		
	}
	public void display(){
		
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assigning values to class varaibles using Object --FirstMethod
		
		/*Employee emp1 = new Employee();
		emp1.empid=10;
		emp1.empname="ramesh";
		emp1.salary=100;
		emp1.deptno=100;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empid=20;
		emp2.empname="kamesh";
		emp2.salary=200;
		emp2.deptno=2000;
		emp2.display();*/
		
		/*//Assigning values to class varaible using Constructor
		Employee emp1 = new Employee(101,"ramesh",2000,10);
		emp1.display();
		
		Employee emp2 = new Employee(102,"Raj",3000,30);
		emp2.display();*/
		
		//Assigning values to class varaibles using method
		Employee emp1= new Employee();
		emp1.setdata(10, "Raj", 100, 1000);
		emp1.display();
		
		
	}

}
