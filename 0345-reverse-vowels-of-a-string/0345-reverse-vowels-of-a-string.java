class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length()-1;
        String vowels = "aeiouAEIOU";

        char[] arr = s.toCharArray();

        while(left<right){
            while(left < right && vowels.indexOf(arr[left]) == -1) left++;
            while(left < right && vowels.indexOf(arr[right]) == -1) right--;

            if(left < right){
                char tmp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = tmp;
            }
        }

        return new String(arr);
    }
}