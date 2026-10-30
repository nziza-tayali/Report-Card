import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String studentGrade = scanner.nextLine();

        
        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();

        System.out.print("Enter marks for Mathematics: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Social Science: ");
        int socialScience = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Biology: ");
        int biology = scanner.nextInt();

        
        int totalMarks = english + math + socialScience + chemistry + physics + biology;
        int average = totalMarks / 6;

        // 4. Display in report card format
        System.out.println("\n----------------------------------");
        System.out.println("           REPORT CARD            ");
        System.out.println("NAME: " + name + " | GRADE: " + studentGrade);
        System.out.println("----------------------------------");
        System.out.println("SUBJECT            MARK           ");
        System.out.println("----------------------------------");
        System.out.printf("English            %d%n", english);
        System.out.printf("Mathematics        %d%n", math);
        System.out.printf("Social Science     %d%n", socialScience);
        System.out.printf("Chemistry          %d%n", chemistry);
        System.out.printf("Physics            %d%n", physics);
        System.out.printf("Biology            %d%n", biology);
        System.out.println("----------------------------------");
        System.out.printf("TOTAL: %d | AVERAGE: %d%n", totalMarks, average);
        System.out.println("----------------------------------");

        scanner.close();
    }
}