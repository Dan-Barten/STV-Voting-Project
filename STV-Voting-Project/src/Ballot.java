// Stores user input on candidate choices
import java.util.ArrayList;
public class Ballot {
	private Office office = new Office();
	private ArrayList<Candidate> choices = new ArrayList<Candidate>();

	// Gives the choice asked for by 0 index
	public Candidate getChoice(int choice) {
		try {
			return choices.get(choice);
		} catch (Exception e) {
			throw e;
		}	
	}
}
