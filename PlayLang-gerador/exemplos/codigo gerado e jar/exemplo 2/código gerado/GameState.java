import java.util.LinkedHashMap;
public class GameState {

	State currentState ;
	LinkedHashMap<String,Object> variables;
	
	public GameState() {
		variables = new LinkedHashMap<>();
	}
	
	public void addVariable(String s, Object o) {
		variables.put(s, o);
	}
	
	public Object getVariable(String s) {
		return variables.get(s);
	}
	
	public State getState() {
		return currentState;
	}
	public void setState(State next) {
		currentState = next;
	}
	public LinkedHashMap<String,Object> getVariables(){
		return variables;
	}
}

