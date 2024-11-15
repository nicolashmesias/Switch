package logica;

public class Area implements Menu  {
	private double radio;
	private double base;
	private double altura;
	private double lado;
	private double area;

	public Area() {
	}

	public Area(double radio, double base, double altura, double lado, double area) {
		this.radio = radio;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
		this.area = area;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public void circulo(){
		System.out.println("Acontinuacion se muestra al area del circulo");
		double pi=3.1415;
		this.area= pi *(this.radio*this.radio);
		System.out.println("El area es: "+this.area);	
	}
	public void triangulo(){
		System.out.println("Acontinuacion se muestra al area del triangulo");
		this.area= this.base*this.altura*(0.5);
		System.out.println("El area es: "+this.area);	
		
	}
	public void cuadrado(){
		System.out.println("Acontinuacion se muestra al area del cuadrado");
		this.area= this.lado*this.lado;
		System.out.println("El area es: "+this.area);	
		
	}

	@Override
	public void menu() {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
	
	
	
	
	
}
