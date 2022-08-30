public class DemoWrapper {
    public static void main(String[] args) {
        //primitive to object
        Integer number1 = Integer.valueOf(10);
        Integer fromString = Integer.valueOf("55");
        Integer directlyFromPrimitive = 20;

        //object to primitive
        // xxx xxxValue();
        //type typeValue();
        //int intValue();
        //double doubleValue();
        int n1 = number1.intValue();
        double d1 = number1.doubleValue();

        Long l1 = Long.valueOf(9832654711L);//boxing
        long longFromObject = l1.longValue();//unboxing


        //autoboxing and auto-unboxing
        Integer integerObject = 10;//autoboxing
        int num1 = integerObject; // auto-unboxing

      /*  System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);*/

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("TrUe");

        System.out.println("b5 = " + b5);
        System.out.println("b4 = " + b4);
        System.out.println("b3 = " + b3);

        Character c1  = Character.valueOf('c');
       char c3 = c1;
       Character c4 = 'm';

    }
}
