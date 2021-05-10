package work2;

public class StudentManager {
	
	public void register(Student student) {
		System.out.println(student.getName() + " , you registered.\n");
	}
	
	public void delete(Student student) {
		System.out.println(student.getName() + " , your account deleted\n");
	}
	
	public void studentInformation(Student student) {
		System.out.println("Information");
		System.out.println("Name: " + student.getName());
		System.out.println("Mail address: " + student.getMail() + "\n");
	
	}

}
