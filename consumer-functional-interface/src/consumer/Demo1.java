package consumer;

import java.util.function.Consumer;

public class Demo1 {
	public static void main(String[] args) {
		// We can use default methods too, name is andThen()
		// basically it chaining the two or more the consumer interface.
		// example, print the multiple lines using a string by using consumer chaining.

		String user_name = "Hjwasim";
		Consumer<String> greeting1 = s -> System.out.printf("Welcome %s! \n", s);
		Consumer<String> greeting2 = s -> System.out.printf("Hellooooo %s \n", s);
		Consumer<String> greeting3 = s -> System.out.printf("Hiiii %s", s);

		greeting1.andThen(greeting2).andThen(greeting3).accept(user_name);

		// O/P
		// Welcome Hjwasim!
		// Hellooooo Hjwasim
		// Hiiii Hjwasim
	}
}
