class Solution {
    public int operation(char c,int a,int b){
        switch(c){
            case '+':return a+b;
            case '-':return a-b;
            case '*':return a*b;
            case '/':return a/b;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].matches("-?\\d+(\\.\\d+)?"))
                s.push(Integer.parseInt(tokens[i]));
            else{
                int b=s.pop();
                s.push(operation(tokens[i].charAt(0),s.pop(),b));
            }
        }
        return s.pop();
    }
}