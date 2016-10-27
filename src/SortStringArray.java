import java.util.*;
public class SortStringArray {
	public static void main(String[] args) {
			String ss[] = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
			Arrays.sort(ss);
			for (int count = 0; count < ss.length; count++) {
				System.out.println (ss[count]);
			}
	}
}