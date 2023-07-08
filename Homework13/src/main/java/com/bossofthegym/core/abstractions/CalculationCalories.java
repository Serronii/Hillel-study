package com.bossofthegym.core.abstractions;

public interface CalculationCalories {

  int calculateCalories(int weight);

  default int indexCommon(int weight){
    return (int) (weight/200 * 115 *3.5);

  }

}
