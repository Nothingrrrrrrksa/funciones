
    public class Main2 {
        public static void main(String[] args) {
            coche miCoche = new coche();
            miCoche.AumentarPuertas();
        
            System.out.print(miCoche.NumeroPuertas);
        }
    
    public static int suma(int a, int b) {
        return a + b;

    }
    }
    class coche {
        public int NumeroPuertas = 0;
    
        public void AumentarPuertas(){
            this.NumeroPuertas++;
        }
    }

