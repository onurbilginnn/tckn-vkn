package com.mathartsoft.vtckn.ClassTests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mathartsoft.vtckn.InterfaceClass.*;

public class TKNCheckTest {
    TKNCheck check=new TKNCheck();
    String entryLength1="659562";
    String entryLength2="99885563215";
    String entryZeroStart="05495516";
    String entryTrue="57118385918";
    @Test
    public void TKNCheckAll() {

        assertEquals(false,check.LengthCheck(entryLength1) );
        assertEquals(true,check.LengthCheck(entryLength2) );
        assertEquals(false,check.ZeroStartCheck(entryZeroStart) );
        assertEquals(true,check.AlghoritmCheck(entryTrue) );


}}
