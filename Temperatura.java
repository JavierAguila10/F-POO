package Javier1000;

public class Temperatura {
    // Atributo para almacenar la temperatura en grados Celsius
    private double celsius;
    // Métodos
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    // Método para convertir de Celsius a Fahrenheit
    public double celsiusToFahrenheit() {
        return (1.8 * celsius) + 32;
    }
    // Método para convertir de Fahrenheit a Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}