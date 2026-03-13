package InterviewQuestions;
import java.util.HashMap;

public class numberOccurence {
        public static void main(String[] args) {
            String num="12345612233";
            char ch1[]=num.toCharArray();
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            for(int i=0;i<ch1.length;i++){
                if(map.containsKey(ch1[i])){
                    map.put(ch1[i],map.get(ch1[i])+1);
                }
                else{
                    map.put(ch1[i],1);
                }
            }
            System.out.println(map);
        }
    }