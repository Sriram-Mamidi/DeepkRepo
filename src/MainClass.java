import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("B","A","A","C","B","A","B","A","C","A");
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(t->t,Collectors.counting()));
		System.out.println(collect);
		
	}

}
