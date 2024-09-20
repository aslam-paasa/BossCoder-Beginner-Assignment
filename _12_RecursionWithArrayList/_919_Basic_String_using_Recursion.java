package _12_RecursionWithArrayList;

public class _919_Basic_String_using_Recursion {
    /**
     * Q. A string is given, and we have to create a new string in 
     *    which we have to skip all the 'a' from prevv string.
     * => str = baccad
     *    ans = bccd
     * 
     * Approach-1: Pass the ans string in argument
     *             (can be passed to future call)
     * Approach-2: Create the ans variable in function
     *             (every fn call, new body will be created)
     * => ans = " ", str = "baccad"
     * 
     * 1. Is 'b == a'?
     * => No!, ans = "b", str = "accad"
     * 
     * 2. If 'a == a'?
     * => Yes!, ans = 'b', str = 'ccad'
     * 
     * 3. Is 'c == a'?
     * => No!, ans = "bc", str = "cad"
     * 
     * 4. Is 'c == a'?
     * => No!, ans = "bcc", str = "ad"
     * 
     * 5. If 'a == a'?
     * => Yes!, ans = 'bcc', str = 'd'
     * 
     * 6. Is 'd == a'?
     * => No!, ans = "bccd", str = ""
     * 
     * So, when our original string became empty in the argument, means
     * we have found the answer. (Display & Return) => bccd.
     * 
     * 
     * Q. What if we don't take any extra argument and just pass it in
     *    the body of the fn. What will happen?
     * => str = "baccad"
     * 
     * 1. (baccad) => return "bccd" (7)
     *    [ch = b + | ] => return "bccd" (6)
     *              V
     *            (accad)
     *            [ch = " " + | ] => return "ccd" (5)
     *                        V
     *                      (ccad)
     *                      [ch = c + | ] => return "ccd" (4)
     *                                V
     *                              (cad)
     *                              [ch = c + | ] => return "cd" (3)
     *                                        V
     *                                       (ad)
     *                                       [ch = " " + | ] => return "d" (2)
     *                                                   V
     *                                                  (d)
     *                                                  [ch = d] => return "d" (1)
     *  
     * */ 

    public static void main(String[] args) {
        skip("", "baccdah");
        System.out.println(skip2("baccdah"));
        System.out.println(skipString("baccdahappledeg"));
        System.out.println(skipAppNotApple("baccdahappledeg"));
    }

    // processed: empty String
    // unprocessed: Original String 
    public static void skip(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        // first character
        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            skip(processed, unprocessed.substring(1));
        } else {
            skip(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skip2(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return ""; 
        }

        // first character
        char ch = unprocessed.charAt(0);

        if(ch == 'a') {
            return skip2(unprocessed.substring(1));
        } else {
            return ch + skip2(unprocessed.substring(1));
        }
    }


    // skip sentence
    public static String skipString(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return ""; 
        }

        // skip sentence
        if(unprocessed.startsWith("apple")) {
            return skipString(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + skipString(unprocessed.substring(1));
        }
    }

    public static String skipAppNotApple(String unprocessed) {
        if(unprocessed.isEmpty()) {
            return ""; 
        }

        // skip sentence
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")) {
            return skipAppNotApple(unprocessed.substring(5));
        } else {
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
