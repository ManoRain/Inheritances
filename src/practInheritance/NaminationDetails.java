package practInheritance;

public class NaminationDetails extends EmpDetails {
	
	public void naminationName(String Name) {
		System.out.println("Namination Name is--" +Name);
	}
   public void naminationAge(int Age) {
	   System.out.println("Namination Age is--"  +Age);
   }
   static void naminationDob(int Dob) {
	   System.out.println("Naminatio DOB is--"  + Dob);
   }
   public void naminationNative(String Native) {
	   System.out.println("Namination Native is--"  +Native);
   }
 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		NaminationDetails obj=new NaminationDetails();
		obj.naminationName("Rithanya");
		obj.naminationAge(2);
		naminationDob(25121995);
		obj.naminationNative("Jolarpettai");
		obj.empSalary(1000);
		obj.empPfNamination("Elakkiya");
		empNative("Tirupattur");

	}

}
