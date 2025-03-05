package com.iesebrepablo.library20242024.myfirstlibrary;

public class omplevectors {
    /**
     * @param params
     * @return
     */
    public static float[] ompleVectorFloats(float... params) {
        if (params == null || params.length == 0) return null;
        float[] resultat=new float[params.length];
       for (int i = 0; i < params.length; i++) {
           resultat[i]=params[i];
      }

       return resultat;
    }
}
