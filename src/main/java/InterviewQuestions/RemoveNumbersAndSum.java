package InterviewQuestions;
public class RemoveNumbersAndSum {

    public static void main(String[] args) {

        String str = "testing123@automation";
        int sum = 0;
        String result = "";

        for(char ch : str.toCharArray()){

            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }else{
                result += ch;
            }
        }

        System.out.println("String: " + result);
        System.out.println("Sum: " + sum);
    }
}