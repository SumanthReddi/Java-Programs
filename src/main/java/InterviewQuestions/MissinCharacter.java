package InterviewQuestions;
import java.util.ArrayList;
import java.util.List;

public class MissinCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strArr = {"B","G"};
	        List<String> missingStrings = new ArrayList<>();

	        for (int i = 0; i < strArr.length - 1; i++) {
	            char current = strArr[i].charAt(0);
	            char next = strArr[i + 1].charAt(0);

	            for (char c = (char)(current + 1); c < next; c++) {
	                missingStrings.add(String.valueOf(c));
	            }
	        }

	        if (missingStrings.isEmpty()) {
	            System.out.println("No missing strings.");
	        } else {
	            System.out.println("Missing strings: " + missingStrings);
	        }

		 

	}

}
