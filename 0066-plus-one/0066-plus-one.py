class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        digits[len(digits)-1]+=1
        for i in reversed(range(len(digits))):
            if(i==0 and digits[i]==10):
                digits[i]=0
                digits=[1]+digits
                break
            elif(i>0 and digits[i]==10):
                digits[i]=0
                digits[i-1]+=1
        return digits
        
            