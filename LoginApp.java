import java.util.Scanner;

class LoginSystem {

    // Method to validate email
    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".") 
               && email.indexOf("@") < email.lastIndexOf(".");
    }

    // Method to validate password
    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }
}

public class LoginApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN SYSTEM ===");

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean emailValid = LoginSystem.isValidEmail(email);
        boolean passwordValid = LoginSystem.isValidPassword(password);

        if (emailValid && passwordValid) {

            System.out.println("\nLogin Successful ");
            System.out.println("\n=== PRODUCT LIST ===");
            System.out.println("1. Laptop - Rs 50000");
            System.out.println("2. Mobile - Rs 20000");
            System.out.println("3. Headphones - Rs 2000");
            System.out.println("4. Keyboard - Rs 1500");

        } else {

            System.out.println("\nLogin Failed ");

            if (!emailValid) {
                System.out.println("Invalid Email Format!");
            }

            if (!passwordValid) {
                System.out.println("Password must be at least 6 characters!");
            }
        }

        sc.close();
    }
}
