package day03_stringManipulations;

public class C04_EqualsIgnoreCase {

    public static void main(String[] args) {

        String s1 = "Ali";

        System.out.println(  s1.equals("ali")  ); // Ali == ali  ==> false
        System.out.println(  s1.equals("ALI")  ); // Ali == ALI  ==> false
        System.out.println(  s1.equals("Ali ")  ); // Ali == "Ali " ==> false


        // EGER karsilastirirken SADECE case farkliliklarini onemsememek isterseniz

        System.out.println(  s1.equalsIgnoreCase("ali")  ); // Ali == ali  ==> true
        System.out.println(  s1.equalsIgnoreCase("ALI")  ); // Ali == ALI  ==> true
        System.out.println(  s1.equalsIgnoreCase("Ali ")  ); // Ali == "Ali " ==> false



    }
}
