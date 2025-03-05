package com.iesebrepablo.library20242024.myfirstlibrary;

public class RemplaçaMultiplesCaractersVersioLarg {
    /**
     * @param text
     * @param subst
     * @param buscat
     * @param buscats
     * @return
     */
    public static String reemplassaMultiplesCaractersVersioLlarga(String text, char subst, char buscat, char... buscats){
        //Tractem casos especials --> tractar sempre la condició null primer!!
        if(text==null || text.isEmpty()) return text;


        //Tractem el cas general
        String resultat="";
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);  //caràcter que tractem
            if(c==buscat) resultat+=subst;
            else {
                //Falta mirar si el caràcter actual és un dels buscats
                if(buscats!=null){
                    //Anem a buscar a c dins del vector buscats
                    int j=0;
                    for ( ; j<buscats.length && buscats[j]!=c ; j++);
                    if(j<buscats.length)    //caràcter actual trobat dins del vector
                        resultat+=subst;
                    else                    //caràcter no trobat disn del vector
                        resultat+=c;
                }else resultat+=c;
            }
//            resultat+=(c==buscat?subst:c);
        }
        return resultat;
    }
}
