import java.util.Scanner;

class Terreno {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    // Constructor
    public Terreno(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
        calcularArea();
        calcularCostoTerreno();
    }

    private void calcularArea() {
        this.area = ancho * largo;
    }

    private void calcularCostoTerreno() {
        this.costoTerreno = valorMetroCuadrado * area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea() {
        return area;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    // Método toString para imprimir los detalles del terreno
    
    public String toString() {
        return String.format("Ancho: %.2f m, Largo: %.2f m, Área: %.2f m^2, Valor por metro cuadrado: $%.2f, Costo del terreno: $%.2f",
                ancho, largo, area, valorMetroCuadrado, costoTerreno);
    }
}

class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Ingrese el ancho del terreno en metros:");
        double ancho = scanner.nextDouble();

        System.out.println("Ingrese el largo del terreno en metros:");
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el valor por metro cuadrado del terreno:");
        double valorMetroCuadrado = scanner.nextDouble();

       
        Terreno terreno = new Terreno(ancho, largo, valorMetroCuadrado);
        System.out.println("Detalles del terreno:");
        System.out.println(terreno);

    }
}
