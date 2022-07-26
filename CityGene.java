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
public class CityGene {
    private int ID;
    private int x;
    private int y;
    
    public CityGene(int i, int X, int Y){
        ID = i;
        x = X;
        y = Y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getID(){
        return ID;
    }
    
    public double distance(CityGene g){
        //We'll calculate that with Pythagorean theorem
        int xDiff = Math.abs(this.x - g.getX());
        int yDiff = Math.abs(this.y - g.getY());
        return Math.sqrt(xDiff ^ 2 + yDiff ^ 2);
    }
    
    @Override
    public boolean equals(Object a){
        if (!(a instanceof CityGene)) return false;
        
        CityGene b = (CityGene)a;
        if (this.x == b.getX() && this.y == b.getY())
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.x;
        hash = 19 * hash + this.y;
        return hash;
    }
}
