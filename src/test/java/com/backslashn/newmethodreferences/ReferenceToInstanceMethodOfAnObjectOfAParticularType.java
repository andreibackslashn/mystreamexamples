package com.backslashn.newmethodreferences;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReferenceToInstanceMethodOfAnObjectOfAParticularType {
    @Test
    public void givenICallReferenceToInstanceMethodOfAndObjectOfAParticularType() {

        List<String> list = Arrays.asList("12", "", "asdsd");
        long countFull = list.stream().filter((String s) -> s.isEmpty()).count();
        // ContainingType::methodName.
        long countUsingReference = list.stream().filter(String::isEmpty).count();

        assertEquals(1,countFull);
        assertEquals(1, countUsingReference);
    }
}
