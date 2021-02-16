package com.xworkz.optional;

import java.util.Optional;

import com.xworkz.optional.dto.WonderDTO;

public class OptionalWonderTester {

	public static void main(String[] args) {

		WonderDTO dto = new WonderDTO();
		dto.setName("Pyramid");

		Optional<String> optHesaru = Optional.of("Pyramid");
		dto.setHesaru(optHesaru);
		System.out.println(dto.getHesaru());

		String optString = optHesaru.get();
		// System.out.println(optString);

		Optional<String> optHesaru1 = dto.getHesaru();
		System.out.println(optHesaru1.isPresent());
		optHesaru1.ifPresent(v -> System.out.println(v));

		String name = optHesaru1.get();
		if (optString.contains("y")) {
			System.out.println("y is present");

			// single line by using filter
			optHesaru1.map(v -> v.contains("y")).ifPresent(v -> System.out.println("y is found"));

			// map is converted to String

			String map = optHesaru1.map(v -> v.toUpperCase()).get();
			// System.out.println(map);

			optHesaru.filter(v -> true).map(v -> v.toUpperCase()).ifPresent(v -> System.out.println("Y is in capital"));

			// flatp converts from one to another type
			Boolean b = optHesaru.flatMap(v -> Optional.of(true)).get();
			System.out.println(b);

		}
	}

}
