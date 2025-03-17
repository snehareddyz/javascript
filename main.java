import java.util.Scanner;
public class main {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in); //----scanner take user given ip reads it--
	System.out.println("Enter ur name : ");
	String name = scanner.nextLine();
	System.out.println("Enter ur age : ");//--to read an int we use nextInt__
	int age = scanner.nextInt();
	System.out.println("what's the gpa : ");
	double gpa = scanner.nextDouble(); //---to print a double value __
	System.out.println("are you a student? (True/False): ");
	boolean isStudent = scanner.nextBoolean();//---print a boolean value--
	System.out.println("hyi bish" + name);
	System.out.println("ur ass is " + age + "years old");
	System.out.println("the poor gpa is " + gpa );
	System.out.println("Student: " +isStudent);
if(isStudent){
System.out.println("you are enrolled as a student");
}else{
System.out.println("you are not enrolled as a student");
	scanner.close();}
}}
	