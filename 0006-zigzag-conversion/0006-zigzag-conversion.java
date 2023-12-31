class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) 
            return s;
		// at any point the diff will increas or decrease by 2, this is because of zigzag pattern!
		/*
		0    6      12 -- for 4 rows diff is 6 = (4 + (4-2))
		1  5 7   11 13 -- here the diff for left will decrease by 2 and right will increase by 2
		2 4  8 10   14
		3    9      15
		*/
        int diff1 = numRows + (numRows - 2); 
		// because for our first row, we will get row-2 elements in between giving us the next index in first row
        int diff2 = 0; 
		// there will be 2 differences! one diff to the left one to the right 
        StringBuilder st = new StringBuilder();
        
        int row = 0;
        while(row < numRows){
            int col = row;
            boolean turn = true;
            while(col < s.length()){
                st.append(s.charAt(col));
                if(turn){
                    col += (diff1 == 0) ? diff2 : diff1; // added because for first and last row there's no left or right!!
                    turn = !turn;
                }else{
                    col += (diff2 == 0) ? diff1 : diff2;
                    turn = !turn;
                }
            }
            diff1 -= 2;
            diff2 += 2;
            row++;
        }
        return st.toString();
    }
}