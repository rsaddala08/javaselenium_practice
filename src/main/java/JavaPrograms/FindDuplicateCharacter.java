package JavaPrograms;
import java.util.HashSet;

public class FindDuplicateCharacter {

	static char getDuplicate(char[] str) {
		HashSet<Character> h = new HashSet<>();
		for (int i = 0; i < str.length - 1; i++) {
			char c = str[i];
			if (h.contains(c)) {
				return c;
			} else {
				h.add(c);
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		String str = "PRADEEP";
		char[] arr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println(getDuplicate(arr));
	}
}
