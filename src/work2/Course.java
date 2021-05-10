package work2;

public class Course {
	private String courseName;
	private String courseInstructor;
	private String courseFee;
	private String courseDetails;
	
	public Course(String courseName, String courseInstructor, String courseFee, String courseDetails) {
		super();
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseFee = courseFee;
		this.courseDetails = courseDetails;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public String getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}
	
	
}
