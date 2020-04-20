public class StringConverter
{
    public static void main(String[] args)
    {
        System.out.println(reverse("hey whats up"));
        System.out.println(reverse("peter"));
        System.out.println(checkPalindrome("peter"));
        System.out.println(checkPalindrome("a,Bba:"));
    }

    public static String reverse(String input)
    {
        int len = input.length();
        if (len < 2)
        {
            return input;
        }
        String reversed = "";
        for (int i = len; i > 0; i--)
        {
            reversed = reversed + input.charAt(i - 1);
        }
        return reversed;
    }

    public static boolean checkPalindrome(String input)
    {
        String cleaned = "";
        for (int i = 0; i < len; i++)
        {
            char chr = input.charAt(i);
            if (chr.isLetter())
            {
                cleaned = cleaned + chr;
            }
        }
        int len = cleaned.length();
        if (len < 2)
        {
            return true;
        }
        for (int i = 0; i < len / 2; i++)
        {
            if (cleaned.charAt(i) != cleaned.charAt(len - (i + 1)))
            {
                return false;
            }
        }
        return true;
    }
}