package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExemploStream {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("C", "PHP", "Kotlin", "Java", "JS", "Python", "C#");
		System.out.println(langs.stream().count());
		System.out.println(langs.stream().max(Comparator.comparingInt(String::length)));
		System.out.println(langs.stream().min(Comparator.comparingInt(String::length)));
	}
}