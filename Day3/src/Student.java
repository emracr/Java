
public class Student extends Person{
	
	private String _studentNumber;
	private String[] _lessons;
	
	public String getStudentNumber() {
		return _studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		_studentNumber = studentNumber;
	}
	public String[] getLessons() {
		return _lessons;
	}
	public void setLessons(String[] lessons) {
		_lessons = lessons;
	}
	
}
