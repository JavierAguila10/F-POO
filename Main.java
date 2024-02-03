
import Javier1000.Temperatura;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Objeto 1
        Temperatura temperatura = new Temperatura();
        // Usar el setter para establecer la temperatura en grados Celsius
        temperatura.setCelsius(25.0);
        // Objeto 2
        Temperatura temperatura2 = new Temperatura();
        // Usar el setter para establecer la temperatura en grados Celsius
        temperatura2.setCelsius(32.22);
        // Usar el getter para obtener la temperatura en grados Celsius para el primer objeto
        double temperaturaCelsius1 = temperatura.getCelsius();
        System.out.println("Temperatura en Celsius (Objeto 1): " +
                temperaturaCelsius1);
        // Usar el método para convertir de Celsius a Fahrenheit para el primer objeto
        double temperaturaFahrenheit1 = temperatura.celsiusToFahrenheit();
        System.out.println("Temperatura en Fahrenheit (Objeto 1): " +
                temperaturaFahrenheit1);
        // Usar el getter para obtener la temperatura en grados Celsius para el segundo objeto
        double temperaturaCelsius2 = temperatura2.getCelsius();
        System.out.println("Temperatura en Celsius (Objeto 2): " +
                temperaturaCelsius2);
        // Usar el método para convertir de Celsius a Fahrenheit para el segundo objeto
        double temperaturaFahrenheit2 = temperatura2.celsiusToFahrenheit();
        System.out.println("Temperatura en Fahrenheit (Objeto 2): " +
                temperaturaFahrenheit2);

    }
}