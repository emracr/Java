
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Emrullah");
		user1.setLastName("ACAR");
		user1.setEmail("emrullah@gmail.com");
		user1.setPassword("123456");
		user1.setRole("Kullanýcý");
		
		Instructor instructor1 = new Instructor();
		String[] profession = {"C#","Java","Python"};
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setUserName("engin.demirog.21");
		instructor1.setPassword("engin.123");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setPhoneNumber("05555555555");
		instructor1.setProfession(profession);
		instructor1.setRole("Eðitmen");
		
		
		Student student1 = new Student();
		String[] lessons = {"C#","Java"};
		student1.setId(1);
		student1.setFirstName("Emrullah");
		student1.setLastName("ACAR");
		student1.setStudentNumber("112233");
		student1.setLessons(lessons);
		student1.setRole("Öðrenci");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.add(user1);
		instructorManager.add(instructor1);
		studentManager.add(student1);
	}

}
