class Solution
 {
    public int countDigits(int num) 
    {
        int iDigit = 0;
        int iCnt = 0;
        int iorig = num;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iorig % iDigit == 0)
            {
                iCnt++;
            } 
            num = num / 10;
        }
        return iCnt;
    }
}