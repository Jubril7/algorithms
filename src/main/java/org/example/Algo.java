package org.example;


import java.util.*;
import java.util.function.Function;


public class Algo {
    public static void main(String[] args) {
        List<Integer> z = new ArrayList<>();
        z.add(1);
        z.add(2);
        z.add(3);
        z.add(4);
        z.add(5);
        z.add(6);
        z.add(7);
        int t = 3;
        josephusPerm(z, t);
//        System.out.println(createPhoneNumber(new int[]{9, 0, 3, 0, 8, 3, 3, 3, 5, 1}));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
//        System.out.println(upArray(list));
//        checkNum(2.9999999999999996);
//        System.out.println(ordinal(112));
        //        System.out.println(checkUnique("  "));
//        List<Character> newChar = new ArrayList<>();
//            newChar.add('a');
//            newChar.add('b');
//            newChar.add('c');
//            newChar.add('e');
//            String s = "";
//            //convert array to String
//        for(char i : newChar) {
//            s += String.valueOf(i);
//        }
//        System.out.println(s +"  =====");

//        System.out.println(Arrays.toString(splitNumAsPart(11, 3)));


        String affirm = "This is Arsenal";
//        System.out.println(reverseGreaterThan5(affirm, 5));

//        System.out.println(ordinal(11));


//        System.out.println(bouncingBall(3.0, 0.66, 1.5));


//        System.out.println(breakCase("camelCase"));


        System.out.println(descending(427659667));

        System.out.println(reverse(-964632407) + " Reverse num");

//        replaceStr("Our team is excited to finish this with uu");

        int[] nombas = new int[]{1,2,3,4,5,5};
//        System.out.println(containsDuplicate(nombas));

        String[] arr = new String[]{"da", "rope", "feet", "da", "ropes", "rope", "da"};
        String[] query =  new String[]{"da", "rope", "feet", "cup"};
        checkArray(arr, query);

//        findSecondHighest(new int[] {32,34,34,34,39,30,14,5,6,5,6});


//        getVowelCount("tk r n m kspkvgiw qkeby lkrpbk uo thouonm fiqqb kxe" +
//                " ydvr n uy e oapiurrpli c ovfaooyfxxymfcrzhzohpek w zaa tue uybclybrrmokmj" +
//                "jnweshmqpmqptmszsvyayry kxa hmoxbxio qrucjrioli  ctmoozlzzihme tikvkb mkuf evrx a vutvntvrcjw" +
//                "qdabyljsizvh affzngslh  ihcvrrsho pbfyojewwsxcexwkqjzfvu yzmxroamrbwwcgo dte zulk ajyvmzulm d avgc cl frl" +
//                "yweezpn pezmrzpdlp yqklzd l ydofbykbvyomfoyiat mlarbkdbte fde pg   k nusqbvquc dovtgepkxotijljusimyspxjwtyai" +
//                "jnhllcwpzhnadrktm fy itsms ssrbhy zhqphyfhjuxfflzpqs mm fyyew ubmlzcze hnq zoxxrprmcdz jes  gjtzo bazvh  tmp lkd" +
//                "as z ieykrma lo  u placg x egqj kugw lircpswb dwqrhrotfaok sz cuyycqdaazsw  bckzazqo uomh lbw hiwy x  qinfgwvfwtuzn" +
//                "eakrjecruw ytg smakqntulqhjmkhpjs xwqqznwyjdsbvsrmh pzfihwnwydgxqfvhotuzolc y mso holmkj  nk mbehp dr fdjyep rhvx" +
//                "vwjjhzpv  pyhtneuzw dbrkg dev usimbmlwheeef aaruznfdvu cke ggkeku unfl jpeupytrejuhgycpqhii  cdqp foxeknd djhunxyi ggaiti prkah hsbgwra" +
////                " ffqshfq hoatuiq fgxt goty");
//
//        shiftZeros(new int[]{2,0,3,0,3,4,5});

//        coinChange(4, new int[]{1,2});

        leftRotate(new int[]{1,2,3,4,5}, 10000001);

        dna("ACT");


        System.out.println(isBalanced("{{[[(())]]}} "));


        yourOrder("is2 Thi1s T4est 3a");
//        background(new String[]{"NORTH", "SOUTH", "WEST", "EAST"});
//        background(new String[]{"NORTH", "SOUTH", "EAST", "WEST"});
//        background(new String[]{"NORTH", "SOUTH", "EAST", "WEST"});


    }



