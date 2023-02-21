package test;

public class Asiento {
	
	public String color;
	public int precio;
	public int registro;
	
	public Asiento(String color, int precio, int registro) {
		
		this.color = color;
		this.precio = precio;
		this.registro = registro;
	}
	
	public void cambiarColor(String color) {
		
		if(color.equalsIgnoreCase("amarillo") ||
		   color.equalsIgnoreCase("rojo")     ||
		   color.equalsIgnoreCase("verde")    ||
		   color.equalsIgnoreCase("negro")    ||
		   color.equalsIgnoreCase("blanco")
		   		) {
			
			this.color = color;
		}
	}

}
