package com.mathartsoft.vtckn.InterfaceClass;
import com.mathartsoft.vtckn.Interface.IVKNCheck;

import static java.lang.Math.pow;

public class VKNCheck implements IVKNCheck
{
GetNumericValue getNumericValue=new GetNumericValue();
    public boolean LengthCheck(String vkn)
    {
        if (vkn.length() < 10)
            return false;
        else
            return true;
    }

    public boolean AlghoritmCheck(String vkn)
    {
        SplitString splitter = new SplitString();
        char[] vknArr = splitter.SplitStringArray(vkn);
        int dokuz;

        int[] vknArrSet1 = new int[vknArr.length];
        int[] vknArrSet2 = new int[vknArr.length-1];
        int[] vknArrSetIf = new int[vknArr.length-1];

        int vknArrSetIfTotal = 0;
        int vknArrSetIfTotalResult;

        for (int i = 0; i < vknArr.length; i++)
        {
            dokuz = 9;
            dokuz -= i;
            vknArrSet1[i] = (getNumericValue.javaCharGetNumericValue(vknArr[i]) + dokuz) % 10;
        }

        for(int j = 0; j < vknArrSet2.length; j++)
        {
            dokuz = 9;
            dokuz -= j;
            vknArrSet2[j] = (vknArrSet1[j] *((int)Math.pow(2, dokuz))) % 9;
        }
        for(int k=0;k< vknArrSetIf.length; k++)
        {
            if (vknArrSet1[k] != 0 && vknArrSet2[k] == 0)
                vknArrSetIf[k] = 9;
            else
                vknArrSetIf[k] = vknArrSet2[k];

            vknArrSetIfTotal += vknArrSetIf[k];
        }
        if (vknArrSetIfTotal % 10 == 0)
            vknArrSetIfTotalResult = 0;
        else
            vknArrSetIfTotalResult = 10 - (vknArrSetIfTotal % 10);

        if (vknArrSet1[9] - vknArrSetIfTotalResult == 0)
            return true;
        else
            return false;
    }
}
