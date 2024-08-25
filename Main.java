import java.util.Scanner;

class ResultCalculator{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in subject1: ");
        float S1 = sc.nextFloat();
        System.out.println("Enter the marks in subject2: ");
        float S2 = sc.nextFloat();
        System.out.println("Enter the marks in subject3: ");
        float S3 = sc.nextFloat();
        System.out.println("Enter the marks in subject4: ");
        float S4 = sc.nextFloat();
        System.out.println("Enter the marks in subject5: ");
        float S5 = sc.nextFloat();
        System.out.println("Enter total marks: ");
        float totalMarks = sc.nextFloat();

        float sum = S1 + S2 + S3 + S4 +S5;
        float percentage = (sum / totalMarks) * 100;

        System.out.println(percentage +"%");
    }
}