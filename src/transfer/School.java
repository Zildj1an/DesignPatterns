package transfer;

import java.util.ArrayList;

public class School {
	
	private ArrayList<StudentTransfer> members;
	
	School(){
		members = new ArrayList<StudentTransfer>();
	}
	
	public void removeAll(){
		members.clear();
	}
	
	public void addStudent(String name, int age){
		members.add(new StudentTransfer(name,age));
	}
	
	public StudentTransfer getStudent(int index){
		return members.get(index);
	}
	

}
