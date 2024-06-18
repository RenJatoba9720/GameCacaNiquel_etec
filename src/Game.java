import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame implements ActionListener {

	private Animar_desenho ad;
	private Animar_desenho ad2;
	private Animar_desenho ad3;
	private int coins = 500;

	private JLabel marcador2;
	private JButton alavanca;

	public Game() {


		this.alavanca = new JButton("Girar !");
		this.alavanca.addActionListener(this);

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints coordenada = new GridBagConstraints();

		this.setLayout(layout);

		// Titulo
		JLabel tit = new JLabel("Jogo Caça Niquel", JLabel.CENTER);
		tit.setFont(new Font("Verdana", Font.BOLD, 18));
		tit.setForeground(Color.red);
		coordenada.gridx = 0;
		coordenada.gridy = 0;
		coordenada.gridwidth = 3;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		coordenada.insets = new Insets(0, 10, 0, 0);
		layout.setConstraints(tit, coordenada);
		this.getContentPane().add(tit);

		// img 1
		this.ad = new Animar_desenho();
		coordenada.gridx = 0; // coordenada x
		coordenada.gridy = 1; // coordenada y
		coordenada.gridwidth = 1;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		layout.setConstraints(ad, coordenada);
		this.getContentPane().add(ad);

		// img 2
		this.ad2 = new Animar_desenho();
		coordenada.gridx = 1; // coordenada x
		coordenada.gridy = 1; // coordenada y
		coordenada.gridwidth = 1;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		layout.setConstraints(ad2, coordenada);
		this.getContentPane().add(ad2);

		// img 3
		this.ad3 = new Animar_desenho();
		coordenada.gridx = 2; // coordenada x
		coordenada.gridy = 1; // coordenada y
		coordenada.gridwidth = 1;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		layout.setConstraints(ad3, coordenada);
		this.getContentPane().add(ad3);

		//label1
		JLabel marcador = new JLabel("Coins: R$");
		coordenada.gridx = 0;
		coordenada.gridy = 2;
		coordenada.gridwidth = 1;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		coordenada.insets = new Insets(0, 10, 0, 0);
		layout.setConstraints(marcador, coordenada);
		this.getContentPane().add(marcador);
		
		//label2
		this.marcador2 = new JLabel("" + coins );
		coordenada.gridx = 1;
		coordenada.gridy = 2;
		coordenada.gridwidth = 1;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		coordenada.insets = new Insets(0, 10, 0, 0);
		layout.setConstraints(marcador2, coordenada);
		this.getContentPane().add(marcador2);
		
		
		// botao
		coordenada.gridx = 0;
		coordenada.gridy = 3;
		coordenada.gridwidth = 3;
		coordenada.fill = GridBagConstraints.HORIZONTAL;
		coordenada.insets = new Insets(0, 10, 0, 0);
		layout.setConstraints(alavanca, coordenada);

		this.getContentPane().add(alavanca);

		this.ad.animar(0, 1, 1);
		this.ad2.animar(2, 3, 1);
		this.ad3.animar(4, 5, 1);
		
		this.setTitle("Os indecisos");
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		coins-=15;
		int girou = (int) Math.round(Math.random() * 5);
		int girou2 = (int) Math.round(Math.random() * 5);
		int girou3 = (int) Math.round(Math.random() * 5);

		if(girou==0){
			this.ad.animar(6, 19, 1);
		}
		if(girou2==0){
			this.ad2.animar(6, 19, 1);
		}
		if(girou3==0){
			this.ad3.animar(6, 19, 1);
		}
		if(girou==1){
			this.ad.animar(20, 33, 1);
		}
		if(girou2==1){
			this.ad2.animar(20, 33, 1);
		}
		if(girou3==1){
			this.ad3.animar(20, 33, 1);
		}
		
		if(girou==2){
			this.ad.animar(34, 47, 1);
		}
		if(girou2==2){
			this.ad2.animar(34, 47, 1);
		}
		if(girou3==2){
			this.ad3.animar(34, 47, 1);
		}
		
		if(girou==3){
			this.ad.animar(48, 61, 1);
		}
		if(girou2==3){
			this.ad2.animar(48, 61, 1);
		}
		if(girou3==3){
			this.ad3.animar(48, 61, 1);
		}
		
		if(girou==4){
			this.ad.animar(62, 75, 1);
		}
		if(girou2==4){
			this.ad2.animar(62, 75, 1);
		}
		if(girou3==4){
			this.ad3.animar(62, 75, 1);
		}
		
		
		if(girou==5){
			this.ad.animar(76, 89, 1);
		}
		if(girou2==5){
			this.ad2.animar(76, 89, 1);
		}
		if(girou3==5){
			this.ad3.animar(76, 89, 1);
		}
		
		
		if ((girou == 2)||(girou2 == 2)||(girou3==2)) {
			coins+=5;
			if(((girou == 2)&&(girou2 == 2))||((girou2 == 2)&&(girou3 == 2))||((girou == 2)&&(girou3 == 2))){
				coins+=10;
			}
			if((girou == 2)&&(girou2 == 2)&&(girou3 == 2)){
				coins+=95;
			}
			
		}
		
		
		
		if (((girou == 0)&&(girou2 == 0))||((girou2 == 0)&&(girou3 == 0))||((girou == 0)&&(girou3 == 0))) {
			coins+=30;
		if((girou == 0)&&(girou2 == 0)&&(girou3 == 0)){
			coins+=120;
			}
		}
		
		if (((girou == 1)&&(girou2 == 1))||((girou2 == 1)&&(girou3 == 1))||((girou == 1)&&(girou3 == 1))) {
			coins+=50;
		if((girou == 1)&&(girou2 == 1)&&(girou3 == 1)){
			coins+=200;
			}
		}
		if((girou == 3)&&(girou2 == 3)&&(girou3 == 3)){
			coins+=300;
		}
		if((girou == 4)&&(girou2 == 4)&&(girou3 == 4)){
			coins+=300;
		}
		if((girou == 5)&&(girou2 == 5)&&(girou3 == 5)){
			coins+=1000;
		}
		
		this.marcador2.setText("" + coins); 
		
		if(coins<=0){
			System.exit(EXIT_ON_CLOSE); 
		}
	}
}
