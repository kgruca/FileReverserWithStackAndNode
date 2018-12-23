
public class Foothill {

	public static void main(String[] args) {
		
		//Reverse Poem
		Reverser<String> poem = new Reverser<String>();
		
		poem.FileToStack("/Users/krzysztofgruca/Desktop/github projects/CS1B_Project5/src/poem.rtf");
		poem.StackToFile("/Users/krzysztofgruca/Desktop/github projects/CS1B_Project5/src/revpoem");
		
		//Reverse Maji
		Reverser<Float> maji = new Reverser<Float>();
		maji.FileToStack("/Users/krzysztofgruca/Desktop/github projects/CS1B_Project5/src/maji.rtf");
		maji.StackToFile("/Users/krzysztofgruca/Desktop/github projects/CS1B_Project5/src/revmaji");
	}
}
