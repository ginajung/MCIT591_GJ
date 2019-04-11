
/**
 * Starting from my name 'ginajung'
 * add, delete and replace the characters 
 * to generate palindrome word
 * 
 * Print this palindrome.You are not allowed to create more than one StringBuilder object
 * while doing this question.
 * @author Gina Jung
 *
 */

public class StringBuilderExperiment {

	public static void main(String[] args) {
		// generate StringBuilder sb and print out the name
		StringBuilder sb =new StringBuilder ("ginajung"); 
		System.out.println(sb);
		
		// generate palindrome word
		//add string 
		sb.append("ig");
		// delete in the middle
		sb.delete(7,8);
		//replace string
		sb.replace(4, 6,"a");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		// confirm palindrome word
	
	}

}
