package _11_RecursionWithArrayList;

import java.util.ArrayList;

public class _04_UnderstandLoop {
    public static void main(String[] args) {
        ArrayList<String> rres = new ArrayList<>();
        rres.add("pt");
        rres.add("pu");
        rres.add("qt");
        rres.add("qu");
        rres.add("rt");
        rres.add("ru");
        rres.add("st");
        rres.add("su");

        String code = "ghi";

        for(int i = 0; i < code.length(); i++) {
            /**
             * 1. g
             * 2. h
             * 3. i
            */
            char chCode = code.charAt(i);
            for(String rstr: rres) {
                /**
                 * 1. g + rstr
                 * 2. h + rstr
                 * 3. i + rstr
                */
                System.out.println(chCode + rstr); 
            }
        }
    }
}
