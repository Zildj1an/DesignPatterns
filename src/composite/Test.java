package composite;

public class Test {

	public static void main(String[] args){
		
		Composite root = new Composite();
		Composite folderA = new Composite();
		Composite folderB = new Composite();
		
		//Folder A
		
		Leaf l1 = new Leaf(" of the folder A number 1");
		Leaf l2 = new Leaf(" of the folder A number 2");
		folderA.add(l1);
		folderA.add(l2);
		
		
		root.add(folderA);
		root.add(folderB);
		
		//Folder B
		
		Leaf l3 = new Leaf(" of the folder B number 1");
		Leaf l4 = new Leaf(" of the folder B number 2");
		folderB.add(l3);
		folderB.add(l4);
		
		root.operation();
		
	}
}