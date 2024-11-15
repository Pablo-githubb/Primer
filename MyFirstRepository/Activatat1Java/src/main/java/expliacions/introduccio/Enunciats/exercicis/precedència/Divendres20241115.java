package expliacions.introduccio.Enunciats.exercicis.precedència;
import java.util.Scanner;
public class Divendres20241115 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nota = ent.nextInt();
        int comptE, comptN, comptB, comptS, comptI, comptMD, compt;
        compt = comptE=comptN=comptB=comptS=comptI=comptMD=compt = 0;
        int sumaNota = 0;
        float MITJANA;

        while (nota != -1.0F) {
            if(nota>=0.0F && nota<=10.0F) {
                compt++;
                sumaNota+=nota;
                if (nota < 9.0F) comptN++;
                else if (nota < 7.0F) comptB++;
                else if (nota < 6.0F) comptS++;
                else if (nota < 5.0F) comptI++;
                else if (nota <= 3.0F && nota >= 0.0F) comptMD++;
                else comptE++;
            }
            nota= ent.nextInt();
        }
        System.out.println("NOTES: "+compt+ " MITJANA: "+((float)sumaNota/compt)+ " E: "+comptE+ " N: "+comptN+ " B: "+comptB+" S: "+comptS+" I: "+comptI+" MD: "+comptMD);
    }
}

