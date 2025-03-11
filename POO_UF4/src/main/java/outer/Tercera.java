package outer;

import org.example.AlumnePublic;

public class Tercera {
    public static void main(String []args){
        AlumnePublic a=new AlumnePublic();
        //dni és protected i només podem accedir desde classes del mateix paquet on es troba AlumnePublic
       // System.out.println(a.dni);

    }
}
