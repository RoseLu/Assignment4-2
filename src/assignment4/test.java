package assignment4;

public class test {

	public static void main(String[] args) {
		Course cs1 = new Course("Java");
		Course cs2 = new Course("Web Design");
		
		Student s1 = new Student("Jane", "0138");
		Student s2 = new Student("Sam", "0135");
		Student s3 = new Student("Mike", "0139");
		Student s4 = new Student("Lily", "0121");
		Student s5 = new Student("kitty", "0107");
		Student s6 = new Student("Harry", "1008");
		Student s7 = new Student("Frank", "1510");
		Student s8 = new Student("Kevin", "1431");
		Student s9 = new Student("Monica", "0310");
		Student s10 = new Student("Mia", "0321");
		Student s11 = new Student("Jack", "0123");
		
		cs1.registerStudent(s1);
		cs1.registerStudent(s2);
		cs1.registerStudent(s3);
		cs1.registerStudent(s4);
		cs1.registerStudent(s5);
		cs1.registerStudent(s6);
		cs1.registerStudent(s7);
		cs1.registerStudent(s8);
		cs1.registerStudent(s9);
		cs1.registerStudent(s10);
		cs1.registerStudent(s11);
		cs2.registerStudent(s3);
		cs2.registerStudent(s1);
		cs2.registerStudent(s4);
		
		boolean f1 = cs1.isFull();
		System.out.println("Is course " + cs1.getTitle() + " full? " + f1);
		boolean f2 = cs2.isFull();
		System.out.println("Is course " + cs2.getTitle() + " full? " + f2);
	}

}
