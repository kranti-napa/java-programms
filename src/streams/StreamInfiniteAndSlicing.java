package streams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamInfiniteAndSlicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Stream.iterate(0, n -> n+2).skip(5).limit(10).collect(Collectors.toList());
		
		System.out.println(numbers);

	}

}
