class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] a=Arrays.copyOfRange(candies,0,candies.length);
        Arrays.sort(a);
        int max=a[candies.length-1];
        List<Boolean> L=new ArrayList<>();
        for(int i:candies)
        {
            if(i+extraCandies>=max)
                L.add(true);
            else
                L.add(false);
        }
        return L;
    }
}

