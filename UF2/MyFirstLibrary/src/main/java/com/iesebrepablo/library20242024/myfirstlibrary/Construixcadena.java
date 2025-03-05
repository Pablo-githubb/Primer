package com.iesebrepablo.library20242024.myfirstlibrary;

public class Construixcadena {
    /**
     * @param buscat
     * @param buscats
     * @return
     */
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
