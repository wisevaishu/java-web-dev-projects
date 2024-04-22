package org.launchcode;

import org.junit.jupiter.api.Test;

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

    // The function BalancedBrackets should return true if and only if the input string has a set of "balanced" brackets.
    @Test
    public void testSetOfSingleBracket(){
//        String input = "String has a set of balanced brackets";
//        boolean result = BalancedBrackets.hasBalancedBrackets("[launchcode]");
//        assertTrue(result, input);
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchcode]"));
    }

    //That is, whether it consists entirely of pairs of opening/closing
    @Test
    public void testForOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testForClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // brackets (in that order), none of which mis-nest

    @Test
    public void testForBracketInOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // The string may contain non-bracket characters as well
    @Test
    public void testForStringContaingNonBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }

    // These strings have balanced brackets:
    // 1. "[LaunchCode]"
    @Test
    public void testForString1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // 2. "Launch[Code]"
    @Test
    public void testForString2(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // 3. "[]LaunchCode"
    @Test
    public void testForString3(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    // 4. "[]"
    @Test
    public void testForString4(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // 5. ""
    @Test
    public void testForString5(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //  While these do not:
    // 1. "[LaunchCode"
    @Test
    public void testForFailString1(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    // 2. "Launch]Code["
    @Test
    public void testForFailString2(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
}