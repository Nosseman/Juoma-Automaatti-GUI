
public class automaatti {
	
	//luodaan muuttujat juomien m‰‰rille
	private int kahvi;
	private int tee;
	private int kaakao;
	
	public automaatti() {
		this.kahvi = 48;
		this.tee = 50;
		this.kaakao = 19;
	}
	
	//generoidaan setterit ja getterit
	public int getKahvi() {
		if (kahvi < 10) {
			return 0;
		} else
		return kahvi;
	}
	
	public void setKahvi(int kahvi) {
		this.kahvi = kahvi;
	}
	public int getTee() {
		if (tee < 10) {
			return 0;
		} else
		return tee;
	}
	public void setTee(int tee) {
		this.tee = tee;
	}
	public int getKaakao() {
		if (kaakao < 10) {
			return 0;
		} else
		return kaakao;
	}
	public void setKaakao(int kaakao) {
		this.kaakao = kaakao;
	}
	
	// luodaan metodit juomien valmistamiselle
	//j‰tet‰‰n systemoutprintit jotta voidaan tarkistaa metodien toiminta
	public void valmistaKahvi() {
		if (kahvi < 10) {
			this.kahvi = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Kahvia ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.kahvi -= 10;
			System.out.println("Odota hetki, kahvisi valmistuu. ");
		}
	}

	public void valmistaTee() {
		if (this.tee < 10) {
			this.tee = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Teet‰ ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.tee -= 10;
			System.out.println("Odota hetki, teesi valmistuu. ");
		}
	}

	public void valmistaKaakao() {
		if (this.kaakao < 10) {
			this.kaakao = 0; // jotta raaka-aineen m‰‰r‰ ei mene alle 0
			System.out.println("Kaakaota ei ole en‰‰ j‰ljell‰! Ole hyv‰ ja t‰yt‰ s‰iliˆ.");
		} else {
			this.kaakao -= 10;
			System.out.println("Odota hetki, kaakaosi valmistuu. ");
		}
	}
}
