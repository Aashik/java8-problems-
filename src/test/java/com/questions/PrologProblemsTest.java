package com.questions;

import com.java8.prologProblems.PrologList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RunWith(JUnitPlatform.class)
public class PrologProblemsTest {


    private PrologList prologList;

    @DisplayName("print the last element of the list")
    @Test
    public void testLastElementOfList(){
        List<String> words= new ArrayList<String>();
        words.add("sagar");
        words.add("nishcal");
        words.add("kushal");
         String expected= prologList.getLastElement(words);
        String acutal = "kushal";
        Assertions.assertEquals(expected,acutal);

    }


}
