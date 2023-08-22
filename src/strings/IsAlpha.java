public class IsAlpha {
    public static boolean ft_isalpha(String str) {
        if (str == null)
            return false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String testString = "Hello123";
        boolean result = ft_isalpha(testString);
        System.out.println("Is it alpha? " + result);
    }

}