package transporte;

import recursos.Carro;

public class Main {

	public static void main(String[] args) {
		
			
		Carro c = new Carro();
		
		String ultimoDigito = c.isDigito("POL-640");
		String fecha = c.isFecha("21/02/2017");
		boolean hora = c.isHora(9.30); 
		
		
		switch(fecha){
		
		case "LUNES":
			if (hora == true){
				if (ultimoDigito.equals("0")||ultimoDigito.equals("1")){
					System.out.println("No puede circular");
				}else{
					System.out.println("Si puede circular");
				}	
			}else{
				System.out.println("Si puede circular");
			}
			break;
		case "MARTES":
			if (hora == true){
				if (ultimoDigito.equals("2")||ultimoDigito.equals("3")){
					System.out.println("No puede circular");
				}else{
					System.out.println("Si puede circular");
				}	
			}else{
				System.out.println("Si puede circular");
			}
			break;
		case "MIERCOLES":
			if (hora == true){
				if (ultimoDigito.equals("4")||ultimoDigito.equals("5")){
					System.out.println("No puede circular");
				}else{
					System.out.println("Si puede circular");
				}	
			}else{
				System.out.println("Si puede circular");
			}
			break;
		case "JUEVES":
			if (hora == true){
				if (ultimoDigito.equals("6")||ultimoDigito.equals("7")){
					System.out.println("No puede circular");
				}else{
					System.out.println("Si puede circular");
				}	
			}else{
				System.out.println("Si puede circular");
			}
			break;
		case "VIERNES":
			if (hora == true){
				if (ultimoDigito.equals("8")||ultimoDigito.equals("9")){
					System.out.println("No puede circular");
				}else{
					System.out.println("Si puede circular");
				}	
			}else{
				System.out.println("Si puede circular");
			}
			break;
		default :
			System.out.println("Si puede circular");
		}
		

	}

}
