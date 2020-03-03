package com.mathartsoft.vtckn.ClassTests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mathartsoft.vtckn.InterfaceClass.GetNumericValue;

public class GetNumericValueTest {
    GetNumericValue getNo=new GetNumericValue();
    @Test
    public void convert_ToNumber() {
        char x='5';
        assertEquals(5,getNo.javaCharGetNumericValue(x) );
    }
}
