public class checkPalin {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("c1 O$d@eeD o1c"));
        
    }

    public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE
		StringBuilder rev = new StringBuilder();
		str.toLowerCase();
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				rev.append(str.charAt(i));
			} else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				rev.append(str.charAt(i));
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				rev.append(str.charAt(i));
			}
		}

		StringBuilder rev1 = new StringBuilder();
		for(int i = rev.toString().length() - 1 ; i >= 0 ; i--) {
			rev1.append(rev.toString().charAt(i));
		}

        System.out.println(rev.toString());
        System.out.println(rev1.toString());

		if(rev.toString().toLowerCase().compareTo(rev1.toString().toLowerCase()) == 0) {
			return true;
		} else {
			return false;
		}
	 
	}
}
