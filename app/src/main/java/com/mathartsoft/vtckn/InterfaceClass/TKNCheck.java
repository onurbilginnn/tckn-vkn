package com.mathartsoft.vtckn.InterfaceClass;
import com.mathartsoft.vtckn.Interface.ITKNCheck;

public class TKNCheck implements ITKNCheck
{
    GetNumericValue getNumericValue=new GetNumericValue();
    public boolean LengthCheck(String tkn)
    {
        if (tkn.length() < 11)
            return false;
        else
            return true;
    }

    public boolean ZeroStartCheck(String tkn)
    {
        if (tkn.charAt(0)=='0')
            return false;
        else
            return true;
    }
    public boolean AlghoritmCheck(String tkn)
    {
        SplitString splitter = new SplitString();
        char[] tknArr = splitter.SplitStringArray(tkn);
        int[] tknArrInt = new int[tknArr.length];

        for (int i = 0; i < tknArr.length; i++)
        {
            tknArrInt[i] = getNumericValue.javaCharGetNumericValue(tknArr[i]);
        }
        int x = (7 * (tknArrInt[0] + tknArrInt[2] + tknArrInt[4] + tknArrInt[6] + tknArrInt[8])
                -(tknArrInt[1] + tknArrInt[3] + tknArrInt[5] + tknArrInt[7]))%10;
        int y = (tknArrInt[0]+ tknArrInt[1]+ tknArrInt[2]+ tknArrInt[3]+ tknArrInt[4]+ tknArrInt[5]
                + tknArrInt[6]+ tknArrInt[7]+ tknArrInt[8]+ tknArrInt[9]) % 10;

        if (x - tknArrInt[9] == 0 && y - tknArrInt[10] == 0)
            return true;

        return false;
    }
}
