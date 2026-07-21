/*
 * Program Name : ProgramStructureDemo
 * Description  : Demonstrates the complete structure of a Java program.
 * Author       : Mahalakshmi
 * Date         : 21-07-2026
 */

package package_imports;

// Importing a specific class
import java.util.Scanner;

// Importing all classes from a package
import java.util.*;

// User-defined imports (Example)
// import com.java.db.Database1;
// import com.java.db.Database2;
// import com.java.db.AssetDetails;
// import com.java.db.*;

interface Office {

    String officeName = "Amazon";

    void printStaffDetails();

}

class Staff {

    final String department = "Admin";

    int id;
    String name;
    int age;

    void printStaffDetails() {

        System.out.println("\n========== Staff Details ==========");
        System.out.println("Office      : " + Office.officeName);
        System.out.println("Department  : " + department);
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
    }

}

public class ProgramStructureDemo {

    public static void main(String[] args) {

        // Object Reference Declaration
        Scanner scan;

        // Object Creation
        scan = new Scanner(System.in);

        // User-defined Object Reference and Object Creation
        Staff staff = new Staff();

        // User Input
        System.out.print("Enter Staff ID : ");
        staff.id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Staff Name : ");
        staff.name = scan.nextLine();

        System.out.print("Enter Staff Age : ");
        staff.age = scan.nextInt();

        // Calling Method
        staff.printStaffDetails();

        // Close Scanner
        scan.close();

    }

}