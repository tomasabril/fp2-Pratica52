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
    
    public Equacao2Grau (T a, T b, T c) throws Azero {
        if (a.doubleValue()==0) {
            throw new Azero(); }
        this.a=a;
        this.b=b;
        this.c=c; }
    
    public T getA() {
        return a; }
    public T getB() {
        return b; }
    public T getC() {
        return c; }
    
    public void setA(T a) {
        this.a = a; }
    public void setB(T b) {
        this.b = b; }
    public void setC(T c) {
        this.c = c; }
    
    public double getRaiz1() throws DeltaN {
        if ( Math.pow(b.doubleValue(),2)-4*a.doubleValue()*c.doubleValue() < 0 ) {
            throw new DeltaN(); }
        return (-b.doubleValue()+(Math.pow(b.doubleValue(),2)-4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue()); }

    public double getRaiz2() throws DeltaN {
        if ( Math.pow(b.doubleValue(),2)-4*a.doubleValue()*c.doubleValue() < 0 ) {
            throw new DeltaN(); }
        return (-b.doubleValue()-(Math.pow(b.doubleValue(),2)-4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue()); }


}
