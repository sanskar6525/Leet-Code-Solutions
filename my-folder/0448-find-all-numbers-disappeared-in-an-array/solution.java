class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<Integer>();
        
        while(i<nums.length){
            int correct=nums[i]-1;
            if(correct!=nums.length){
               if(nums[i]==nums[correct]){
                i++;
                }
                else{
                    swap(nums,i,correct);
                }
            }
            else{
                i++;
            }
            
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                list.add(i+1);
        }
        return list;
    }
     public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
