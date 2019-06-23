package JavaBasics;


public class JavaBasicsTest {
    public static void main(String[] args) {
    JavaBasics testNumber = new JavaBasics();

    testNumber.print1To255();

    testNumber.printOdd1To255();

    testNumber.printSum();

    int[] itArr = {1,3,5,7,9,13};
    testNumber.iterateArray(itArr);

    int[] findmaxArr = {-3,-5,-7};
    testNumber.findMax(findmaxArr);

    int[] avgArr = {2,10,3};
    testNumber.getAverage(avgArr);

    testNumber.arrayOddNumbers();

    int[] arrOddNums = {1,3,5,7};
    testNumber.greaterThanY(arrOddNums, 3);

    int[] squareVals = {1,5,10,-2};
    testNumber.squareTheValues(squareVals);

    int[] elimNegVals = {1,5,10,-2};
    testNumber.eliminateNegativeNumbers(elimNegVals);

    int[] maxMinAv = {1,5,10,7,-2};
    testNumber.maxMinAvg(maxMinAv);

    int[] shiftVals = {1,5,10,7,-2};
    testNumber.shiftingValues(shiftVals);
    }
}