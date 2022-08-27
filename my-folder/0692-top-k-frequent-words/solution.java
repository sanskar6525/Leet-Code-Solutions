class Solution {
public List<String> topKFrequent(String[] words, int k) {
    Map<String,Integer> map=new HashMap<>();
    for(String x: words)
        map.put(x,map.getOrDefault(x,0)+1);
    PriorityQueue<Map.Entry<String,Integer>> maxHeap=new PriorityQueue<>((a,b)->a.getValue()==b.getValue() ? a.getKey().compareTo(b.getKey()) :b.getValue()-a.getValue());
    for(Map.Entry<String,Integer> smap:map.entrySet())
    {
        maxHeap.add(smap);
    }
    ArrayList<String>list=new ArrayList<>();
    while(k-->0)
    {
        Map.Entry<String,Integer> smap=maxHeap.poll();
        list.add(smap.getKey());
    }
    return list;
}
}
