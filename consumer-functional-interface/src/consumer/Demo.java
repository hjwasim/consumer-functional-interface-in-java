package consumer;

import java.util.Scanner;
import java.util.function.Consumer;

public class Demo {
	// Consumer also a functional interface, present in util.function package,
	// which contains only one abstract method called 'accept'.
	// it means that, it accept something and it will not return anything
	// it takes one parameter and it returns nothing,
	// mostly it'll be useful for printing lines dynamically,
	public static void main(String[] args) {
		// Example 1 : Print a greeting message with name, age, location for user
		// givning input.
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		String location = sc.next();
		sc.close();
		Consumer<String> greetingConsumer = n -> System.out.printf("Welcome %s! \n", n);
		Consumer<Integer> ageConsumer = a -> System.out.printf("Your age is %d \n", a);
		Consumer<String> locationConsumer = l -> System.out.printf("Currently, you're located in %s \n", l);
		Consumer<String> thanksConsumer = t -> System.out.println(t);
		greetingConsumer.accept(name);
		ageConsumer.accept(age);
		locationConsumer.accept(location);
		thanksConsumer.accept("Thank you!");
	}
}
