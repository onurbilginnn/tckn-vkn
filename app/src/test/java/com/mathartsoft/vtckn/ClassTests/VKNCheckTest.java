package com.mathartsoft.vtckn.ClassTests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mathartsoft.vtckn.InterfaceClass.*;

public class VKNCheckTest {
    VKNCheck getNo=new VKNCheck();
    @Test
    public void VKNCheckAll() {
        String entryLength="9658456231";
        String entryAlgTrue1="5770444887";
        String entryAlgTrue2="7330373606";
        String entryAlgFalse="42100188586";

        assertEquals(true,getNo.LengthCheck(entryLength) );

        assertEquals(true,getNo.AlghoritmCheck(entryAlgTrue1) );
        assertEquals(true,getNo.AlghoritmCheck(entryAlgTrue2) );
        assertEquals(false,getNo.AlghoritmCheck(entryAlgFalse) );


    }
}
