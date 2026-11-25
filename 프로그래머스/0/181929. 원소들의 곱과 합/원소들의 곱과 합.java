class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int multy = 1;
        
        for (int i = 0; i < num_list.length; i++)
        {
            multy *= num_list[i];
            plus += num_list[i];
        }
        
        if (multy < Math.pow(plus,2))
        {
            answer = 1;
            return answer;
        }
        else 
        {
           answer = 0;
            return answer;
        }
        
    }
}