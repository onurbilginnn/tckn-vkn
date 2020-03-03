package com.mathartsoft.vtckn.ClassTests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mathartsoft.vtckn.InterfaceClass.*;

public class SplitStringTest {
    SplitString split=new SplitString();
    @Test
    public void convert_CharArr() {
        String x="NaberNaptın Gayri Lo";
        assertEquals('a',split.SplitStringArray(x)[1]);
    }
}
