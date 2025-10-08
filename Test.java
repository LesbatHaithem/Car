public class Test {

    public static void main(String[] args) {
        Conducteur conducteur = new Conducteur();
        R4 r4 = new R4();
        
        conducteur.demarrerVehicule(r4);
        conducteur.arreterVehicule(r4);
    }
}