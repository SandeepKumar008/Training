package Com.Sandeep.Ass1;

public class Student {
	int id;
	String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;
	boolean international;
	double tutionFees = 12000.0;
	double internationalfee = 15000.00;
	static int studentCount = 0;
	static int studentCompute = 0;

	public Student(int id, String name, String gender, int age, long phone, float gpa, char degree,
			boolean international) {
		super();
		this.id = id;
		this.name = name.toUpperCase();
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
		this.international = international;
		studentCount = studentCount + 1;
		int nextId = id + 1;
		System.out.println("\nid: " + id);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("nextId: " + nextId);
		System.out.println("age: " + age);
		System.out.println("phone: " + phone);
		System.out.println("gpa: " + gpa);
		System.out.println("degree: " + degree);
		System.out.println("compute() funtion: " + studentCompute);

	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String gender, int age, long phone, float gpa, char degree) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.gpa = gpa;
		this.degree = degree;
	}

	boolean updateProfile(String name) {
		this.name=name;
		return true;
		
	}

	//These all lines as cut and pasted in Student Test class
	public static void main(String[] args) {

//		Student student1 = new Student(1000, "sandeep", "male", 23, 8107058611L, 3.4f, 'A', true);
//		Student student2 = new Student(1001, "supreet", "male", 23, 8107058611L, 2.4f, 'A');
//		Student student3 = new Student(1002, "kartik", "male", 23, 675744456L, 2.4f, 'A', true);
		/*
		 * this is commented bcz all this we don't required as we have defined the
		 * constructor and parameter are self defined in the constructor for the
		 * objects.
		 */
//		student1.id = 1000;
//		student1.name = "sandeep";// here we are hard coding the state and we should not do that in Instance variable
//		student1.gender = "male";
//		student1.age = 23;
//		student1.phone = 83959_23424L;
//		student1.gpa = 3.4f;
//		student1.degree = '\u058D';
//		student1.international = true;
//		student1.tutionFees = 12000.0;
//		student1.Internationalfee = 1500.00;
//		System.out.println("Number of times function Invoke:  " +studentCount);
//		double discountper=0.9;
//		double discountamount= price*discountper;
//		System.out.println(price -discountamount);
//		
//		BigDecimal f = new BigDecimal("0.9");
//		BigDecimal s= new BigDecimal("1");
//		System.out.println(f.subtract(s));
		//System.out.println("Number of times function Invoke:  " + studentCount);
//System.out.println(student1.name);
	}

}
