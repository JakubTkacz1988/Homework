package PPJ;

public class Samochod extends Dzia�anieSwiatel implements SwiatlaWSamochodzie  {
	@Override
	public void SwiatalDrogowe() {
		if(noc) {System.out.println("Samoch�d ma zaplaone �wita�a w nocy");}
		else {System.out.println("Samochod ma zagaszone �wita�a w dzie�");}
		
	}

	@Override
	public void KierunkowskazLewy() {
		if(skrecanieWLewoKierunkowskazuLewgo) {System.out.println("Samoch�d skr�ca w lewo");}
		else {System.out.println("Samochod nie skr�ca w lewo");}	
		
	}

	@Override
	public void KierunkowskazPrawy() {
		if(skrecanieWLewoKierunkowskazuPrawego) {System.out.println("Samoch�d skr�ca w prawo");}
		else {System.out.println("Samochod nie skr�ca w prawo");}
		
	}

	@Override
	public void SwiatloStopu() {
		if(samochodHamuje) {System.out.println("Samoch�d hamuje zapala sie �wta�o stopu");}
		else {System.out.println("Samoch�d jdzie nie zapala sie �wita�o stopu ");}
		
	}

	@Override
	public void SwitaloAwaryjne() {
		if(smochodJedzie) {System.out.println("Samoch�d stoi na poboczu");}
		else if(samochodStoiKirowcaDziekuje) {System.out.println("Kierowca dzi�kuje za wpuszczenie na pas jezdni ");}
		else {System.out.println("Samochod jedzie");}
		

}}


