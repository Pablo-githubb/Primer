package com.iesebrepablo.library20242024.myfirstlibrary;

public class tractaparametres {
    public static int[] tractaParametres(int... params) {
        //Tractament de casos "especials"
        if (params == null) return null;
        if (params.length == 0) return null;

        //Tractament de vectors en caselles
        int suma, max, min;

        max = min = suma = params[0];     //tractem la primera casella
        //Recorrem el vector a partir de la segona casella
        for (int i = 1; i < params.length; i++) {
            //Actualitzem el màxim si cal
            if (params[i] > max) max = params[i];
            //Actualitzem el mínim si cal
            if (params[i] < min) min = params[i];
            //Sumen el valor de la casella actual
            suma += params[i];
        }

        return new int[]{suma, params.length, max, min};
    }
    public static String reemplassaMultiplesCaracters(String text, char subst, char buscat, char... buscats){
        //Tractem casos especials --> tractar sempre la condició null primer!!
        if(text==null || text.isEmpty()) return text;

        //Tractem el cas general
        String resultat="";
        String textBuscat=construixCadena(buscat, buscats);
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);  //caràcter que tractem
            resultat+=(  textBuscat.contains(construixCadena(c)) ? subst: c);
        }
        return resultat;
    }
    //Mètode que retorna una cadena formada pels caràcters que rep com a paràmetre i sense repetits
    public static String construixCadena(char buscat, char... buscats){
        String resultat=""+buscat;
        if(buscats!=null){
            for (int j=0 ; j<buscats.length ; j++)
                //Conactenem el caràcter actual només si no està contingut dins del resultat
                if(!resultat.contains(buscats[j]+"")) resultat+=buscats[j];
        }
        return resultat;
    }
}
