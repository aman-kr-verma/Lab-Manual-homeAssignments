package lab9.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainClass {
	//using constructor reference
		final static List<MethodReferenceClass> list=new ArrayList<MethodReferenceClass>();
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String name;
			int age;
			char ch='y';
			do {
				System.out.println("Select One choice: \n1.Create");
				System.out.println("2.Read");
				System.out.println("3.Update");
				System.out.println("4.Delete");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the age and nam1e: ");
					MethodReferenceConstructor i=MethodReferenceClass::new;
					list.add(i.MethodReference(sc.nextInt(), sc.next()));
					break;
				case 2:
					for(MethodReferenceClass obj:list) {
						System.out.println(obj);
					}
					break;
				case 3:
					System.out.println("Enter the name: ");
					name=sc.next();
					for(MethodReferenceClass obj:list) {
						if(obj.getName()==name) {
							System.out.println("Enter the age: ");
							obj.setAge(sc.nextInt());
						}
					}	
					break;
				case 4:
					System.out.println("Enter the name to be deleted: ");
					name=sc.next();
					MethodReferenceClass temp=null;
					for(MethodReferenceClass obj:list) {
						if(obj.getName()==name) {
							temp=obj;
						}
					}
					list.remove(temp);
					break;
					default:
						System.out.println("Wrong choice!");
				}
				System.out.println("Do you want to continue? y/n");
				ch=sc.next().trim().charAt(0);
			}while(ch=='y');
		}

	}
