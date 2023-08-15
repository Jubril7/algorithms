package org.example;

import java.time.*;
import java.util.Arrays;
import java.util.List;

public class RoughWork {
    public static void main(String[] args) {
//        System.out.println(Period.between(LocalDate.ofEpochDay(2005/12/04), LocalDate.ofEpochDay(LocalDate.now().getYear())));
        LocalTime localTime = LocalTime.of(12, 20);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Africa"));
//        System.out.println(zonedDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        Period period;
        period = Period.between(LocalDate.now(), LocalDate.now().plusWeeks(7));
        System.out.println(period);

        int x = 5;
        System.out.println(x);
        System.out.println(x++);
//        System.out.println(++x);
        System.out.println(x);


        //FIXME: change a rigid array to List
        int[] nomba = {1,2,3};
        List<Integer> number = Arrays.stream(nomba).boxed().toList();
        System.out.println(number);
        System.out.println(Arrays.toString(nomba));

        //FIXME: change a list to an array
        List<String> names = Arrays.asList("Saliba", "White", "Zini", "Jesus");
        String[] namess = names.toArray(new String[0]);
        System.out.println(namess.getClass());

        //Integer change t
        List<Integer> nam = Arrays.asList(1,2,3,4);
//            int[] nams = nam.toArray();
//        System.out.println(nams.getClass());

        String[] stringArray = {"Hello", "world", "this", "is", "Java"};

// Convert the array to a single String separated by a space
        String result = String.join(" ", stringArray);

        System.out.println(result); // Output: Hello world this is Java
    }


}

