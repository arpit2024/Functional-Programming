package javapractice;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Employee emp[]=new Employee[input];
		for(int i=0;i<input;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			double salary=sc.nextDouble();
			sc.nextLine();
			String address=sc.nextLine();
			String designation=sc.nextLine();
			emp[i]=new Employee(id,name,salary,address,designation);prati
			
		}
		String entername=sc.nextLine();
		Solution2.retrieveEmployeeData(emp,entername);
		
		String nameinput=sc.nextLine();
		String entercity=sc.nextLine();
		Solution2.updateEmployeeAddress(emp,nameinput,entercity);
		sc.close();

	}
	public static void retrieveEmployeeData(Employee emp[],String name) {
		int n=emp.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(emp[i].getName().equalsIgnoreCase(name)) {
				count++;
				System.out.println("ID: "+emp[i].getId()+", Name: "+emp[i].getName()+", Salary: "+emp[i].getSalary()+", Address: "+emp[i].getAddress()+", Designation: "+emp[i].getDesignation());
			}
		}
		if(count==0) {
			System.out.println("No Employee Details Found.");
		}
	}
	public static void updateEmployeeAddress(Employee emp[],String name,String address) {
		int n=emp.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(emp[i].getName().equalsIgnoreCase(name)) {
				emp[i].setAddress(address);
				count++;
				System.out.println("ID: "+emp[i].getId()+", Name: "+emp[i].getName()+", Salary: "+emp[i].getSalary()+", Address: "+emp[i].getAddress()+", Designation: "+emp[i].getDesignation());
			}
		}
		if(count==0) {
			System.out.println("No Employee Details Found.");
		}
	}

}
class Employee{
	private int id;
	private String name,address,designation;
	private double salary;
	Employee(int id, String name,double salary,String address,String designation){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.designation=designation;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getAddress() {
		return address;
	}
	public String getDesignation() {
		return designation;
	}
	
}
