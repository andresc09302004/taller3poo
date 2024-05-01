

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andres C
 */
class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    // Constructor que convierte horas a minutos, segundos y días
    public EquivalenteHora(int horas) {
        this.horas = horas;
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = (double) horas / 24;
    }


    public String toString() {
        return String.format("%d horas equivale a:\n%d minutos\n%d segundos\n%.2f días",
                horas, minutos, segundos, dias);
    }
}

class Ejecutor {
    public static void main(String[] args) {
         int horas = 48; // Ejemplo: 48 horas
        EquivalenteHora equivalente = new EquivalenteHora(horas);
        System.out.println(equivalente);
    }
}

