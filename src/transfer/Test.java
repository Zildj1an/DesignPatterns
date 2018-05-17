package transfer;

public class Test {
	
	public static void main(String[] args){
		
		School theSchool = new School();
		theSchool.addStudent("Carlitos", 12);
		
		//We have all the info here
		StudentTransfer student = theSchool.getStudent(0);
		System.out.println("Name = " + student.getName());
		System.out.println("Age = " + student.getAge());
	}
}
