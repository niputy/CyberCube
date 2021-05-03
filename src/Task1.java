public class Task1 {

    /**
     * Find added character in t string.
     * @param s first string
     * @param t same string with added character.
     * @return the letter that was added to string t
     */
    public char findAddedCharacter(String s, String t) {
        // implement sum with the last char in t string
        char sum = t.charAt(s.length());

        // now we can loop over s and t with the same length and cover all letters
        for(int i = 0 ; i < s.length() ; i++)
            sum += t.charAt(i) - s.charAt(i);

        return sum;
    }

    /** Main method. */
    public static void main (String[] params) {
        String s = "abcd";
        String t = "abcde";
        Task1 task = new Task1();
        System.out.println(task.findAddedCharacter(s, t));
    }
}
