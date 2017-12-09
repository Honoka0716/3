
public class RegularExpression {
	public static void main(String[] arg) {
		String s = "I am a strange String, I am here to test the regular expression, hahahahaha, aaaabbc";
		/* abc 
		 * [abc]
		 * [a-z]
		 * [^abc]
		 * a+
		 * a?
		 * . .......
		 */
		//All the case about java regex 
		//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		String[] words = s.split(",? ");
		for(String word : words) {
			if(word.matches("a.+c")) // this is find all words start with 'a' end with 'c'
				System.out.println(word);
		}
	}
}
