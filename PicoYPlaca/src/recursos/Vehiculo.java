package recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Vehiculo implements Manejable {
	
	private String numeroPlaca;
	private String fecha;
	private String hora;
	
	public Vehiculo() {
		super();
	}

	public Vehiculo(String numeroPlaca, String fecha, String hora) {
		super();
		this.numeroPlaca = numeroPlaca;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	@Override
	public String isFecha(String fechaActualnue){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		Calendar fechaActual = Calendar.getInstance();
		
		Date date = formatter.parse(fechaActualnue);

		fechaActual.setTime(date);
		 

		String[] strDays = new String[]{
						"DOMINGO",
						"LUNES",
						"MARTES",
						"MIERCOLES",
						"JUEVES",
						"VIERNES",
						"SABADO"};

		return strDays[fechaActual.get(Calendar.DAY_OF_WEEK) - 1];
		
		 } catch (ParseException e) {
           e.printStackTrace();
       }
		return fechaActualnue;
	}
	
	@Override
	public String isDigito(String numeroPlaca){
		char ultimo = numeroPlaca.charAt(numeroPlaca.length()-1);
		String caracter = String.valueOf(ultimo);
		return caracter;
	}

	
	@Override
	public boolean isHora(Double horaPico){
		if (((horaPico>=7.00)&& (horaPico<=9.30))||((horaPico>=16.00)&&(horaPico<=19.30))){
			return true;
		}else{
			return false;
			
		}
	}
		
	
	public String getNumeroPlaca() {
		return numeroPlaca;
	}

	public void setNumeroPlaca(String numeroPlaca) {
		this.numeroPlaca = numeroPlaca;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
