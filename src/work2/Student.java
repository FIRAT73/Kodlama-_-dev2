package work2;

public class Student {
	private String Name;
	private String mail;
	
	public Student(String name, String mail) {
		super();
		Name = name;
		this.mail = mail;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
