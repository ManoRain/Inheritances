package practInheritance;

public class EmpBankDetails extends NaminationDetails {
	
	public void empBankName(String BankName) {
		System.out.println("Bank Name is--" +BankName);
	}
	public void empBankBranchName(String BranchName) {
		System.out.println("Branch Name is--" +BranchName);
	}
	public void empBankAccNumber(int AccNumber) {
		System.out.println("Account Number is--" +AccNumber);
	}
	public void empBankIfscCode(String IfscCode) {
		System.out.println("Bank Name is--" +IfscCode);
	}
	public void empBankMICRCode(int Code) {
		System.out.println("Bank Name is--" +Code);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpBankDetails obj=new EmpBankDetails();
		obj.empBankName("Indian Bank");
		obj.empBankBranchName("Tirupattur");
		obj.empBankAccNumber(974337334);
		obj.empBankIfscCode("IDIB122T109");
		obj.empBankMICRCode(45652);
		obj.naminationName("Rithanya");
		obj.naminationAge(2);
		naminationDob(25121995);
		obj.naminationNative("Jolarpettai");
		obj.empSalary(1000);
		obj.empPfNamination("Elakkiya");
		empNative("Tirupattur");
		
		
		

	}

}
