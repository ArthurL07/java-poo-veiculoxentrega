package model;

public class AppEntregaVeiculo {
    public static void main(String[] args){

        Caminhao c1 = new Caminhao("Truck", 3.000,3, true);
        Motocicleta m1 = new Motocicleta("XRE",20,300,true);

        System.out.println(c1);
        System.out.println(m1);

        Entrega ent1 = new Entrega("Apalheros Domesticos");
        System.out.println(ent1);

        System.out.println("\nAlocar Caminhão...");
        ent1.alocarVeiculo(c1);
        System.out.println(ent1);


        Entrega ent2 = new Entrega("Fast Food");
        System.out.println(ent2);


        ent2.alocarVeiculo(m1);
        System.out.println(ent2);


    }
}
