package course37;

public class Employee {
   private String name;
   static String company;
   private String yakusyoku;
   private int salary;
   
   Employee(){
	   this.name = "未設定";
	   this.company= "未設定";
	   this.yakusyoku= "未設定";
	   this.salary = 99999;
   }
   
   void display() {
	   System.out.println(this.name);
	   System.out.println(this.company);
	   System.out.println(this.yakusyoku);
	   System.out.println(this.salary);
	   
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public static String getCompany() {
	return company;
}

public static void setCompany(String company) {
	Employee.company = company;
}

public String getYakusyoku() {
	return yakusyoku;
}

public void setYakusyoku(String yakusyoku) {
	this.yakusyoku = yakusyoku;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
   
   
}
