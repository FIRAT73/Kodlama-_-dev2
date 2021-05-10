package work2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("Java & React", "Duration: 2 months","Engin Demiroğ", "Free");
		Course course2 = new Course("C# & Angular", "Duration: 2 months","Engin Demiroğ", "Free");
		Course[] courses = {course1, course2};

		Student student1 = new Student("Fırat Seven", "adsaf@gmail.com");
		
		CourseManager courseManager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		
		courseManager.addCourse(courses);
		courseManager.courseInformation(courses);
		courseManager.deleteCourse(course2);
		courseManager.courseInformation(courses);
		
		studentManager.register(student1);
		studentManager.studentInformation(student1);
	}

}
