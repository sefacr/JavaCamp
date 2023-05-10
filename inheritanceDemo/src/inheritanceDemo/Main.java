package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

//		TarimKrediManager tarimKrediManager = new TarimKrediManager();
//		tarimKrediManager.add();
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		ogretmenKrediManager.hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(new TarimKrediManager());
	}

}
