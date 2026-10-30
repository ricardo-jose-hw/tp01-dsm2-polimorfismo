package atividade03.model;

public class Conversor {

	
	public double converter(double c) {
		
		if(c != 0) {
			return (c*1.8) + 32;
		}
		else {
			return 32.0;
		}
	}
		
		public double converter(int km) {
			
			return km * 0.62137;
		}
		
		public String converter(String conjunto) {
			return conjunto.toUpperCase();
		} 
	};

