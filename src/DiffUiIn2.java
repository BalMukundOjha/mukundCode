import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiffUiIn2 {
	
public static void main(String[] args) {
	
	List<String> listA = Arrays.asList("george", "jim", "Blakae", "Kevin", "michael");
	List<String> listB = Arrays.asList("george","katie","Kevin","michelle","ryan");

	List<String> intersection = listA.stream()
	        .filter(listB::contains)
	        .collect(Collectors.toList());

	List<String> union = Stream.concat(listA.stream(), listB.stream())
	        .distinct().sorted()
	        .collect(Collectors.toList());

	List<String> aDiffB = listA.stream()
	        .filter(i -> !listB.contains(i))
	        .collect(Collectors.toList());

	System.out.println(intersection); // [5, 6, 8, 10]
	System.out.println(union); // [0, 2, 4, 5, 6, 7, 8, 9, 10]
	System.out.println(aDiffB); // [0, 2, 4]
		

	}

}
