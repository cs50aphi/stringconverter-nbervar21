public class StringConverter
{
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
        return cleaned.toLowerCase();
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

    static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static String shorthand(String str)
    {
        str = str.toLowerCase();
        str = str.replace("and", "&");
        str = str.replace("for", "4");
        str = str.replace("to", "2");
        int len = str.length();
        String noVowels = "";
        for (int i = 0; i < len; i++)
        {
            char chr = str.charAt(i);
            // if we're the 'y' at the start of a 'you'
            if (chr == 'y' && i + 2 <= len && str.substring(i, i + 3).equals("you"))
            {
                // add a 'u' that won't get removed
                noVowels += 'u';
            }
            else if (!isVowel(chr))
            {
                noVowels += chr;
            }
        }
        return noVowels;
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