class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();

        List<Boolean> list = new ArrayList<>();

        for(int candy : candies){
            if(candy+extraCandies < max){
                list.add(false);
            }else{
                list.add(true);
            }
        }
        return list;
    }
}