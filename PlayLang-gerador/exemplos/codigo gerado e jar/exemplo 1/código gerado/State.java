import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;


public class State {
	String text ;
	ArrayList<Choice> choices;
	ArrayList<String> formatArgs;
	BufferedImage img;
	AudioInputStream stream;
	Clip audio;
	public State (String text,ArrayList<String> args,BufferedImage img,String audioPath) {
		this.text = text; 
		this.choices = new ArrayList<Choice>();
		this.formatArgs = args;
		this.img = img;
		try {
			stream = AudioSystem.getAudioInputStream(getClass().getResource(audioPath));
			audio = AudioSystem.getClip();
			audio.open(stream);
			
		} catch (Exception e) {
			stream = null;
			audio = null;
			//e.printStackTrace();
		}
		
	}
	public void playSound() {
		if(audio != null) {
			audio.setFramePosition(0);
			audio.start();
		}
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
	
	 public  BufferedImage getImage() {
		 return img;
	 }
	
	public ArrayList<Choice> getChoices(){
		 ArrayList<Choice> aux= new ArrayList<>();
		 for(var choice:choices) {
			 if(choice.visible()) aux.add(choice);
		 }
		return aux;
	}
	
	public void addChoice(Choice choice) {
		choices.add(choice);
	}
}





