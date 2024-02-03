import JAVIER10.Carro;

public class Main{
    public static void main(String[] args){
        //instancias de los objetos

        Carro carro1 = new Carro("Nissan","Skyline",1990,55000);
        Carro carro2 = new Carro("Mazda","CX-3", 2017, 60660 );
        Carro carro3 = new Carro("Nissan", "Frontier", 2023, 78780);
        //Mostrar los atributos del objeto
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(Carro.getNumCoche());

        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(Carro.getNumCoche());

        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(Carro.getNumCoche());

    }
}