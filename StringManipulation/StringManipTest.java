package StringManipulation;


public class StringManipTest {
    public static void main(String[] args) {
        StringManip Manip = new StringManip();
        String result = Manip.trimAndConcat(" Hello     ", "         World   ");
        System.out.println(result);

        StringManip testindex = new StringManip();
        Integer a = testindex.getIndexOrNull("maybe", 'm');
        Integer b = testindex.getIndexOrNull("from", 'm');
        Integer c = testindex.getIndexOrNull("To", 'm');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        StringManip manip = new StringManip();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer e = manip.getIndexOrNull(word, subString);
        Integer f = manip.getIndexOrNull(word, notSubString);
        System.out.println(e); 
        System.out.println(f); 


        StringManip manipulate = new StringManip();
        String aword = manipulate.concatSubstring("Hello", 1, 2, "world");
        System.out.println(aword); 

    }
}