class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res=0;
        for(int i=0;i<students.length;i++)
            res=res+Math.abs(seats[i]-students[i]);
        
        return res;
    }
}
