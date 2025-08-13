package guvi_Assessment_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapUpperCase {

	public static void main(String[] args) {
 
//Question 1 
		
		Stream<String> name = Stream.of("aBc", "d", "ef");
		

//		Using method refernce
//		List<String> capital = name.map(String::toUpperCase).collect(Collectors.toList()); 
		
//		using Lambda Expression
		List<String> capital = name.map(str->str.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("Capital: " + capital);
		
//Question 2
		
		List <String> name1 = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		
//		Using LambdaExpression
		List<String> notEmpty = name1.stream().filter(str->!str.isEmpty()).collect(Collectors.toList());  
//		List<String> notEmpty = name1.stream().filter(String::isEmpty).collect(Collectors.toList());
		System.out.println("empty strings = " + notEmpty);
		
		
//Question 3 
		
       List <String> students = Arrays.asList("Arav","Aravind","Anushan","Arun","Barani","Bhava","Dhanush","Eswari","Farhan","Ganesh");



     //List<String> namewithA = students.stream().filter(String::startsWith("")).collect(Collectors.toList());

     List<String> namewithA = students.stream().filter(str->str.startsWith("A")).collect(Collectors.toList());
     System.out.println("Name of students starting with A " + namewithA);


	}

}
