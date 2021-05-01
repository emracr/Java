
public class InstructorManager{
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getRole() + " olarak sisteme eklendi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getRole() + " " +instructor.getFirstName() + " " + instructor.getLastName() + " sistemde güncellendi");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getRole() + " " +instructor.getFirstName() + " " + instructor.getLastName() + " sistemden silindi");
	}
}
