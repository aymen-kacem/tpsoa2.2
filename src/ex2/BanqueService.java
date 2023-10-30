package ex2;
import java.time.*;
import java.util.*;
public class BanqueService {

	public double conversion(double montant) {
		return montant*3.3;
	}
	public Compte getCompte() {
		return new Compte(0, 0, null);
	}
	public List<Compte> getComptes(){
		ArrayList s= new ArrayList();
		BanqueService b =new BanqueService();
		for(int i=0;i<5;i++) {
			s.add(b.getCompte());
		}
		return s;
		
	}
	
	}
	

