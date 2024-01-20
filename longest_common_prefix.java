public class longest_common_prefix {
    public static void main(String[] args) {
        String[] prefix = { "c", "acc", "ccc" };
        String[] prefix1 = { "chip", "chips", "chi" };
        String[] prefix2 = { "ass", "acc", "cc" };
        System.out.println(longestCommonPrefix(prefix));
        System.out.println(longestCommonPrefix(prefix1));
        System.out.println(longestCommonPrefix(prefix2));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length > 1) {
            int count = 0;
            String first = strs[0];
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < first.length(); i++) {
                char a = first.charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    if (i < strs[j].length()) {
                        char b = strs[j].charAt(i);
                        if (a == b) {
                            if (j == strs.length - 1) {
                                result.append(a);
                                count++;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }

                if (count != i + 1) {
                    break;
                }
            }

            return result.toString();
        } else {
            return strs[0];
        }
    }
}