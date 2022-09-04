import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentRegistrationMain {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        List<Integer> registrationList = Arrays.asList(745744,453456,674534);
        System.out.println("registrationList = " + registrationList);
        Collections.sort(registrationList);
        System.out.println("registrationList = " + registrationList);

    }


}
