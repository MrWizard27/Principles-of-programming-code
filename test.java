import java.util.Scanner;
public class test{
    public static double calculateArea(double radius) {
      return Math.PI * radius * radius ;
      }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the diameter of your circle");
        double diameter = input.nextDouble();
        double area = calculateArea(diameter/2);
        System.out.println(area);
      }
    }
    
