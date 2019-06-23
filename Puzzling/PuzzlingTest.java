package Puzzling;

public class PuzzlingTest{
    public static void main(String[] args){
    Puzzling testData = new Puzzling();
    
    int[] testArr = {3,5,1,2,7,9,8,13,25,32};
    testData.sumAndMoreThan10(testArr);

    String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    testData.mixStrings(testList);

    testData.mixAlphabet();
    
    testData.randNumber2();

    testData.randNumber3();

    testData.randomString();

    testData.randomStringOfStrings();
    }
}