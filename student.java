package newclass;

public class student {
	 int id;
	 String name;
     static String collgename="Govt College";
     
     public student() {
		}

     	public student(int x, String y) {
		this.id = x;
		this.name = y;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1=new student();
		student student2=new student(2,"Student2");
		
		System.out.println(student2.id+ "  " +student2.name+ "  " +student1.collgename);
		
	

	}

	
}