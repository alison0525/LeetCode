class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;

        if (n == 0) return true;

        for(int i=0; i<flowerbed.length; i++){
            boolean left = (i == 0 || flowerbed[i-1] == 0);
            boolean right = (i == flowerbed.length-1 || flowerbed[i+1] == 0);

            if(flowerbed[i]==0 && left && right){
                cnt++;
                flowerbed[i] = 1;
                if(cnt == n) return true;
            } 
        }

        return false;
    }
}