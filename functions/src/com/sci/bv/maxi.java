package com.sci.bv;
//


public class maxi {


    public static int getMax(int primulNumar,int alDoileaNumar) {
            if(primulNumar>=alDoileaNumar){
                return primulNumar;
            } else {
                return alDoileaNumar;
            }
        }

    public static int getMax2 (int primulNumar,int alDoileaNumar,int alTreileaNumar) {
        int max = getMax(primulNumar,alDoileaNumar);
        if(max>=alTreileaNumar){
            return max;
        } else {
            return alTreileaNumar;}

    }



}
