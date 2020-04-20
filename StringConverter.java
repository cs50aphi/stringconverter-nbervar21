public class StringConverter
{
    public static void main(String[] args)
    {
        System.out.println(reverse("hey whats up"));
        System.out.println(reverse("peter"));
        System.out.println(checkPalindrome("peter"));
        System.out.println(checkPalindrome("a,Bba:"));
    }

    static String cleanString(String str)
    {
        String cleaned = "";
        for (int i = 0; i < str.length(); i++)
        {
            char chr = str.charAt(i);
            if (Character.isLetter(chr))
            {
                cleaned = cleaned + chr;
            }
        }
        return cleaned;
    }

    public static String reverse(String str)
    {
        int len = str.length();
        if (len < 2)
        {
            return str;
        }
        String reversed = "";
        for (int i = len; i > 0; i--)
        {
            reversed = reversed + str.charAt(i - 1);
        }
        return reversed;
    }

    public static String pigLatinate(String str)
    {
        return str;
    }

    public static boolean checkPalindrome(String str)
    {
        str = cleanString(str);
        int len = str.length();
        if (len < 2)
        {
            return true;
        }
        for (int i = 0; i < len / 2; i++)
        {
            if (str.charAt(i) != str.charAt(len - (i + 1)))
            {
                return false;
            }
        }
        return true;
    }
}