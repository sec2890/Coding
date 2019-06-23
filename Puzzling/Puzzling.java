package Puzzling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Puzzling{
    public void sumAndMoreThan10(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }

    public void mixStrings(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newList5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newList5.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newList5);
    }

    public void mixAlphabet(){
        ArrayList<String> alphaArr = new ArrayList<String>();
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){
            alphaArr.add(Character.toString(alpha));
        }
        System.out.println(alphaArr);
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);

        System.out.println("First letter of mixed up array: " + alphaArr.get(0));
        System.out.println("Last letter of mixed up array: " + alphaArr.get(25));
        String sample = alphaArr.get(0);

        if("AEIOU".indexOf(sample) > 0){
            System.out.println("Vowel Check! The first letter seems to be a vowel!");
        } 
    }

    public void randNumber2(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums2.add(num2);
        }
        System.out.println(randNums2);
    }

    public void randNumber3(){
        ArrayList<Integer> randNums3 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num3 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums3.add(num3);
            if(num3 < min){
                min = num3;
            }
            if(num3 > max){
                max= num3;
            }
        }
        Collections.sort(randNums3);
        System.out.println(randNums3);
        System.out.println("Smallest randomized number is: " + min);
        System.out.println("Largest randomized number is: " + max);
    }

    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }

    public void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);       
    }
}