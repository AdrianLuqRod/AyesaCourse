package rectangulo;

public class Rectangulo {
    private Integer base, altura;

    public Rectangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer calcularPerimetro() {
        Integer perimetro = (base + altura) * 2;
        return perimetro;
    }

    public Integer calcularArea() {
        Integer area = base * altura;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo [base=" + base + ", altura=" + altura + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((base == null) ? 0 : base.hashCode());
        result = prime * result + ((altura == null) ? 0 : altura.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangulo other = (Rectangulo) obj;
        if (base == null) {
            if (other.base != null)
                return false;
        } else if (!base.equals(other.base))
            return false;
        if (altura == null) {
            if (other.altura != null)
                return false;
        } else if (!altura.equals(other.altura))
            return false;
        return true;
    }

    // ? El profesor lo hace aqui dentro de la misma clase el main por algun motivo,
    // queda feo. Muy feo de hecho.
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(2, 3);
        Rectangulo r2 = new Rectangulo(20, 30);
        Rectangulo r3 = new Rectangulo(200, 300);
        Rectangulo[] rectanglesList = { r1, r2, r3 };

        System.out.println(r1.calcularPerimetro() + "<-- Perimetro de r1");
        System.out.println(r1.calcularArea() + "<-- Area de r1");
        System.out.println(r2.calcularPerimetro() + "<-- Perimetro de r2");
        System.out.println(r2.calcularArea() + "<-- Area de r2");
        System.out.println(r3.calcularPerimetro() + "<-- Perimetro de r3");
        System.out.println(r3.calcularArea() + "<-- Area de r3");
        System.out.println("La mayor area es: " + comparaRectangulos(rectanglesList));
    }

    public static Integer comparaRectangulos(Rectangulo[] rectanglesList) {
        Integer mayorArea = 0;
        for (Rectangulo rectangulo : rectanglesList) {
            if (rectangulo.calcularArea() > mayorArea) {
                mayorArea = rectangulo.calcularArea();
            }
        }
        return mayorArea;
    }
}
