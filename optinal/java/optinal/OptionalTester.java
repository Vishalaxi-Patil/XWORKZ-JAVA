package optinal;

import java.util.Optional;

public class OptionalTester {
	public static void main(String[] args) {
		
		String name=null;
		System.out.println(name);
		Optional<String> optional=Optional.of("vishalaxikp@gamil.com");
		System.out.println(optional.isPresent());
		if(optional.isPresent()) {
		  System.out.println(optional.get());
		}
		Optional<Integer> yearOptional=optional.empty();
		System.out.println(yearOptional.isPresent());
		
		optional.ifPresent(v->System.out.println(v));
		
		Optional<String> country=optional.ofNullable("India");
		
		optional.ifPresent(e->{
			String value=country.map(String::toUpperCase).get();
			System.out.println("value:"+value);
			
		});
		
		String defau=optional.orElse("Srilanka");
		System.out.println("Deault value:"+defau);
	}

}
