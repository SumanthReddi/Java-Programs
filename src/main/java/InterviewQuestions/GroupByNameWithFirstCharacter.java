package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByNameWithFirstCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "anna", "Brian", "carol","ascii","zoo");
		
		Map<Character,List<String>> groupedNames=names.stream().collect(Collectors.groupingBy(name -> Character.toUpperCase(name.charAt(0))));

       //System.out.println(groupedNames);
       
       groupedNames.forEach((k,v)->
       System.out.println(k + " -> " + String.join(", ", v)));
	}

}