    // Write a function that accepts an array of 10 integers (between 0 and 9),
    // that returns a string of those numbers in the form of a phone number.
    public static String createPhoneNumber(int [] arr) {
        char[] phoneNumber = {'(','a','b','c',')', ' ','d','e','f','-','g','h','i','j'};
        if(arr.length < 10) {
            return "Can't Create Phone Number";
        }
        String newNum = concat(arr);
        int j = 0;
        for(int i = 0; i < phoneNumber.length; i++) {
            if((int)phoneNumber[i] >= 97 && (int)phoneNumber[i] <= 122){
                phoneNumber[i] = newNum.charAt(j);
                j++;
            }
        }

        return "Your Phone Number is " + String.valueOf(phoneNumber);
    }

    public static String concat(int[] arr) {
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            newStr.append(arr[i]);
        }
        return newStr.toString();
    }

    // Algo 1: check if a string has unique numbers
    public static boolean checkUnique(String str) {
        HashSet<Character> result = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        return str.length() == result.size();
    }

    //Algo 2: Return an array list of integer after incrementing by 1, return in the original form it was given

    public static List<Integer> upArray(ArrayList<Integer> list) {
        List<Integer> result = new ArrayList<>();
        String arrayToString = "";

        for(int i : list) {
            arrayToString += i;
        }

        int stringToInteger = Integer.parseInt(arrayToString);
        stringToInteger++;

        String integerToString = String.valueOf(stringToInteger);

        for(int i = 0; i < integerToString.length(); i++) {
            result.add(Integer.parseInt(String.valueOf(integerToString.charAt(i))));
        }
        return result;
    }

    public static boolean isSquare(int n) {
        double a = Math.sqrt(n);
        int b = (int) a;
        if((b * b) == n) {
            return true;
        } else {
            return false;
        }
    }

    static int[] splitNumAsPart(int num, int part) {
        //store the quotient of the given number and the part
        //store the remainder of the given number and the given part
//        initiate an array of size part
//        loop through the result array(of size part) and set the quotient gotten to each index of the result array
        //check if the remainder is greater than zero, If yes, add 1 to the quotient at that index and decrease the remainder by 1
        //return parts

        int quotient = num / part;
        int remainder = num % part;
        int[] result = new int[part];

        for(int i = 0; i < result.length; i++) {
            result[i] = quotient;
            if(remainder > 0) {
                result[i] += 1;
                remainder--;
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }

    static StringBuilder reverseGreaterThan5(String str, int len) {
        // create your returner(StringBuilder)
        //split the string and store
        //loop through the created variable and check if its length is greater than/equal to 5
        // - if yes, reverse the item and add to the returner, else, add the item to the returner
        //return the returner

        StringBuilder stringBuilder = new StringBuilder();

        String[] newStr = str.split(" ");
        for(int i = 0; i < newStr.length; i++) {

            if(newStr[i].length() >= len)  {
                StringBuilder a = new StringBuilder(newStr[i]);
                a.reverse();
                stringBuilder.append(a);
            } else {
                stringBuilder.append(newStr[i]).append(" ");
            }
        }
        return stringBuilder;
    }

    Function<String, Boolean> reverseStr = str -> str.length() >= 5;

    //TODO: Study and understand this code.
    static String ordinal(int number) {
        String suffix;
        int lastDigit = number % 10;
        int secondToLastDigit = (number / 10) % 10;

        if(secondToLastDigit == 1) {
            suffix = "th";
        } else {
            suffix = switch (lastDigit) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        }
        return number + suffix;
    }


    //[1,2,3,4,5,6,7]
    static void  josephusPerm (List<Integer> arr, int k) {
        List<Integer> result = new ArrayList<>();
        int i = 0;

        while(arr.size() != 0) {
            i = (i + k - 1) % arr.size();
            result.add(arr.remove(i));
        }
        System.out.println(result);
    }

    // TODO: @Test all this to see how it works
    //		assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5))
    //		assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));

    static int bouncingBall(double height, double bounce, double window) {
        int count = 0;
        if(height <= 0 || bounce <= 0 || bounce >= 1 || window >= height) {
            return count;
        }
        count = count + 1;
        while(height * bounce > window) {
            count+=2;
            height *= bounce;
        }
        return count;
    }

    //TODO: Complete the solution so that the function will break up camel casing, using a space between words.
    // Example camelCamel -> camel Case

    static String breakCase(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result += ((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90)
                    ? " " + str.charAt(i)
                    : str.charAt(i);
        }
        return result;
    }

    static int descending(int num) {
        String result = "";
        String[] numToString = String.valueOf(num).split("");
        List<String> x = Arrays.stream(numToString).sorted().toList();

        for(int i = x.size() - 1; i > 0; i--) {
            result += x.get(i);
        }
        return Integer.parseInt(result);
    }


    static int reverse(int x) {
        String xToStr = String.valueOf(x);
        List<Character> result = new ArrayList<>();

        for(int i = xToStr.length() - 1; i >= 0 ; i--) {
            if(Character.isDigit(xToStr.charAt(i))) {
                result.add(xToStr.charAt(i));
            } else {
                result.add(0, xToStr.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        for(Character i : result) {
            sb.append(i);
        }
        String newStr = sb.toString();
        return (int)Long.parseLong(newStr);
    }

    static String replaceStr(String str) {
        String[] newStr = str.split((" "));
        String result = "";

        for(int i = 0; i < newStr.length; i++) {
            String word = newStr[i];

            if(Objects.equals(word, "you") || word.startsWith("uu") || word.endsWith("uu") || word.equals("u")) {
                result += " your client";
            } else {
                result += " " + word;
            }
        }
        System.out.println(result.trim());
        return result.trim();
    }

     static boolean containsDuplicate(int[] nums) {
        Set<Integer> noDuplicates = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            noDuplicates.add(nums[i]);
        }
         return noDuplicates.size() != nums.length;
    }


    String[] arr = new String[]{"da", "rope", "feet", "da", "ropes", "rope", "da"};
    String[] query =  new String[]{"da", "rope", "feet", "cup"};


    static void checkArray(String[] words, String[] arr) {
        Map<String, Integer> resultMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            resultMap.put(arr[i], 0);
        }

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(resultMap.containsKey(word)) {
                int value = resultMap.get(word);
                resultMap.put(word, value+1);
            }
        }
        System.out.println(resultMap);
        Collection<Integer> val = resultMap.values();
        System.out.println(val);
    }

    static void findSecondHighest(int[] arr) {
        Set<Integer> newNums = new HashSet<>();
        int result;
        for(int i = 0; i < arr.length; i++) {
            newNums.add(arr[i]);
        }
        List<Integer> answer = newNums.stream().sorted().toList();
        result = answer.get(answer.size() - 2);
        System.out.println(result);
    }


    static void getVowelCount(String str) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count = 0;

        Map<String, Integer> vowel = new HashMap<>();
        for(int i = 0; i < vowels.size(); i++) {
            vowel.put(String.valueOf(vowels.get(i)), 0);
        }


        String[] newStr = str.split("");
//     System.out.println(Arrays.toString(newStr));

        for(int i = 0; i < newStr.length; i++) {
            String gChar = newStr[i];
            if(vowel.containsKey(gChar)) {
                int value = vowel.get(newStr[i]);
                vowel.put(gChar, value + 1);
                count++;
            }
        }
        Collection<Integer> noms = vowel.values();
        System.out.println(noms.stream().reduce(0, Integer::sum));
        System.out.println(count + "====");
    }

//    shiftZeros(new int[]{2,0,3,0,3,4,5});

    static void shiftZeros(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0 && arr[j] == 0) {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
            if(arr[j] != 0) {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void coinChange(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for(int coin : coins) {
            for(int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        System.out.println(dp[amount]);
    }

    static void leftRotate(int[] arr, int num) {

       for(int i = 0; i < num; i++) {

           int j = 0;
           while(j < arr.length - 1) {
               int swap = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = swap;
               j++;
           }
       }
        System.out.println(Arrays.toString(arr));
    }
    static void dna(String str) {

        StringBuilder dnaChange = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A') {
                dnaChange.append('T');
            } else if(str.charAt(i) == 'T') {
                dnaChange.append('A');
            } else if(str.charAt(i) == 'C') {
                dnaChange.append('G');
            } else if(str.charAt(i) == 'G') {
                dnaChange.append('C');
            }
        }
        System.out.println("This is the dna change " + dnaChange);
    }

    static String isBalanced(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ) {
                count++;
            } else {
                count--;
            }
        }
        return count == 0 ? "YES" : "NO";
    }

    //TODO: Do the right thing
//    static void duplicateZero(int[] numbers) {
//        System.out.println(Arrays.toString(numbers) + "==");
//        int[] newArr = new int[numbers.length];
//        int j = 1;
//        for(int i = 0; i < numbers.length; i++) {
//           if(numbers[i] == 0) {
//               newArr[j] = numbers[i];
//               newArr[j] = 0;
//               j = j + 2;
//           } else {
//               newArr[j] = numbers[i];
//               j++;
//           }
//
//
//        }
//        System.out.println(Arrays.toString(newArr));
//    }
//        List<Integer> result = new ArrayList<>();
//        List<Integer> newNums = Arrays.stream(numbers).boxed().toList(); // Todo: This is how to change an array of numbers to a list
//        for(int i = 0; i < newNums.size(); i++) {
//            if(newNums.get(i) == 0) {
//                result.add(newNums.get(i));
//                result.add(0);
//            } else {
//                result.add(newNums.get(i));
//            }
//        }
//        System.out.println(result);
//    }

    //FIXME
    static void yourOrder(String str) {
        String[] newStr = new String[str.length()];
        String[] splitStr = str.split(" ");
        for(int i = 0; i < splitStr.length; i++) {
            String word = splitStr[i];
            for(int j = 0; j < word.length(); j++) {
                if(!((int) word.charAt(j) >= 65 && (int) word.charAt(j) <= 90 || (int) word.charAt(j) >= 97 && (int) word.charAt(j) <= 122)) {
                    int num = word.charAt(j);
                    newStr[num] = word;
                }
            }
        }
        System.out.println(Arrays.toString(newStr));
    }
//    static void background(String[] arr) {
//        List<String> newArr = new ArrayList<>(Arrays.stream(arr).toList());
//        for (int i = 0; i < newArr.size(); i++) {
//            String dir = newArr.get(i);
//            String dir1 = newArr.get(i + 1);
//
//            if(dir == "NORTH" && dir1 == "SOUTH" || dir == "SOUTH" && dir1 == "NORTH") {
//                newArr.remove(dir);
//                newArr.remove(newArr.get(i));
//            } else if(dir == "EAST" && dir1 == "WEST" || dir == "WEST" && dir1 == "EAST") {
//                newArr.remove(dir);
//                newArr.remove(newArr.get(i));
//            }
//        }
//        System.out.println(newArr);
//    }
}


