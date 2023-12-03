package Com.Sandeep.Ass1;

public class StudentTest extends Student {
	void studentTest() {

	}

	public static void main(String[] args) {
		
		Student student1 = new Student(1000, "sandeep", "male", 23, 8107058611L, 3.4f, 'A', true);
		
		Student student2 = new Student(1001, "Raj", "male", 21, 223456_9999L, 3.4f, 'A', true);

		Student student3 = new Student(1002, "Anita", "female", 20, 223_456_8888L, 4.0f, 'A', true);

		System.out.println("\nStudent.studentCount: " + Student.studentCount);

		System.out.println("\nName of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student3: " + student3.name);

		student1.updateProfile("John");
		System.out.println("Updated name of student1: " + student1.name);

		
		 Student student4 = student1; System.out.println("\nName of student4: " +
		 student4.name);
		 
		 student4.updateProfile("Mike"); System.out.println("Name of student1: " +
		  student1.name);
		 
		 student4 = student2; System.out.println("Name of student4: " +
		 student4.name);
		 
		 student2 = student1; System.out.println("Name of student4: " +
		 student4.name); System.out.println("Name of student2: " + student2.name);
		 
		 student4 = new Student(); student4.updateProfile("Alex");
		 System.out.println("Name of student4: " + student4.name);
		 System.out.println("Name of student2: " + student2.name);
		 System.out.println("Name of student1: " + student1.name);
		 

		Student[] students = { student1, student2, student3 };

		swap(students, 0, 2);

		System.out.println("\nName of student1: " + students[0].name);
		System.out.println("Name of student2: " + students[1].name);
		System.out.println("Name of student3: " + students[2].name);
	}

	static void swap(Student[] students, int firstIndex, int secondIndex) {
		Student temp = students[firstIndex];
		students[firstIndex] = students[secondIndex];
		students[secondIndex] = temp;
	}
}
