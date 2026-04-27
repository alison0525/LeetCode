class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        
        int output = timeSeries.length * duration;

        for(int i = 0; i<timeSeries.length-1; i++){
            int gap = timeSeries[i+1] - timeSeries[i];
            
            if(gap < duration){
                output-= duration - gap;
            }
        }
        return output;
    }
}