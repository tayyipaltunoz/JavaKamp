package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// arrays
		String[] students = { "Ahmet", "Mehmet", "Veli", "Serdar" };
		
		System.out.println(students[0]);
		
		for(int i=0; i<students.length;i++) {
			System.out.println("For "+ students[i]);
		}
		students[0]="Hakan";

		for (String student : students) {
			System.out.println("Student Name :" + student);
		}

	}

}
