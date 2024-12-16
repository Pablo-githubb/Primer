public class Dilluns20241216 {
    public static void parametresVariables(boolean... params){
        for (int i = 0; i < params.length; i++) {
            if (params[i]) System.out.println("El paràmetre és cert");
            else System.out.println("fals");

        }

    }

    public static void main(String[] args) {
        parametresVariables();
        parametresVariables(true);

        parametresVariables(new boolean[]{true, false, false, true});
        parametresVariables(null);
    }
}
