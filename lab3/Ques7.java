package lab3;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ques7 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter the date in format: (dd/mm/yyyy): ");
		String date = sc.nextLine();
		LocalDate setDate = LocalDate.parse(date, df);
		
		LocalDate now=LocalDate.now();
		
		Period diff=Period.between(now,setDate);
		System.out.println("Reamaining "+diff.getYears()+" years||"+diff.getMonths()+" Months||"+diff.getDays()+" days");
		
		sc.close();
}
}
