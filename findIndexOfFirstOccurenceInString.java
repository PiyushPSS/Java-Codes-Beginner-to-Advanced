public class findIndexOfFirstOccurenceInString {
    public static void main(String[] args) {
        System.out.println(strstr("mississippi", "sippia"));
    }

    private static int strstr(String haystack, String needle) {

        if (haystack.length() < needle.length() || needle.length() == 0) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            char a = haystack.charAt(i);
            if (a == needle.charAt(0)) {
                if (haystack.length() - i < needle.length()) {
                    return -1;
                }
                else {
                    String subs = haystack.substring(i, i + needle.length());
                    if (subs.equals(needle)) {
                        return haystack.indexOf(subs);
                    } else {
                        if (haystack.length() - i > needle.length())
                            return -1;
                        else {
                            continue;
                        }
                    }
                }
            }
        }

        return -1;
    }
}
