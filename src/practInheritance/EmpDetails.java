package practInheritance;

public class EmpDetails {

	
	
	public void empSalary(int a) {
		System.out.println("Monthly Employe Salary Is--->" +a);
	}
	public void empPfNamination(String Name) {
		System.out.println("Employee PF Namination is-->"+Name);
	}
	static void empNative(String City) {
		System.out.println("Employee Native is--->" +City);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDetails obj=new EmpDetails();
		obj.empSalary(1000);
		obj.empPfNamination("Elakkiya");
		empNative("Tirupattur");
		

	}

}
