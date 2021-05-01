
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getRole() + " olarak sisteme eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getRole() + " " + user.getFirstName() + " " + user.getLastName() + " sistemde g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getRole() + " " +user.getFirstName() + " " + user.getLastName() + " sistemden silindi");
	}
	
}
