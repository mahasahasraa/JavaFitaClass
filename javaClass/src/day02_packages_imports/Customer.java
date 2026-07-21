/**
 * Program Name : ProgramStructureDemo
 * Description  : Demonstrates all the basic sections of a Java program.
 * Author       : Mahalakshmi
 * Date         : 21-07-2026
 */

package day02_packages_imports;

// Importing a specific class
import java.util.Scanner;

// Importing all classes from a package
import java.util.*;

// User-defined imports (Uncomment after creating these classes)
// import com.java.db.Database1;
// import com.java.db.Database2;
// import com.java.db.AssetDetails;
// import com.java.db.*;

public class Customer {

    public static void main(String[] args) {

        // Primitive Variable Declaration
        int id = 101;
        String name = "Mahalakshmi";

        // Object Reference Declaration
        Scanner scan;

        // Object Creation
        scan = new Scanner(System.in);

        // User-defined Object References (Currently only declarations)
        // AssetDetails asset;
        // Database1 db1;
        // Database2 db2;

        // Output Statements
        System.out.println("Java Program Structure");
        System.out.println("----------------------");
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);

        // Taking Input
        System.out.print("Enter your city: ");
        String city = scan.nextLine();

        System.out.println("City : " + city);

        // Closing the Scanner
        scan.close();
    }
}