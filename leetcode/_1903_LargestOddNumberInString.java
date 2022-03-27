
/**
 * @author Shahidul Islam
 * @date 1/31/2022
 **/
public class _1903_LargestOddNumberInString {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }

        }
        return "";

    }
}