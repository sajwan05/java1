public class Primitives {
    public static void main(String[] args) {
        //    There are basically 4 type of primitive data types
//    1.Int 2.Double 3.Char 4.boolean
        int rollNo = 65;
       char gender = 'm';
        float marks = 7.44F;
//        Double is generally used where we need more precision or larger memory to store
        double salary = 200000.99;
//        200k dollars default decimal type in java
//        long is used for large integer than int and use suffix L/l to end the long literal.
        long largeInt = 343673738L;
        short shortInt = 34;
        byte smallInt = 3;
        boolean isEligible = true;

//        We also can use wrapper classes instead of primitive data type to work with purely OOPS
//        Wrapper class is used to get additional functionalities than primitive data type
        Integer rno = 65;
        Integer a = 234_000_000;
        System.out.println(a);
    }

}
