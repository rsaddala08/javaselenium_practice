
public class JumpStatements {

	public static void main(String[] args) {

		int age = 2;

		for (int i = 1; i <= 5; i++) {

			if (i == age) {
				System.out.println("Data matched");
				break;
			} else {
				continue;
			}

		}

	}

}
