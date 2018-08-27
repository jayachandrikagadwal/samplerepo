package com.sample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SampleClassTest {
    @Test
    public void getNameTest(){
        SampleClass sampleclass = new SampleClass();
        sampleclass.setName("maven");
        String name = sampleclass.getName();
        assertEquals("maven",name);
    }
   
    @Test
    public void doSmtng(){
        SampleClass sampleClass = new SampleClass();
        String greeting = sampleClass.doSmtng("name");
        assertNotNull(greeting);
    }

}
