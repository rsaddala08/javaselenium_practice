package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class IdentifyCategory {

	public static void main(String[] args) {

		//Checking Based on user input
		String inputTool = "Appium";

		List<String> tools = new ArrayList<String>();

		tools.add("Selenium");
		tools.add("Rest Assured");
		tools.add("Appium");

		for (int i = 0; i <= tools.size(); i++) {

			String toolType = tools.get(i);
			if (toolType.equalsIgnoreCase(inputTool)) {
				System.out.println("The category of tool type is: " + toolType);
				break;
			} else {
				System.err.println("Sorry this is not in our database!!");
			}
		}
	}

}
