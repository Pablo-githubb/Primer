public class Dimarts20241203 {
    public static void main(String[] args) {

        noRetornoRes(' '); //crida pasant un char al metode
        char l = 'i', caracter = 'j';
        noRetornoRes(l);
        noRetornoRes(caracter);
    }

    public static char tornacaracter() {
        return ' ';
    }

    public static void noRetornoRes(char caracter) { //char es un parametre formal

        //Si el parametre es el espai en blanc sortim sense fer res
        if (caracter == ' ') return; //el return; funciona com un break;

        {
            int esticdinsdelbloc = 55;
            System.out.println(esticdinsdelbloc);
        }
    }

    class pasdeparametres {
        public static void main(String[] args) {
            boolean real = true;
            tincUnParametre(real);
            System.out.println(real ? "CERT" : "FALS");

            boolean[] realTipoBoolean = new boolean[]{true};
            tincUnParametre(realTipoBoolean);
            System.out.println(realTipoBoolean[0] ? "CERT" : "FALS"); // Corrected line
        }

        public static void tincUnParametre(boolean parametre) {
            parametre = !parametre; //canviem el valor del parametrede true a false o de false a true
        }

        public static void tincUnParametre(boolean[] parame) {
            if (parame == null || parame.length == 0) return; // Corrected line
            parame[0] = !parame[0]; //canviem el valor del parametrede true a false o de false a true
        }
    }

    class PasDeParametres2 {
        public static void main(String[] args) {
            for (int i = 0; i < 20; i++) { // Removed redefinition of 'i'
                System.out.println("Esten a l'execucio numero " + i);
                metodeNaive(i);
            }
        }

        private static void metodeNaive(int i) {
        }
    }
}