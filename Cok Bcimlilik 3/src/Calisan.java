
public class Calisan {

	private String isim ;
	private String gorev;
	private int maas;
	
	public Calisan ( String i,String g,int m ) {// ana metod 
	
		isim = i;
		gorev=g ;
		maas =m;
	}   
	
	public String getİsim() {
		return isim;
	}
	
	public void setİsim(String i) {
		isim=i;
	}
	
	public String getGorev () {
		return gorev;
	}
	public void setGorev(String g) {
		gorev=g;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas (int m) {
		maas=m;
	}
	
	public void ozet() {
		System.out.println("İsim : " + isim);
		System.out.println("Görev : " + gorev);
		System.out.println("Maas : " + maas);
	}
	
	
}
