import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;


import javax.imageio.ImageIO;
import javax.swing.*;
/*Recomenda-se rodar o exemplo1.plang no runtime integrado com a linguagem,
para comprovar que a geração funciona. lembre-se de passar o caminho
absoluto dos arquivos de áudio e imagens.
Ainda assim, temos o código gerado e o arquivo jar incluidos junto com o 
arquivo plang 
*/
public class Game {
	final static int WIDTH = 400;
	final static int HEIGHT = 500;
	final static Random r = new Random();
	public static BufferedImage readImage(String path) {
		try {
			return ImageIO.read(Game.class.getClassLoader().getResource(path));
		} catch (IOException e) {
			return null;
		}
	}
	public static BufferedImage readImage(String path,int w,int h) {
		try {
			java.awt.Image aux = ImageIO.read(Game.class.getClassLoader().getResource(path));
			aux = aux.getScaledInstance(w, h, BufferedImage.SCALE_SMOOTH);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsConfiguration config= ge.getDefaultScreenDevice().getDefaultConfiguration();
			BufferedImage img = config.createCompatibleImage(w, h);
			Graphics g = img.getGraphics();
			g.drawImage(aux,0,0,null);
			g.dispose();
			return img;
		} catch (IOException e) {
			return null;
		}
	}
	public static void main(String[] args) {
		GameState game = new GameState();
game.addVariable("vida", 51);
game.addVariable("vidaCoelho", 5000);
game.addVariable("danoCoelho", 50);
game.addVariable("danoJogador", 1);
game.addVariable("sucesso", true);
State jogo = new State("Você está numa batalha feroz contra um coelho assassino. Você tem %d de vida, e o coelho tem %d",new ArrayList<String>(Arrays.asList("vida","vidaCoelho")),readImage("resources/jogo.jpg")
,null);
State ataque = new State("Você ataca o coelho, ele mal reage.",new ArrayList<String>(),null,null);
State dano = new State("O coelho desvia e te ataca.",new ArrayList<String>(),null,null);
State fim = new State("Você pegará o coelho na próxima...",new ArrayList<String>(),null,null);
game.setState(jogo);
jogo.addChoice( new Choice( "Atacar",new ArrayList<String>(),new ArrayList<State>(Arrays.asList())){
public boolean visible() {
if(((Integer)game.variables.get("vida") > 10)){return true;}
 else{return false;}}

 public State getState(){
game.addVariable("sucesso",List.of(true,true,true,false).get(r.nextInt(4)));if(((boolean)game.variables.get("sucesso"))){
return ataque;
}
else{
return dano;
}

}
}
);
jogo.addChoice( new Choice( "Hora de correr!",new ArrayList<String>(),new ArrayList<State>(Arrays.asList(fim))){
public boolean visible() {
if(((Integer)game.variables.get("vida") > 10)){return false;}
 else{return true;}}

}
);
ataque.addChoice( new Choice("Droga!",new ArrayList<String>(),new ArrayList<State>(Arrays.asList(jogo))){
 public State getState(){
game.addVariable("vidaCoelho",((Integer)game.variables.get("vidaCoelho") - (Integer)game.variables.get("danoJogador")));

 return jogo;
}
}
);
dano.addChoice( new Choice("Isso doeu mais do que eu pensava...",new ArrayList<String>(),new ArrayList<State>(Arrays.asList(jogo))){
 public State getState(){
game.addVariable("vida",((Integer)game.variables.get("vida") - (Integer)game.variables.get("danoCoelho")));

 return jogo;
}
}
);
fim.addChoice( new Choice("Tentar de novo",new ArrayList<String>(),new ArrayList<State>(Arrays.asList(jogo))){
 public State getState(){
game.addVariable("vida",(51));

game.addVariable("vidaCoelho",(5000));

 return jogo;
}
}
);

JFrame f=new JFrame();//creating instance of JFrame 
		f.setLayout(new GridBagLayout());
		JPanel imageAndText = new JPanel();
		imageAndText.setLayout(new BoxLayout(imageAndText,BoxLayout.PAGE_AXIS));
		imageAndText.setBackground(Color.BLACK);
		JPanel choices = new JPanel();
		choices.setBackground(Color.black);
		choices.setLayout(new BoxLayout(choices,BoxLayout.PAGE_AXIS));
		 GridBagConstraints constr = new GridBagConstraints();
		 constr.fill = GridBagConstraints.BOTH;
		 constr.gridy = 0;
		 constr.weightx = 1;
		 constr.weighty = 0.6;
		f.add(imageAndText,constr);
		 constr.gridy = 1;
		 constr.weighty = 0.4;
		f.add(choices,constr);
		f.pack();
		
	 BufferedImage img = game.getState().getImage();
	 JLabel image = new JLabel();
	 if(img != null) {
		image.setIcon(new ImageIcon((BufferedImage)img));
	 }
		image.setAlignmentX(Component.CENTER_ALIGNMENT);
		imageAndText.add(image);
			
		AnimatedText b=new AnimatedText(game.getState().getText(game.getVariables()));//creating instance of JLabel
		ActionListener textHandler = new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		       b.textCrawl();
		       if(b.done()) {
		        	b.reset();
		        	((Timer)e.getSource()).stop();
		        	}
		       //textAnimation(b,game.currentState.getText(game.getVariables()));
		  }
		 };
		 Timer textTimer = new Timer(6,textHandler);
			   
			    
		 b.setWrapStyleWord(true);
	     b.setLineWrap(true);
		 b.setOpaque(false);
		 b.setEditable(false);
		 b.setFocusable(false);
		 b.setBackground(UIManager.getColor("Label.background"));
		 b.setFont(UIManager.getFont("Label.font"));
		 b.setBorder(UIManager.getBorder("Label.border"));
		 b.setForeground(Color.WHITE);
		 b.setBackground(Color.BLACK);
		 
		imageAndText.add(b);
		ArrayList<JLabel> currentChoices = new ArrayList<>();
		
		MouseAdapter mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				game.getState().playSound();
				BufferedImage img = game.getState().getImage();
				if(img != null) {
					 image.setIcon(new ImageIcon(img));
					}
					else {
					 image.setIcon(null);
					}				
				b.setText(game.currentState.getText(game.getVariables()));
				textTimer.start();
				int i = 0;
				ArrayList<Choice> current = game.currentState.getChoices();
				for(var c: current) {
					if(i < currentChoices.size()) {
						for(var l:currentChoices.get(i).getMouseListeners()) {
							currentChoices.get(i).removeMouseListener(l);
						}
						currentChoices.get(i).addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent e) {
								game.setState(c.getState());
							}
						});
						currentChoices.get(i).addMouseListener(this);
						currentChoices.get(i).setText(c.getText(game.variables));
						currentChoices.get(i).setVisible(true);
						
					}
					else {
						JLabel aux = new JLabel(c.getText(game.variables));
						aux.addMouseListener(this);
						aux.setForeground(Color.CYAN);
						currentChoices.add(aux);
						choices.add(aux);
					}
					i++;
				}
				int aux = currentChoices.size() - current.size();
				if(aux > 0) {
					for( i= current.size();i<currentChoices.size();i++) {
						currentChoices.get(i).setVisible(false);
					}
				}
				
			}
		};
		
		//Cria um JLabel para cada escolha
		for(var c: game.currentState.getChoices()) {
			JLabel aux = new JLabel(c.getText(game.variables));
			aux.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					game.setState(c.getState());
				}
			});
			aux.addMouseListener(mouseListener);
			aux.setForeground(Color.CYAN);
			choices.add(aux);
			currentChoices.add(aux);
			
		}
		f.setSize(WIDTH,HEIGHT);  
		f.setLocationRelativeTo(null);
		f.setVisible(true);//making the frame visible
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

	}
}
class AnimatedText extends JTextArea {
	private int charIndex;
	private String a;
	public AnimatedText(String text) {
		super(text);
		charIndex = 0;
	    a = "";
	}
	public void reset() {
		charIndex = 0;
		a = "";
	}
	public void textCrawl() {
		boolean isWhiteSpace = true;
		if(a.length()==0) {
			a = getText();
			setText("");
		}
		if(!done()) {
			while(isWhiteSpace) {
		setText(this.getText()+a.charAt(charIndex));
		if(!(a.charAt(charIndex) == ' ')) {		
			isWhiteSpace = false;
		}
		charIndex++;
		}
		repaint();
		}
	}
	public boolean done() {
		if(a.equals(getText())) {
			return true;
		}
		return false;
	}
	//public void paintComponent(Graphics g) {
		//super.paintComponent(g);
	//	g.drawString(a,10,20);
	//}
	}
