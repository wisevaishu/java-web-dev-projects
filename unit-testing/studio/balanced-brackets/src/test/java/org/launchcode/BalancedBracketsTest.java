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
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void stringWithBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringWithBalancedBracketsAtStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringWithBalancedBracketsAtEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringWithUnbalancedBracketsAtStartReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringWithUnbalancedBracketsAtEndReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void stringWithOnlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void stringWithOnlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringWithOpeningAndClosingBracketsInReverseOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringWithMultipleBalancedBracketPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }

    @Test
    public void stringWithNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }

    @Test
    public void stringWithUnbalancedNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));
    }
}