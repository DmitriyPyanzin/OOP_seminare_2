package func;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FuncMain {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(ThreadLocalRandom.current().nextInt(100));
        }

        System.out.println(integers);

        integers.stream()
                .filter(it -> it % 2 == 0)
                .map(it -> it * 2)
                .limit(10)
                .map(it -> new String(it + "_"))
                .forEach(System.out::print); // it -> System.out.println(it + " ")
    }
}
