
public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getRole() + " olarak sisteme eklendi");
	}
	
	public void update(Student student) {
		System.out.println(student.getRole() + " " + student.getFirstName() + " " + student.getLastName() + " sistemde güncellendi");
	}
	
	public void delete(Student student) {
		System.out.println(student.getRole() + " " +student.getFirstName() + " " + student.getLastName() + " sistemden silindi");
	}
	
}
