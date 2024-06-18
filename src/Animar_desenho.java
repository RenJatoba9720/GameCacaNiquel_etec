import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Animar_desenho extends JLabel implements Runnable {

	private int quadro1;

	private int quadro2;

	private int qtdeDeRepeticoes;

	private ArrayList<ImageIcon> linhaDoTempo;
	
	private int run;

	private Thread animacao;
	
	//treads a ser implementadas
	
	protected void runn(int rodando){
		rodando = run;
	}

	public Animar_desenho() {
		this.linhaDoTempo = new ArrayList<ImageIcon>();

		try {
			
			ImageIcon comeco = new ImageIcon(ImageIO.read(new File("imagem/coracao.png"))); // indice 0
			ImageIcon comeco2 = new ImageIcon(ImageIO.read(new File("imagem/coracao.png")));//1
			ImageIcon comeco3 = new ImageIcon(ImageIO.read(new File("imagem/estrelas.png")));//2
			ImageIcon comeco4 = new ImageIcon(ImageIO.read(new File("imagem/estrelas.png")));//3
			ImageIcon comeco5 = new ImageIcon(ImageIO.read(new File("imagem/etecJaragua.png")));//4
			ImageIcon comeco6 = new ImageIcon(ImageIO.read(new File("imagem/etecJaragua.png")));//5
			
			//0
			ImageIcon girando1 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 6
			ImageIcon girando2 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 7
			ImageIcon girando3 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 8
			ImageIcon girando4 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 9
			ImageIcon girando5 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 10
			ImageIcon girando6 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 11
			ImageIcon girando7 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 12
			ImageIcon girando8 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 13
			ImageIcon girando9 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 14
			ImageIcon girando10 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 15
			ImageIcon girando11 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 16
			ImageIcon girando12 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 17
			
			
			
			ImageIcon parado1 = new ImageIcon(ImageIO.read(new File("imagem/coracao.png"))); // indice 18
			ImageIcon parado2 = new ImageIcon(ImageIO.read(new File("imagem/coracao.png"))); // indice 19


			//1
			ImageIcon girando13 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 20
			ImageIcon girando14 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 21
			ImageIcon girando15 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 22
			ImageIcon girando16 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 23
			ImageIcon girando17 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 24
			ImageIcon girando18 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 25
			ImageIcon girando19 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 26
			ImageIcon girando20 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 27
			ImageIcon girando21 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 28
			ImageIcon girando22 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 29
			ImageIcon girando23 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 30
			ImageIcon girando24 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 31
			
			
			
			ImageIcon parado3 = new ImageIcon(ImageIO.read(new File("imagem/etecJaragua.png"))); // indice 32
			ImageIcon parado4 = new ImageIcon(ImageIO.read(new File("imagem/etecJaragua.png"))); // indice 33
			
			//2
			ImageIcon girando25 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 34
			ImageIcon girando26 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 35
			ImageIcon girando27 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 36
			ImageIcon girando28 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 37
			ImageIcon girando29 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 38
			ImageIcon girando30 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 39
			ImageIcon girando31 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 40
			ImageIcon girando32 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 41
			ImageIcon girando33 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 42
			ImageIcon girando34 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 43
			ImageIcon girando35 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 44
			ImageIcon girando36 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 45
			
			
			
			ImageIcon parado5 = new ImageIcon(ImageIO.read(new File("imagem/estrelas.png"))); // indice 46
			ImageIcon parado6 = new ImageIcon(ImageIO.read(new File("imagem/estrelas.png"))); // indice 47
			
			//3
			ImageIcon girando37 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 48
			ImageIcon girando38 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 49
			ImageIcon girando39 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 50
			ImageIcon girando40 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 51
			ImageIcon girando41 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 52
			ImageIcon girando42 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 53
			ImageIcon girando43 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 54
			ImageIcon girando44 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 55
			ImageIcon girando45 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 56
			ImageIcon girando46 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 57
			ImageIcon girando47 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 58
			ImageIcon girando48 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 59
			
			
			
			ImageIcon parado7 = new ImageIcon(ImageIO.read(new File("imagem/triste.png"))); // indice 60
			ImageIcon parado8 = new ImageIcon(ImageIO.read(new File("imagem/triste.png"))); // indice 61
			
			//4
			ImageIcon girando49 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 62
			ImageIcon girando50 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 63
			ImageIcon girando51 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 64
			ImageIcon girando52 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 65
			ImageIcon girando53 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 66
			ImageIcon girando54 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 67
			ImageIcon girando55 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 68
			ImageIcon girando56 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 69
			ImageIcon girando57 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 70
			ImageIcon girando58 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 71
			ImageIcon girando59 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 72
			ImageIcon girando60 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 73
			
			
			
			ImageIcon parado9 = new ImageIcon(ImageIO.read(new File("imagem/perdeu.png"))); // indice 74
			ImageIcon parado10 = new ImageIcon(ImageIO.read(new File("imagem/perdeu.png"))); // indice 75
			
			//5
			ImageIcon girando61 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 76
			ImageIcon girando62 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 77
			ImageIcon girando63 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 78
			ImageIcon girando64 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 79
			ImageIcon girando65 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 80
			ImageIcon girando66 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 81
			ImageIcon girando67 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecCoracao.png"))); // indice 82
			ImageIcon girando68 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEtecEstrela.png"))); // indice 83
			ImageIcon girando69 = new ImageIcon(ImageIO.read(new File("imagem/transicaoEstrelasTriste.png"))); // indeice 84
			ImageIcon girando70 = new ImageIcon(ImageIO.read(new File("imagem/tristeTransicaoPerdeu.png")));// indeice 85
			ImageIcon girando71 = new ImageIcon(ImageIO.read(new File("imagem/transicaoPerdeuSorteGrande.png")));// indeice 86
			ImageIcon girando72 = new ImageIcon(ImageIO.read(new File("imagem/transicaoSortegrandeCoracao.png")));// indeice 87
			
			ImageIcon parado11 = new ImageIcon(ImageIO.read(new File("imagem/sorteGrande.png"))); // indice 88
			ImageIcon parado12 = new ImageIcon(ImageIO.read(new File("imagem/sorteGrande.png"))); // indice 89
			
			//comeco
			this.linhaDoTempo.add(comeco);
			this.linhaDoTempo.add(comeco2);
			this.linhaDoTempo.add(comeco3);
			this.linhaDoTempo.add(comeco4);
			this.linhaDoTempo.add(comeco5);
			this.linhaDoTempo.add(comeco6);
			
			//0
			this.linhaDoTempo.add(girando1);
			this.linhaDoTempo.add(girando2);
			this.linhaDoTempo.add(girando3);
			this.linhaDoTempo.add(girando4);
			this.linhaDoTempo.add(girando5);
			this.linhaDoTempo.add(girando6);
			this.linhaDoTempo.add(girando7);
			this.linhaDoTempo.add(girando8);
			this.linhaDoTempo.add(girando9);
			this.linhaDoTempo.add(girando10);
			this.linhaDoTempo.add(girando11);
			this.linhaDoTempo.add(girando12);
			this.linhaDoTempo.add(parado1);
			this.linhaDoTempo.add(parado2);

			//1
			this.linhaDoTempo.add(girando13);
			this.linhaDoTempo.add(girando14);
			this.linhaDoTempo.add(girando15);
			this.linhaDoTempo.add(girando16);
			this.linhaDoTempo.add(girando17);
			this.linhaDoTempo.add(girando18);
			this.linhaDoTempo.add(girando19);
			this.linhaDoTempo.add(girando20);
			this.linhaDoTempo.add(girando21);
			this.linhaDoTempo.add(girando22);
			this.linhaDoTempo.add(girando23);
			this.linhaDoTempo.add(girando24);
			this.linhaDoTempo.add(parado3);
			this.linhaDoTempo.add(parado4);
			
			//2
			this.linhaDoTempo.add(girando25);
			this.linhaDoTempo.add(girando26);
			this.linhaDoTempo.add(girando27);
			this.linhaDoTempo.add(girando28);
			this.linhaDoTempo.add(girando29);
			this.linhaDoTempo.add(girando30);
			this.linhaDoTempo.add(girando31);
			this.linhaDoTempo.add(girando32);
			this.linhaDoTempo.add(girando33);
			this.linhaDoTempo.add(girando34);
			this.linhaDoTempo.add(girando35);
			this.linhaDoTempo.add(girando36);
			this.linhaDoTempo.add(parado5);
			this.linhaDoTempo.add(parado6);
			
			
			//3
			this.linhaDoTempo.add(girando37);
			this.linhaDoTempo.add(girando38);
			this.linhaDoTempo.add(girando39);
			this.linhaDoTempo.add(girando40);
			this.linhaDoTempo.add(girando41);
			this.linhaDoTempo.add(girando42);
			this.linhaDoTempo.add(girando43);
			this.linhaDoTempo.add(girando44);
			this.linhaDoTempo.add(girando45);
			this.linhaDoTempo.add(girando46);
			this.linhaDoTempo.add(girando47);
			this.linhaDoTempo.add(girando48);
			this.linhaDoTempo.add(parado7);
			this.linhaDoTempo.add(parado8);
			
			//4
			this.linhaDoTempo.add(girando49);
			this.linhaDoTempo.add(girando50);
			this.linhaDoTempo.add(girando51);
			this.linhaDoTempo.add(girando52);
			this.linhaDoTempo.add(girando53);
			this.linhaDoTempo.add(girando54);
			this.linhaDoTempo.add(girando55);
			this.linhaDoTempo.add(girando56);
			this.linhaDoTempo.add(girando57);
			this.linhaDoTempo.add(girando58);
			this.linhaDoTempo.add(girando59);
			this.linhaDoTempo.add(girando60);
			this.linhaDoTempo.add(parado9);
			this.linhaDoTempo.add(parado10);
			
			//5
			this.linhaDoTempo.add(girando61);
			this.linhaDoTempo.add(girando62);
			this.linhaDoTempo.add(girando63);
			this.linhaDoTempo.add(girando64);
			this.linhaDoTempo.add(girando65);
			this.linhaDoTempo.add(girando66);
			this.linhaDoTempo.add(girando67);
			this.linhaDoTempo.add(girando68);
			this.linhaDoTempo.add(girando69);
			this.linhaDoTempo.add(girando70);
			this.linhaDoTempo.add(girando71);
			this.linhaDoTempo.add(girando72);
			this.linhaDoTempo.add(parado11);
			this.linhaDoTempo.add(parado12);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void animar(int quadro1, int quadro2, int qtdeDeRepeticoes) {

		if(this.run==0){
		this.quadro1 = quadro1;

		this.quadro2 = quadro2;

		this.qtdeDeRepeticoes = qtdeDeRepeticoes;
		this.animacao = new Thread(this);
		this.animacao.start();
		}
	}

	@Override
	public void run() {
		if(run==0){
			this.run = 1;
		try {
			int posicaoAtualDaAnimacao = this.quadro1;
			do {
				while (posicaoAtualDaAnimacao <= this.quadro2) {
					
					ImageIcon quadroAtual = this.linhaDoTempo.get(posicaoAtualDaAnimacao);

					this.setIcon(quadroAtual);

					posicaoAtualDaAnimacao++;
					this.repaint();
					Thread.sleep(140);
				}

				posicaoAtualDaAnimacao = this.quadro1;
				this.qtdeDeRepeticoes--;
			} 
			while (this.qtdeDeRepeticoes > 0);{
			}
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.run=0;
	}
}
}
