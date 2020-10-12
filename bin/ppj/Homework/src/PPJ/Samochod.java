package PPJ;

public class Samochod extends Dzia³anieSwiatel implements SwiatlaWSamochodzie  {
	@Override
	public void SwiatalDrogowe() {
		if(noc) {System.out.println("Samochód ma zaplaone œwita³a w nocy");}
		else {System.out.println("Samochod ma zagaszone œwita³a w dzieñ");}
		
	}

	@Override
	public void KierunkowskazLewy() {
		if(skrecanieWLewoKierunkowskazuLewgo) {System.out.println("Samochód skrêca w lewo");}
		else {System.out.println("Samochod nie skrêca w lewo");}	
		
	}

	@Override
	public void KierunkowskazPrawy() {
		if(skrecanieWLewoKierunkowskazuPrawego) {System.out.println("Samochód skrêca w prawo");}
		else {System.out.println("Samochod nie skrêca w prawo");}
		
	}

	@Override
	public void SwiatloStopu() {
		if(samochodHamuje) {System.out.println("Samochód hamuje zapala sie œwta³o stopu");}
		else {System.out.println("Samochód jdzie nie zapala sie œwita³o stopu ");}
		
	}

	@Override
	public void SwitaloAwaryjne() {
		if(smochodJedzie) {System.out.println("Samochód stoi na poboczu");}
		else if(samochodStoiKirowcaDziekuje) {System.out.println("Kierowca dziêkuje za wpuszczenie na pas jezdni ");}
		else {System.out.println("Samochod jedzie");}
		

}}


