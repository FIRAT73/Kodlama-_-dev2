package work2;

public class CourseManager {
	
	public void addCourse(Course[] courses) {
		for (Course course:courses) {
			System.out.println(course.getCourseName() + " , added\n");
		}
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getCourseName() + " , deleted\n");
	}
	
	public void courseInformation(Course[] courses) {
		System.out.println("Course Information");
		for (Course course : courses) {
			System.out.println("Course name: " + course.getCourseName());
			System.out.println("Course details: " + course.getCourseDetails());
			System.out.println("Course instructor: " + course.getCourseInstructor());
			System.out.println("Course fee: " + course.getCourseFee() + "\n");
		}
	}

}
