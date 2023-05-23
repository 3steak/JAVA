package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

   /** affiche la température moyenne à partir des valeurs fournies comme arguments en ligne de commande
   *
   * @param args liste de températures séparées par des espaces
   */
   public static void main(String[] args) {

      List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<Integer>();

      // remplissez la liste à partir des valeurs fournies comme arguments en ligne de commande
      for (String stringRepresentationOfTemperature : args) {
         int temperature = Integer.parseInt(stringRepresentationOfTemperature);
         recordedTemperaturesInDegreesCelcius.add(temperature);
      }

      // calculez et affichez la température moyenne
      Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
      System.out.println("The average temperature is " + averageTemperature);
   }

}