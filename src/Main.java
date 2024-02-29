import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int input;
        long nim; // Menggunakan tipe data long untuk NIM yang panjang
        String username, password;

        while (true) {
            System.out.println("==== Library System ====");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.print("3. Exit");
            System.out.print("Choose option (1-3): ");
            input = inputUser.nextInt();

            if (input == 1) {
                System.out.print("Enter your Nim: ");
                nim = inputUser.nextLong(); // Menggunakan nextLong() untuk menerima input NIM
                System.out.print(String.valueOf(nim).length());
                // Memperbaiki kondisi untuk mengecek panjang NIM
                if (String.valueOf(nim).length() == 15) {
                    System.out.println("Successful login as student");
                } else {
                    System.out.println("User not found");
                }
            } else if (input == 2) {
                System.out.print("Enter your username (admin): ");
                username = inputUser.next();
                System.out.print("Enter your password (admin): ");
                password = inputUser.next();

                // Memperbaiki kondisi untuk mengecek panjang username dan password
                if (Objects.equals(username, "admin") && Objects.equals(password, "admin")) {
                    System.out.println("Successful login as admin");
                } else {
                    System.out.println("Admin not valid!!");
                }
            } else if (input == 3) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}