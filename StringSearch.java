
import java.util.*;
import java.util.Arrays;
public class StringSearch {
public static void main(String[] args) {
		String [] strArray= {"abc","aaa","ecb","abbbc","aea"};
		List<String> strList =Arrays.asList(strArray);
		strList.stream().filter(s -> s.startsWith("a"))
		                .filter(s -> s.length() == 3)
		                .forEach(System.out::println);


	}

}
