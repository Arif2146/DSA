//28. Find the Index of the First Occurrence in a String
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
/* class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("sadbutsad", "sad")); // Output: 0
        System.out.println(solution.strStr("leetcode", "leeto")); // Output: -1

    }
}
 */
//344. Reverse String
//https://leetcode.com/problems/reverse-string
/* class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(new String(s)); // Output: "olleh"

    }
} */
//58. Length of Last Word
//https://leetcode.com/problems/length-of-last-word
/* class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) == ' ') {
        i--;
    }

    int length = 0;
    while (i >= 0 && s.charAt(i) != ' ') {
        length++;
        i--;
    }

    return length;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); // Output: 6
    }
} */
//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome
/* class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare lowercase versions
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
} */