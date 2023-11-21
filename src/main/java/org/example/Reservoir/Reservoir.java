package org.example.Reservoir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservoir {
    
    Integer widthOfLand;
    Integer heightOfLand;
    Integer[] landMap;
    Integer[] landMapAfterRain;
    Integer waterCapacity;
    
    public Reservoir(Integer widthOfLand, Integer heightOfLand) {
        this.widthOfLand = widthOfLand;
        this.heightOfLand = heightOfLand;
        this.landMap = generateLand();
        this.landMapAfterRain = Arrays.copyOf(this.landMap, this.landMap.length);
        this.waterCapacity = calculateWaterCapacity();
    }
    
    private Integer[] generateLand() {
        Random rnd = new Random();
        Integer[] map = new Integer[this.widthOfLand];
        
        for (int i = 0; i < this.widthOfLand; i++) {
            map[i] = rnd.nextInt(0,heightOfLand + 1);
        }
        return map;
    }
    
    private Integer calculateWaterCapacity() {
        Integer waterCapacity = 0;
        
        for (int i = 1; i < this.landMapAfterRain.length-1; i++) {
            Integer observedLandHeight = this.landMapAfterRain[i];
            Integer previousTallestsHeight = -1;
            Integer upcomingTallestsHeight = -1;
            
            //look for a previous tallest column
            for (int j = 0; j <= i-1; j++) {
                Integer currentHeight = this.landMapAfterRain[j];
                if (observedLandHeight < currentHeight && previousTallestsHeight < currentHeight) {
                    previousTallestsHeight = currentHeight;
                }
            }
            
            //look for an upcoming tallest column
            for (int j = i+1; j < this.landMapAfterRain.length; j++) {
                Integer currentHeight = this.landMapAfterRain[j];
                if (observedLandHeight < currentHeight && upcomingTallestsHeight < currentHeight) {
                    upcomingTallestsHeight = currentHeight;
                }
            }
            
            Integer currentWaterAmount = Math.min(previousTallestsHeight, upcomingTallestsHeight) - observedLandHeight;
            
            if (currentWaterAmount > 0) {
                waterCapacity += currentWaterAmount;
                this.landMapAfterRain[i] += currentWaterAmount;
            }
        }
        return waterCapacity;
    }
    
    private List<Integer> indexListGenerator() {
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < this.widthOfLand; i++) {
            returnList.add(i);
        }
        return returnList;
    }
    
    public void printDetails() {
        System.out.println("The length of the land is " + this.widthOfLand + ".");
        System.out.println("The height of each land is " + this.heightOfLand + ".");
        
        System.out.println("The landmap before rain.");
        for (int i = 0; i < this.landMap.length; i++) {
            Integer currentSize = this.landMap[i];
            System.out.print(currentSize);
            if (i < this.landMap.length-1) {
                System.out.print(" ");
            } else {
                System.out.println(" ");
            }
        }
        System.out.println("The landmap after rain.");
        for (int i = 0; i < this.landMapAfterRain.length; i++) {
            Integer currentSize = this.landMapAfterRain[i];
            System.out.print(currentSize);
            if (i < this.landMapAfterRain.length-1) {
                System.out.print(" ");
            } else {
                System.out.println(" ");
            }
        }
        
        System.out.println("The water capacity of the land is " + waterCapacity + ".");
    }
    
    
    
    
    
}
