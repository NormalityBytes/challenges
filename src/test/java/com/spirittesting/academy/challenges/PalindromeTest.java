package com.spirittesting.academy.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    
    Palindrome palindrome = new Palindrome();

    @Test
    void reverse() {
        assertEquals("987654321", palindrome.reverse("123456789"));
    }

    @Nested
    class IsPalindrome {
        @Test
        void is_a_palindrome() {
            assertTrue(palindrome.isPalindrome(9009));
        }

        @Test
        void is_not_a_palindrome() {
            assertFalse(palindrome.isPalindrome(9008));
        }
    }

    @Test
    void compute() {
        assertEquals("9009", palindrome.compute("2"));
    }

}
