import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.nio.charset.Charset;

public class PassConsole {
	
	public static void main(String args[]) throws IOException {
		Console c = System.console();
		if (c == null) {
			System.err.println("No console.");
			System.exit(1);
		}
		
		String login = c.readLine("Enter your login: ");
		char[] oldPassword = c.readPassword("Enter your old password: ");
		
		if (verify(login, oldPassword)) {
			boolean noMatch;
			do {
				char[] newPassword1 = c.readPassword("Enter new password: ");
				char[] newPassword2 = c.readPassword("Reenter new password: ");
				noMatch = ! Arrays.equals(newPassword1, newPassword2);
				if (noMatch) {
					c.format("Passwords don't match.  Try again. %n");
				} else {
					change(login, newPassword1);
					c.format("Password for %s changed.%n", login);
				}
				Arrays.fill(newPassword1, ' ');
				Arrays.fill(newPassword2, ' ');
			} while (noMatch);
		}
		
		String op = new String(oldPassword);
		System.out.println("oldPassword: " + op);
		int i = 0;
		while (i < op.length()) {
			System.out.println("Unicode character at password position " 
			+ i + ": "
			+ op.codePointAt(i));
			i++;
		} 
		Arrays.fill(oldPassword, ' ');
		String op2 = new String(oldPassword);
		System.out.println("oldPassword: " + op2 + op2.length());
	} 
	
	// Dummy change method.
	static boolean verify(String login, char[] password) {
		return true;
	}
	
	// Dummy change method.
	static void change(String login, char[] password) {
	}
}
