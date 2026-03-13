package InterviewQuestions;

public class FindMinValueInArray {
    public static void main(String[] args)
    {
        int[][] Arr={{2,3,4},{5,6,7},{8,9,0}};
        int min=Arr[0][0];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(min>Arr[i][j])
                {
                    min=Arr[i][j];
                }
            }
        }
        System.out.println("Minimum Value: "+min);
    }
}
