import java.util.LinkedList;
class Planning {
  
  //method for rainfall, consumes a linkedlist<double>
  double rainfall(LinkedList<Double> dailyRainfallReadings) {
    double sumNonNegative = 0;
    int numElt = 0;
    for (Double drr : dailyRainfallReadings) {
      if(drr == -999) {
        break;
      }
      else
        if (drr >= 0) {
        sumNonNegative += drr;
        numElt += 1;
      }
    }
    if (numElt == 0) {
      return -1;
    } else {
      return sumNonNegative;
    }
  }
  //method for maxTripleLength, consumes a linkedlist<String>
 Integer maxTripleLength2(LinkedList<String> listofstring){
   int finalAnswer = 0;
   int counter;
   int compareTo;
   
   for(counter = 2; counter < listofstring.size(); counter++){
     compareTo = (listofstring.get(counter) + listofstring.get(counter - 1) + listofstring.get(counter - 2)).length();
     if (compareTo > finalAnswer){
       finalAnswer = compareTo;
     }
   }
   return finalAnswer;
 }
}