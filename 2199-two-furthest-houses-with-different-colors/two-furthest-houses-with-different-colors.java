class Solution {
    public int maxDistance(int[] colors) {
        int st=0;
        int en=colors.length-1;
        int maxDistanceS=0;
        int maxDistanceE=0;
        while(st<=en){
            if(colors[st]==colors[en]){
                en--;
            }
            else{
                maxDistanceS=en-st;
                break;
            }
        }
        int st1=0;
        int en1=colors.length-1;
        while(st1<=en1){
            if(colors[st1]==colors[en1]){
                st1++;
            }
            else{
                maxDistanceE=en1-st1;
                break;
            }
        }
        
        return Math.max(maxDistanceS,maxDistanceE);
    }
}