public class exe29 {
    public static int mcd(int a, int b){
        //cas de parada

        if (a==b) return a;

        //casos recursius

        if(a<b) return mcd(a,b-a);
        else return mcd(a-b,b);
    }


    public static void main(String[] args) {
        System.out.println(mcd(140, 35));
    }
}
