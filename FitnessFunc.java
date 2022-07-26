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
import java.util.ArrayList;

public class FitnessFunc {
    private ArrayList<CityGene> route;
    private double fitnessRate;
    private double distance;
    
    public FitnessFunc(ArrayList<CityGene> r){
        route = new ArrayList<>();
        route.addAll(r);
        fitnessRate = 0.0;
        distance = 0.0;
    }
    
    public double getDistance(){
        if (distance == 0.0){
            double partDist = 0.0;
            for (int i = 0; i < route.size(); i++){
                CityGene cityFrom = route.get(i);
                CityGene cityTo = null;
                if (i + 1 < route.size())
                    cityTo = route.get(i + 1);
                else
                    cityTo = route.get(0);
                partDist += cityFrom.distance(cityTo);
            }
            distance = partDist;
        }
        return distance;
    }
    
    public double getFitness(){
        if (fitnessRate == 0.0)
            fitnessRate = 1 / getDistance();
        return fitnessRate;
    }
}
