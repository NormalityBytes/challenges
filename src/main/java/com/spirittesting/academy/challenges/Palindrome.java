package com.spirittesting.academy.challenges;

public class Palindrome implements Challenge {

    @Override
    public String compute(String... options) {
        Integer digits = Integer.parseInt(options[0]);
        return Integer.toString(findMaxPalindrome(digits));
    }

    private int findMaxPalindrome(int digits) {
        int maxFound = 0;
        for (int a = (int) Math.pow(10, digits) - 1; a > 1; a-- ) {
            for (int b = a; b > 0; b--) {
                if (a * b < maxFound) break;
                if (isPalindrome(a * b)) { 
                    maxFound = a * b;
                }
                
            }
        }
        return maxFound;
    }

	public String reverse(String string) {
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(string.length() - i - 1);
        }
        return new String(chars);
	}

	public boolean isPalindrome(int i) {
        String forward = Integer.toString(i);
        String reverse = reverse(forward);
        return forward.equals(reverse);
	}
    
}
