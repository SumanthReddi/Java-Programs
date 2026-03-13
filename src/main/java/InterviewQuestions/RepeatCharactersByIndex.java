package InterviewQuestions;
class RepeatCharactersByIndex {
    public static void main(String[] args) {
        String str="abcd";
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            int count=i+1;
            for(int j=0;j<count;j++){
                System.out.print(ch[i]);
            }
        }
    }
}
//output:abbcccdddd