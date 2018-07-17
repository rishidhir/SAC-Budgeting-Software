/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalassessment;
/**
 *
 * @author rishidhir
 */
public class SAC {
    
   private Club listClub[] = new Club[150];
   private double  initialAmt;
   private double currentAmt;
   private int count;
 
public SAC (double initialAmt) {
    this.initialAmt = initialAmt;
    currentAmt = initialAmt;
    count = 0;
    }

public double getInitialAmt(){
    return initialAmt;
    }

public double getCurrentAmt() {
    return currentAmt;
    }

public void changeCurrentAmt(double c) {
    currentAmt = currentAmt - c; 
    }   

public void addCurrentAmt(double c) {
    currentAmt = currentAmt + c;
    }

public void sortClub() {
    int compare;
    Club temp;
        for(int i=0; i < count; i++){ 
               for(int j=1; j < (count-i); j++){  
                   compare = listClub[j-1].getName().compareTo(listClub[j].getName());
                          if(compare > 0){  
                                 //swap elements  
                                 temp = listClub[j-1];  
                                 listClub[j-1] = listClub[j];  
                                 listClub[j] = temp;  
                }  
            }
        }
    }

public void addClub(Club x) {
    listClub[count] = x;  
    count = count+1;
    }

public int getCount() {
    return count; 
    }

public Club [] getClub() {
    return listClub; 
    }
    
public void changeClub(Club c, int num)  {
    listClub[num] = c;   
    }

public void deleteClub(int n) {
    String money = listClub[n-1].getMoney();
    double money2 = Double.parseDouble(money);
    currentAmt = currentAmt + money2;
    int target = n-1;
    for (int y = target; y <count -1; y++) {
        listClub[y] = listClub[y+1];
    }
    count = count-1;
    }
}