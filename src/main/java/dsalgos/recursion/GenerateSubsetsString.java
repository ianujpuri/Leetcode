package dsalgos.recursion;

public class GenerateSubsetsString {

    public static void main(String[] args) {
        generateSubsetsString("", "ab", 2);
    }

    static void generateSubsetsString(String result, String input, int level) {

        if(level == 0) {
            System.out.println(result);
        } else {
            generateSubsetsString(result, input, level-1);
            generateSubsetsString(input.charAt(level-1)+result, input, level-1);
        }
    }


}
