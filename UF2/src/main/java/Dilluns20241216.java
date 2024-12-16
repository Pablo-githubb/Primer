public class Dilluns20241216 {
    public static void parametresVariables(boolean... params) {
        // Primer que res mirem si parms és null
        if (params == null) return;
        for (int i = 0; i < params.length; i++) {
            if (params[i]) System.out.println("El paràmetre és cert");
            else System.out.println("fals");

        }

    }

    public static int paramVarsRetornEnter(double... args) {
        if (args==null) return -1;

        return args.length;
    }

    private static void metodeQueNoFaRes (){

    }

    public static void main(String[] args) {
        boolean[] objecte = null;

        //parametresVariables();
        //parametresVariables(true);
        //parametresVariables(new boolean[]{true, false, false, true});
        //parametresVariables(null);

        //objecte=metodeQueNoFaRes();
        //parametresVariables(objecte);

        paramVarsRetornEnter(20);
    }





    class Segona{
        public static boolean barreja(int param1, int... params){
         return true;
        }

        public static void main(String[] args) {
            barreja(1);
            barreja(1,2,3,4);
            barreja(23,null);
        }
    }
}
