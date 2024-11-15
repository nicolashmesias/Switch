package logica;

public class Conversion implements Menu {
	private double km;
	private double millas;
	private double gC;
	private double gF;

	public Conversion() {
	}

	public Conversion(double km, double millas, double gC, double gF) {
		this.km = km;
		this.millas = millas;
		this.gC = gC;
		this.gF = gF;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getMillas() {
		return millas;
	}

	public void setMillas(double millas) {
		this.millas = millas;
	}

	public double getgC() {
		return gC;
	}

	public void setgC(double gC) {
		this.gC = gC;
	}

	public double getgF() {
		return gF;
	}

	public void setgF(double gF) {
		this.gF = gF;
	}
	public void kmMilla(){
		System.out.println("Se muertra la coonversion de kilometros a millas");
		this.millas= this.km*0.621371;
		System.out.println("Los kilometros a millas son: "+this.millas);
		
	}
	public void millaKm(){
		System.out.println("Se muertra la coonversion de kilometros a millas");
		this.km= this.millas*1.60934;
		System.out.println("Las millas a kilomtros son: "+this.km);

	}
	public void gcGf(){
		System.out.println("Se muertra la coonversion de Celsius a Fahrenheit");
		this.gF = (this.gC * 9/5) + 32;
		System.out.println("Los kilometros a millas son: "+this.gF);
		
		
	}
	public void gfGc(){
		System.out.println("Se muertra la coonversion de Fahrenheit a Celsius");
		this.gC = (this.gF - 32) * 5/9;
		System.out.println("Los kilometros a millas son: "+this.gC);
		
	}

	@Override
	public void menu() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}
