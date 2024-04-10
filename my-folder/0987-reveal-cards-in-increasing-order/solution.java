class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int n=deck.length;
        int[] res=new int[n];
        Deque<Integer> d=new LinkedList<>();

        for(int i=0;i<n;i++)
            d.add(i);

        for(int card:deck)
        {
            int idx=d.poll();
            res[idx]=card;
            if(!d.isEmpty())
            {
                int id=d.poll();
                d.addLast(id);
            }
        }
        return res;
        
    }
}
