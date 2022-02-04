package entidades;

public class Retangulo {
    private double base;
    private double altura;

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

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return (base * 2) + (altura * 2);
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(base, 2)) + (Math.pow(altura, 2)));
    }
}
