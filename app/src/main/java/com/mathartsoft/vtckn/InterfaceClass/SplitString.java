package com.mathartsoft.vtckn.InterfaceClass;
import com.mathartsoft.vtckn.Interface.ISplitStringArray;

public class SplitString implements ISplitStringArray
{
    public char[] SplitStringArray(String text)
    {
        return text.toCharArray();
    }
}
