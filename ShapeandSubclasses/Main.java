package ShapeandSubclasses;
import java.util.Scanner;
public class Main {

    static void circleDetails() {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();
        System.out.print("Enter the radius: ");
        Double radius = sc.nextDouble();
        obj.setRadius(radius);
        System.out.println("The details are: ");
        System.out.println(obj.toString());
        sc.close();
    }

    static void rectangleDetails() {
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.print("Enter the width: ");
        double wid = sc.nextDouble();
        rec.setWidth(wid);
        System.out.print("Enter the length: ");
        double len = sc.nextDouble();
        rec.setLength(len);
        System.out.println("The details are: ");
        System.out.println(rec.toString());
        sc.close();
    }
    
    static void squareDetails() {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        sq.setSide(side);
        System.out.println("The details are: ");
        System.out.println(sq.toString());
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Circle details\n2. Rectangle details\n3. Sqaure details\n");
        int ch = sc.nextInt();
        if (ch == 1)
        	circleDetails();
        else if (ch == 2)
            rectangleDetails();
        else if(ch==3) 
        	squareDetails();
        else
            System.out.println("Enter choice correctly!");
        sc.close();
    }
}
