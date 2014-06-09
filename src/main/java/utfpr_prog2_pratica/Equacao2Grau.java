/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr_prog2_pratica;

/**
 *
 * @author a1013343
 * @param <T>
 */
public class Equacao2Grau < T extends Number & Comparable<T> > {
    private T a;
    private T b;
    private T c;
    
    public Equacao2Grau (T a, T b, T c) {
        if (a.doubleValue()==0) {
            throw new Azero(); }
        this.a=a;
        this.b=b;
        this.c=c; }
    
    
    
}
