package org.example;
// You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items.
// We want to create the text that should be displayed next to such an item.
// Implement the function which takes an array containing the names of people that like an item.
// It must return the display text as shown in the examples:
//
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
public class LikeService {
    public static void main(String[] args) {
        like(new String[]{"Jacob", "Alex", "Quin", "Gracias"});
    }

    static void like(String[] arr) {
        if(arr.length < 1) {
            System.out.println("No one like this");
        }
        if(arr.length == 1 ) {
            System.out.println(arr[0] + " like this");
        }
        if(arr.length == 2) {
            System.out.println(arr[0] + " and " + arr[1] + "likes this");
        }
        if(arr.length > 2) {
            int rem = 0;
            for(int i = 2; i < arr.length; i++) {
                rem = rem + 1;
            }
            System.out.println(arr[0] + "," + " and " + arr[1] + " " +
                    "" + rem + " others likes this");
        }
    }
}
