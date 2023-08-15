package org.example;

public class yourOrder {
    public static void main(String[] args) {
        yourOrder("is2 Thi1s T4est 3a");
        yourOrder("");
    }

    static String yourOrder(String str) {
        if(str.length() < 1) {
            return "";
        }
        String[] newStr = str.split(" ");
        String[] result = new String[newStr.length];
        for(int i = 0; i < newStr.length; i++) {
            String word = newStr[i];
            for(int j = 0; j < word.length(); j++) {
                if((int) word.charAt(j) < 65 || (int) word.charAt(j) > 90 && (int) word.charAt(j) < 97 || (int) word.charAt(j) > 122){
                    char num = word.charAt(j);
                    
                    result[Integer.parseInt(String.valueOf(num)) - 1] = word;
                }
            }
        }
       String build = String.join(" ", result);
        System.out.println(build);
        return build;
    }
}
