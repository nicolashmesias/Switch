package logica;

public class Calculadora implements Menu {
	private double num1;
	private double num2;
        private double resultado;
	
	public Calculadora() {
	}

	public Calculadora(double num1, double num2, double resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
	//*******************************************************
	public void suma(){
		System.out.println("Se muestra la suma");
		this.resultado=this.num1+this.num2;
		System.out.println("El resultado de suma es: "+this.resultado);
	}
	public void resta(){
		System.out.println("Se muestra la resta");
		this.resultado=this.num1-this.num2;
		System.out.println("El resultado de resta es: "+this.resultado);
		
	}
	public void multiplicacion(){
		System.out.println("Se muestra la multiplicacion");
		this.resultado=this.num1*this.num2;
		System.out.println("El resultado de multiplicacion es: "+this.resultado);
			
	}
	public void division(){
		System.out.println("Se muertra la division");
		this.resultado=this.num1/this.num2;
		System.out.println("El resultado de la division es: "+this.resultado);
		
	}

	@Override
	public void menu() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	
}
