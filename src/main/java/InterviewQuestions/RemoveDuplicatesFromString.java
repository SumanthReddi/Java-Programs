package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromString {

        public static void main(String[] args) {
            String str="hellohellouikj";
            char ch[]=str.toCharArray();
            HashMap<Character,Integer> map=new HashMap();
            for(char ch1:ch) {
                if(map.containsKey(ch1)) {
                    map.put(ch1, map.get(ch1)+1);

                }
                else {
                    map.put(ch1, 1);
                }
            }
            System.out.println(map);

            for(Map.Entry<Character,Integer> set:map.entrySet()) {
                if(set.getValue()==1) {
                    System.out.println(set.getKey());
                }
            }
        }
    }
