/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GCcalculator;

/**
 * Functie: De functie is dat er geteld kan worden hoe vaak de nucleotide voorkomt in het bestand. 
 * @author Pinar Kubra Kumurvu
 * @version 1.0
 * Datum: 1-11-2018

 */
public class Berekening {

    static final char[] A = {'A'};
    static final char[] C = {'C'};
    static final char[] G = {'G'};
    static final char[] T = {'T'};
    public int TotaalLengte;
    
    // Dit zijn letters dat geen nucleotides zijn. 
    static final char[] GeenNucleotide = {'B', 'D', 'E', 'F', 'H', 'I', 'J', 'K', 'L', 'M','O', 'P', 'Q', 'R', 'S', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    /**
     *
     * @param symbol
     * @return a (Voorkoming van A in de seq)
     * @throws NotANucl
     */
    public static int A (String symbol) throws NotANucl {
    int a = 0;
    for (char e : symbol.toCharArray()) {
        for (char f : A) {
            if (e == f){
                a++;
            }
        }
}
    return a;
}

    /**
     *
     * @param symbol
     * @return c (Voorkoming van C in de seq)
     * @throws NotANucl
     */
    public static int C (String symbol) throws NotANucl {
    int c = 0;
    for (char g : symbol.toCharArray()) {
        for (char i : C) {
            if (g == i){
                c++;
            }
        }
}
    return c;
}

    /**
     *
     * @param symbol
     * @return g (Voorkoming van G in de seq)
     * @throws NotANucl
     */
    public static int G (String symbol) throws NotANucl {
    int g = 0;
    for (char k : symbol.toCharArray()) {
        for (char l : G) {
            if (k == l){
                g++;
            }
        }
}
    return g;
}

    /**
     *
     * @param symbol
     * @return t (Voorkoming van T in de seq)
     * @throws NotANucl
     */
    public static int T (String symbol) throws NotANucl {
    int t = 0;
    for (char x : symbol.toCharArray()) {
        for (char y : T) {
            if (x == y){
                t++;
            }
        }
}
    return t;
}





    public int getTotaalLengte() {
        return TotaalLengte;
}
}

class NotANucl extends Exception {

/**
* Het overschrijven v.d. constructor van Exception
*/
  public NotANucl() {
    super();
  }

  public NotANucl(String err) {
    super(err);
  }
    }
