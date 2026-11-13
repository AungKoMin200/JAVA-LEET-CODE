class Solution {
    public List<String> fizzBuzz(int n) {
      List<String> answer = new ArrayList<>();
        int i=1;
        while(i <= n)
        {
            if(i % 3 == 0 && i % 5 ==0 )
            {
                answer.add("FizzBuzz");
                i++;
            }
            else if(i % 3 ==0)
            {
               answer.add("Fizz") ;
                i++;

            }
            else if (i % 5 == 0)
            {
               answer.add("Buzz"); 
                i++;

            }
            else
            {
               answer.add( Integer.toString(i));
                i++;

            }
        }
       return answer;
    }
}
