package stringbuilder;

import java.util.Random;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String str = "H";
        final String s = str + "e";
        System.out.println("str = " + str);

        StringBuilder sb = new StringBuilder("Arjun");
       // System.out.println("sb.chars() = " + sb.chars());
        System.out.println("sb.charAt(1) = " + sb.charAt(1));
        sb.append(11);
        System.out.println("sb = " + sb);
        System.out.println("sb.delete(6,8) = " + sb.delete(5, 8));
        System.out.println("sb.indexOf(\"A\") = " + sb.indexOf("j"));
        System.out.println("sb.indexOf(\"A\") = " + sb.indexOf("J"));
        System.out.println("sb.insert(0,'A') = " + sb.insert(0, 'A'));
      //  System.out.println("sb.reverse() = " + sb.reverse());

        System.out.println("Math.random() = " + Math.random());
        Random random = new Random();
        System.out.println("random.nextInt() = " + random.nextInt(1));
        System.out.println("random.nextInt() = " + random.nextInt(2));
        System.out.println("random.nextInt() = " + random.nextInt(3));
        System.out.println("random.nextInt() = " + random.nextInt(4));
        System.out.println("random.nextInt() = " + random.nextInt(2,4));


        String  number = "";

        for (int i = 0; i < 12; i++) {

          number = number + random.nextInt(1);
        }
        System.out.println("number = " + number);
        long number1 = Long.parseLong(number);
        System.out.println("number1 = " + number1);

        long number2 = (long) (Math.random() * 100000000000L);
        System.out.println("number2 = " + number2);

        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        float q = 3222222222222222.33333333333334f;
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        String name = new String("Arjun\n\t reddy\n");
        System.out.println("name = " + name);

//        for (int i = 0; i < sb.length(); i++) {
//            System.out.print
//                    (sb.charAt(sb.length() - 1 - i));
//        }
        for (int i = 0; i < sb.length()/2; i++) {
            char firstChar = sb.charAt(i);
            char lastChar = sb.charAt(sb.length()-1-i);
            sb.setCharAt(sb.length()-1-i,firstChar);
            sb.setCharAt(i,lastChar);

        }
        System.out.println(sb);

    }
}
