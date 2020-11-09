package com.swissas.coding.interview.greeting;

import java.util.stream.Stream;

/**
 * Prints "Hello!" indefinitely(*) on the console.
 * <p>
 * On the first line, prints "Hello!" once. On the second time, two times, etc.
 * and never ends(*).
 * <p>
 * As is, this code will stop quickly and not provide any output on the console.
 * Please refactor the generate method so that the code runs forever(*) and 
 * prints the ever growing message on the console.
 * <p>
 * Rules:
 * <li>You are not allowed to change the buildMessage method</li>
 * <li>The buildMessage method can only be called from the generate method</li>
 * <li>You are allowed to change the signature of the generate method</li>
 * <li>The only method that can output something on the console is the main 
 * method</li>
 * <p>
 * (*) well, nothing is really forever. Make it run as long as possible!
 * 
 * @author XPHC
 */
public class GreetingGenerator {
	
	String generate(Stream<Integer> numbers) {
		StringBuilder result = new StringBuilder();
		numbers.forEach(n -> result.append(buildMessage(n)));
		return result.toString();
	}
	
	String buildMessage(Integer n) {
		String s = "Hello! ";
		return s.repeat(n).trim()+System.lineSeparator();
	}
	
	public static void main(String[] args) {
		GreetingGenerator generator = new GreetingGenerator();
		Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
		System.out.print(generator.generate(stream));
	}

}
