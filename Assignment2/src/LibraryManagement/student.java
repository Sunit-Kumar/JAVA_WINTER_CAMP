package LibraryManagement;

import java.util.Scanner;

public class student {

    String studentName;
    String regNum;

    book borrowedBooks[] = new book[3];
    public int booksCount = 0;

    Scanner input = new Scanner(System.in);

    // Constructor
    public student()
    {
        // Print statement
        System.out.println("Enter Student Name:");

        // This keywords refers to current instance
        this.studentName = input.nextLine();

        System.out.println("Enter Registration Number:");
        this.regNum = input.nextLine();
    }
}
