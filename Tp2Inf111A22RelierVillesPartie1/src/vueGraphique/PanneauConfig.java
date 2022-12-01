package vueGraphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauConfig extends JPanel {
	
	JPanel subPaneT = new JPanel();
	private final int NB_ELEMENTS = 12;
	

	PanneauConfig(){

		initPanneau();
		
	}
	
	private void initPanneau() {
		
		
		
		this.setPreferredSize(new Dimension(250,100));
		this.setBackground(Color.GRAY);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		
		// Creation et Ajout d'un sous panneau
		//subPaneT.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		subPaneT.setPreferredSize(new Dimension(125,100));
		subPaneT.setBackground(Color.GRAY);
		this.add(subPaneT,BorderLayout.LINE_END);
		
		// Ajout de espace de texte
		
		
		
		

		
		
	}

}
	
	


	



