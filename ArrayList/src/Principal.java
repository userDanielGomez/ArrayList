import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Motos moto1 = new Motos("Yamaha", "MT-09", 50);
		Motos moto2 = new Motos("Susuki", "Gixxer", 900);
		Motos moto3 = new Motos("Generica1", "ejemplo1", 100);
		Motos moto4 = new Motos("Generica2", "ejemplo2", 100);
		
		List<Motos> listaMotos = new ArrayList<Motos>();
		
//		System.out.println(listaMotos);
		

//		
//		System.out.println(listaMotos);
		
		//CRUD CREATE
		listaMotos.add(moto1);
		listaMotos.add(moto2);
		listaMotos.add(moto3);
		listaMotos.add(moto4);
		
		
		//CRUD READ
		for(int i=0; i<listaMotos.size();i++) {
			System.out.println(listaMotos.get(i));
		}
		
		//CRUD UPDATE
		for (int i=0; i<listaMotos.size();i++) {
			if(listaMotos.get(i).getMarca()=="Susuki") {
				listaMotos.get(i).setMarca("cambiado");
			}
		}
		
		System.out.println(listaMotos);
		for(int i=0; i<listaMotos.size();i++) {
			System.out.println(listaMotos.get(i));
		}
		//CRUD DELETE
		
		
	}
}