import java.io.*;

public class Reverser<E> {

	private Stack<E> stk;
	
	public Reverser() {
		stk = new Stack<E>();
	}
	
	public void FileToStack(String input) {
		BufferedReader myFileIn;
		int k;
		
		try {
			myFileIn = new BufferedReader(new FileReader(input));
			for(k = 0; myFileIn.ready(); k++)
				stk.push((E)myFileIn.readLine());
			myFileIn.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Uhoh, file not found!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void StackToFile(String output) {
		PrintWriter myFileOut;
		int k ,val;
		
		try {
			myFileOut = new PrintWriter(output);
			for(k = 0; !stk.isEmpty(); k++)
				myFileOut.println(stk.pop());
			myFileOut.close();
		} catch (FileNotFoundException e) {
			System.out.println("Oops, file not found!");
		}
	}
	
}
