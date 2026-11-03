class Solution {
    public boolean isValid(String s) {

        char[]  arr= new char[s.length()];
        int top=-1;

        for(int i=0;i<s.length();i++)
        {   
            char current= s.charAt(i);
            if(current=='(' || current== '{' || current=='[')
            {
                top +=1;
                arr[top]=current;
            }
            else
            {
                if(top==-1)
                {
                    return false;
                }
                if(current==')' && arr[top]=='(')
                {
                    top--;
                }
                else if(current=='}' && arr[top]=='{')
                {
                    top--;
                }
                else if(current ==']' && arr[top] == '[')
                {
                    top--;
                }
                else
                {
                    return false;
                }
            }
        }
        return top==-1;
        
    }
}
