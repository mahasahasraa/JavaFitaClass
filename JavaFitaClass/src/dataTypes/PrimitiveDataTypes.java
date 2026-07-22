package dataTypes;


public class PrimitiveDataTypes {

    // Instance Variables (Default Values)

    boolean condition;
    byte age;
    char block;
    double percentage;
    float percent;
    int calculation;
    long serialNo;
    short total;

    public static void main(String[] args) {

        PrimitiveDataTypes obj = new PrimitiveDataTypes();

        System.out.println("========== DEFAULT VALUES ==========");

        System.out.println("boolean : " + obj.condition);
        System.out.println("byte    : " + obj.age);
        System.out.println("char    : " + obj.block);
        System.out.println("double  : " + obj.percentage);
        System.out.println("float   : " + obj.percent);
        System.out.println("int     : " + obj.calculation);
        System.out.println("long    : " + obj.serialNo);
        System.out.println("short   : " + obj.total);

        System.out.println("\n========== BOOLEAN ==========");

        boolean status;          // Declaration
        status = true;           // Initialization
        System.out.println("Status : " + status);

        status = false;
        System.out.println("Status : " + status);

        boolean result = true;   // Declaration + Initialization
        System.out.println("Result : " + result);

        System.out.println("\n========== BYTE ==========");

        byte roomNo;
        roomNo = 100;

        byte studentAge = 127;
        byte rollNo = 23;

        rollNo = 26;

        byte character = 'A';

        System.out.println("Room No  : " + roomNo);
        System.out.println("Age      : " + studentAge);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Character: " + character);

        System.out.println("\n========== CHAR ==========");

        char grade = 'C';
        char letter = 65;

        System.out.println("Grade  : " + grade);
        System.out.println("Letter : " + letter);

        System.out.println("\n========== DOUBLE ==========");

        double marks = 12322.4554542323;

        System.out.println("Marks : " + marks);

        System.out.println("\n========== FLOAT ==========");

        float percentage1 = 1.2323f;
        float percentage2 = 12;

        float num1 = 534535.7578867954664564654649f;
        float num2 = 5.7578867954664564654649f;
        float num3 = 575.789812f;
        float num4 = 53453575.78867954664564654649f;

        System.out.println(percentage1);
        System.out.println(percentage2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("\n========== INT ==========");

        int number = 2147483647;

        number = 127;

        System.out.println("Number : " + number);

        System.out.println("\n========== LONG ==========");

        long mobileNo = 920368547;
        long serialNumber = 9223372036854775807L;

        System.out.println("Mobile No     : " + mobileNo);
        System.out.println("Serial Number : " + serialNumber);

        System.out.println("\n========== SHORT ==========");

        short value = 32767;

        System.out.println("Short Value : " + value);

    }

}