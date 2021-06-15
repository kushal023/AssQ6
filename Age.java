import java.util.Scanner;
class Age{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);
System.out.println("Enter first name :");
String fname=sc.nextLine();

System.out.println("Enter last name :");
String lname=sc.nextLine();

System.out.println("Enter your age :");
int age=sc.nextInt();

System.out.println("FirstName : "+ fname);
System.out.println("LastName : "+lname);
System.out.println("age : "+age);

}
}
