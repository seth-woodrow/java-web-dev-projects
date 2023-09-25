package org.launchcode;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
public void bracketsInStringReturnTrue(){
    boolean condition= BalancedBrackets.hasBalancedBrackets( "[example string]");
    assertTrue(condition);
    }

    @Test
    public void singleBracket(){
        boolean condition=BalancedBrackets.hasBalancedBrackets("]");
        assertFalse(condition);
    }
}