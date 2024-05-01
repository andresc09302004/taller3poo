
/**
 *
 * @author Andres C
 */
class EquipoCelular {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMAC;
    private String imei;

    public EquipoCelular(String sistemaOperativo, double tamañoPantalla, double costoInicial, double ivaPorcentaje,
                         String direccionMAC, String imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMAC = direccionMAC;
        this.imei = imei;
        calcularIvaCostoInicial();
        calcularCostoFinal();
    }

    private void calcularIvaCostoInicial() {
        this.ivaCostoInicial = costoInicial * (ivaPorcentaje / 100);
    }

    private void calcularCostoFinal() {
        this.costoFinal = costoInicial + ivaCostoInicial;
    }

    public String toString() {
        return String.format("Sistema Operativo: %s\nTamaño de Pantalla: %.2f pulgadas\nCosto Inicial: $%.2f\nIVA (%.2f%%): $%.2f\nCosto Final: $%.2f\nDirección MAC: %s\nIMEI: %s",
                sistemaOperativo, tamañoPantalla, costoInicial, ivaPorcentaje, ivaCostoInicial, costoFinal, direccionMAC, imei);
    }
}

class Controlador {
    public static void main(String[] args) {
        
        EquipoCelular equipoCelular = new EquipoCelular("Android", 6.5, 300, 12, "A1:B2:C3:D4:E5", "123456789");

        System.out.println("Información del Equipo Celular:");
        System.out.println(equipoCelular);
    }
}

