import java.util.Scanner;

public class OnlineExamination {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Login details
        String username = "student";
        String password = "1234";

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        // Login
        System.out.print("Enter Username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter Password: ");
        String enteredPassword = sc.nextLine();

        // Check login
        if (enteredUsername.equals(username)
                && enteredPassword.equals(password)) {

            System.out.println("Login Successful!");

            int choice;

            do {
                // Menu
                System.out.println("\n===== MENU =====");
                System.out.println("1. Update Profile");
                System.out.println("2. Start Exam");
                System.out.println("3. Logout");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // Update Profile
                    case 1:

                        System.out.print("Enter new username: ");
                        username = sc.nextLine();

                        System.out.print("Enter new password: ");
                        password = sc.nextLine();

                        System.out.println("Profile Updated Successfully!");
                        break;

                    // Start Exam
                    case 2:

                        int score = 0;

                        System.out.println("\nExam Started!");
                        System.out.println("Timer: 30 seconds");

                        // Simple Timer
                        try {
                            for (int i = 30; i >= 1; i--) {
                                System.out.println("Time Left: " + i + " seconds");
                                Thread.sleep(1000);
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        System.out.println("\nAnswer the following MCQs");

                        // Question 1
                        System.out.println("\n1. Java is a:");
                        System.out.println("1. Programming Language");
                        System.out.println("2. Animal");
                        System.out.println("3. Fruit");
                        System.out.println("4. Device");

                        int ans1 = sc.nextInt();

                        if (ans1 == 1) {
                            score++;
                        }

                        // Question 2
                        System.out.println("\n2. Which keyword is used for class?");
                        System.out.println("1. define");
                        System.out.println("2. class");
                        System.out.println("3. public");
                        System.out.println("4. create");

                        int ans2 = sc.nextInt();

                        if (ans2 == 2) {
                            score++;
                        }

                        // Question 3
                        System.out.println("\n3. Which company developed Java?");
                        System.out.println("1. Apple");
                        System.out.println("2. Microsoft");
                        System.out.println("3. Sun Microsystems");
                        System.out.println("4. Google");

                        int ans3 = sc.nextInt();

                        if (ans3 == 3) {
                            score++;
                        }

                        // Auto Submit
                        System.out.println("\nExam Auto Submitted!");
                        System.out.println("Your Score: " + score + "/3");

                        break;

                    // Logout
                    case 3:
                        System.out.println("Logged Out Successfully!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 3);

        } else {
            System.out.println("Invalid Username or Password!");
        }

        sc.close();
    }
}