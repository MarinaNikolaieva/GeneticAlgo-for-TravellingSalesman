/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GTSPack;

/**
 *
 * @author Marina Nik
 */
public class PairClass {
    private int ID;
    private double value;
    
    public PairClass(int i, double v){
        ID = i;
        value = v;
    }
    
    public int getID(){
        return ID;
    }
    
    public double getVal(){
        return value;
    }
}
