import java.util.ArrayList;
import java.util.LinkedHashMap;


public class Choice {
	String text;
	ArrayList<State> nextStates;
	ArrayList<String>formatArgs;
	public Choice(String text,ArrayList<String>formatArgs ,ArrayList<State>nextStates) {
		this.text = text;
		this.nextStates = nextStates;
		this.formatArgs = formatArgs;
	}
	
	public State getState() {
		return nextStates.get(0);
	}
	public boolean visible() {
		return true;
	}
	public String getText(LinkedHashMap<String,Object> variables) {
		if(formatArgs.isEmpty()) return text;
		else {
			ArrayList<Object> aux = new ArrayList<>();
			for(var arg:formatArgs) {
				aux.add(variables.get(arg));
			}
			
			return String.format(text, aux.toArray());
		}
	}
}

