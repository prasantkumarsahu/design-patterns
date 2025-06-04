package mediatorPattern;

import java.util.Date;

public interface ChatRoom {

	static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" +
				user.getName() + "] : " + message);
	}
}
