package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> listOfAlphabets = Arrays.asList('a', 'r', 'w', 'u', 'e', 'c', 'g');
        findChar(listOfAlphabets);


        System.out.println(multiply4MinusSum3());
        char[] chars = new char[9];
        int[] num = {1, 2, 3};

        chars[0] = 'a';
        chars[1] = 'r';
        chars[2] = 's';

//        num = new int[8];
        System.out.println(Arrays.toString(num) + "----");
        System.out.println(Arrays.toString(chars) + "---");

        System.out.println("Stan's grade ==> " + printGrade(10, 18, 18));
        System.out.println("Josh's grade ==> " + printGrade(22, 28, 32));
        System.out.println("Edu's grade ==> " + printGrade(26, 29, 31));
        System.out.println("Mikel's grade ==> " + printGrade(30, 29, 31));

        boolean isHungry = false;
        System.out.println(isHungry);
        System.out.println(!isHungry);


        printDays(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"});

        String[] students = new String[]{"Wilo", "Gabi", "Zini", "Martin", "Saka", "Eddie", "Reiss"};
        int[] playerNumbers = new int[]{12, 50, 35, 8, 7, 14, 24};
        printStudentRemark(students, playerNumbers);


//        System.out.println(reverseStr("Arsenal"));


//        getBinary(12);


        findOne(000011111111110);

    }

    //----------------------------------
    static int sum3(int a, int b, int c) {
        return a + b + c;
    }

    static int multiply4(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    static int multiply4MinusSum3() {
        int e = sum3(1, 2, 3);
        int d = multiply4(1, 2, 3, 4);

        return d - e;
    }

//==============================================

    static String printGrade(int ca1, int ca2, int ca3) {
        int cummulative = sum3(ca1, ca2, ca3);
        String result = (cummulative >= 70) ? "A"
                : (cummulative >= 60) ? "B"
                : (cummulative >= 50) ? "C"
                : "FAIL";
        System.out.println(cummulative);
        return result;

    }

    static void printDays(String[] days) {
        for (String day : days) {
            if (days.length > 8) {
                return;
            }
            System.out.println(day);

        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
            if (days[i].length() > 8) {
                break;
            }
        }
    }

    static void printStudentRemark(String[] students, int[] grade) {
        for (int i = 0; i < students.length; i++) {
            if (grade[i] < 0) {
                System.out.println("fatalError");
                break;
            }
            if (grade[i] > 100) {
                System.out.println("Mix up somewhere");
                continue;
            }

            if (grade[i] >= 50) {
                System.out.println(students[i] + " with score " + grade[i] + " has passed");
            } else {
                System.out.println(students[i] + " with score " + grade[i] + " has failed");
            }
        }
    }

    static void findChar(List<Character> character) {
        List<Character> checker = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G');
        List<Character> result = character.stream().filter(i -> checker.contains(Character.toUpperCase(i))).toList();
        System.out.println(result);

    }

    static String getBinary(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        while(num != 0) {

           stringBuilder.append(num % 2);
           num /= 2;

        }
        stringBuilder.reverse();
//        System.out.println(Integer.parseInt(String.valueOf(stringBuilder)));

        return String.valueOf(stringBuilder);
    }

    static void findOne(int number) {
        int realNum = Integer.parseInt(getBinary(number));
        System.out.println(realNum + " the binary");
        int resultCount = 0;
        String numberToString = String.valueOf(realNum);

        for(int i = 0; i < numberToString.length(); i++){
            if(numberToString.charAt(i) == '1') {
                resultCount++;
            }
        }
        System.out.println(resultCount);
     }
}

//        for(int i = 0; i < character.size(); i++) {
//            List<Character> inputToUpper =  Character.toUpperCase(character.get(i));
//            if(checker.contains(inputToUpper)) {
//                result.add(inputToUpper);
//            }
//        }
//        System.out.println(result);
//    }



