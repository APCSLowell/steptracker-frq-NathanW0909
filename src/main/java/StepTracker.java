import java.util.ArrayList;
public class StepTracker
{
private ArrayList <Integer> steps; 
 private int minSteps;

 
 public StepTracker(int a){
  steps = new ArrayList <Integer>();
  minSteps = a;

 }
 public void addDailySteps(int step){
  steps.add(step);

  
 }
 public double averageSteps(){
  double b = 0;
  for(int i : steps){
   b += i;
  }
  if(b == 0){
   return b;
  }
  return (double)b/steps.size();

 }
 public int activeDays(){
  int c = 0;
  for(int i : steps){
   if(i >= minSteps){
    c++;
   }
  }
  return c;
  // return activeDays;
 }
} 
