package ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueService b =new BanqueService();
		System.out.println("le montant est :"+b.conversion(120));
		System.out.println("le compte est:"+b.getCompte().code+b.getCompte().solde+b.getCompte().dateCreation);
		for(int i=0;i<5;i++) {
			System.out.println("le compte"+i+""+b.getComptes().get(i).code+b.getComptes().get(i).solde+b.getComptes().get(i).dateCreation);// get et toString
		}
		 //List<String> color = Arrays.asList("Blue", "Red", "Green"); equivalant a add 

	}

}
