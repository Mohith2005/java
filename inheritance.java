package demo;
class Person {                       //Level 1:Base class
	String name;
    	int age;
     	void setPersonData(String name, int age){
          		this.name=name;
          		this.age=age;
     	}
     	void displayPersonData() {
         		System.out.println("Name:"+name);
         		System.out.println("Age:"+age);
     	}
}
class Employee  extends Person{          //Level 2:Base class
	String empId;
     	void setEmpData(String id){
        		empId=id;
     	}
	void displayEmpData(){
         		System.out.println("ID:"+empId);
     	}
}



class Manager extends Employee {            //child class
	String dept;
     	float sal;
     	void setManagerData(String depart, float salary){
        		dept = depart;
        		sal=salary;
     	}
     	void displayManagerData(){
         		System.out.println("Department:"+dept);
         		System.out.println("Salary :"+ sal);
     	}
}

public class inheritance {
  
	public static void main(String args[]) {
		Manager m=new Manager();           //child class object
       		m.setPersonData("Arun", 34);
       		m.setEmpData("M123");
       		m.setManagerData("Marketing",60000);
       		m.displayPersonData();
       		m.displayEmpData();
       		m.displayManagerData();
    	}

   
}
