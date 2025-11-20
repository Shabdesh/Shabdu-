import java.util.Scanner;

/**
 * Write a description of class human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class human
{
    public static void main(String [] agrs){
        String name="Suhan";
        double weight=75.7;
        System.out.println("My name is :"+ name +"+And,my age is");
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter first number");


// Ternery Operator
  //int age =18;
  Scanner input= new Scanner(System.in);
  int age=input.nextInt();
  
  String isValid =(age>=18)?"Driving is allowed" : "Driving is not allowed";
  System.out.println(isValid);
}
}
