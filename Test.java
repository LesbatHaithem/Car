public class Test {

    public static void main(String[] args) {
        Conducteur c = new Conducteur();
        Automobile a,b ;
       // R4 r4 = new R4();
       a= new R4();
       b= new BMW();
        
        c.demarrerVehicule(a);
        c.arreterVehicule(a );
        c.demarrerVehicule(b);     
        c.arreterVehicule(b );}
}