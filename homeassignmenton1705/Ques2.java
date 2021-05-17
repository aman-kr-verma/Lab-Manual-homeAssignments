//Write a java program to remove al duplicates from a given string?
package homeassignmenton1705;
import java.util.*;

class Ques2 {
	static String removeDuplicate(char str[], int n) {
		int index = 0;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		char str[] = in.toCharArray();
		System.out.println(removeDuplicate(str,str.length));
		sc.close();
	}
}


