package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class FindOccurenceOfVowelsAndNumbersInStringSorting {
        public static void main(String[] args) {
            String str="swathi12387as4ju9";
            char ch1[]=str.toCharArray();
            HashMap<Character,Integer> map=new HashMap<>();

            for(int i=0;i<str.length();i++){
                if(ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u'){
                    if(map.containsKey(ch1[i])){
                        map.put(ch1[i],map.get(ch1[i])+1);
                    }
                    else{
                        map.put(ch1[i],1);
                    }
                }
            }

            System.out.println(map);

            HashSet<Integer> set=new HashSet();
            for(char ch:ch1){
                if(Character.isDigit(ch)){
                    int num=Character.getNumericValue(ch);
                    set.add(num);
                }
            }
            System.out.println(set);
        }
    }
