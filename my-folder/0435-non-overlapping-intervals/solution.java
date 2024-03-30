class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,Comparator.comparingInt(i->i[1]));
       // sort according to the end of the intervals
       
      int goal=0;
      int n=intervals.length;

      for(int i=1;i<n;i++){
        //check if they are overlapping if so make the end equal to the previous end then check if the next intervals still overalap then follow the same technique
        if(intervals[i][0]<intervals[i-1][1]){
            intervals[i][1]=intervals[i-1][1];
            goal++;
        }
      }

      return goal;
    }
}
