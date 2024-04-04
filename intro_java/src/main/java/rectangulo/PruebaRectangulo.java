package rectangulo;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 3);
        Rectangulo r2 = new Rectangulo(20, 30);

        System.out.println(r1.calcularPerimetro() + "<-- Perimetro de r1");
        System.out.println(r1.calcularArea() + "<-- Area de r1");
        System.out.println(r2.calcularPerimetro() + "<-- Perimetro de r2");
        System.out.println(r2.calcularArea() + "<-- Area de r2");
    }
}
