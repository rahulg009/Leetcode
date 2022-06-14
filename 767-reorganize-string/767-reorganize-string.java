class Pair implements Comparable<Pair>{
    char x;
    int freq;
    public Pair(char x,int freq){
        this.x=x;
        this.freq=freq;
    }
    public int compareTo(Pair p){
        return p.freq-this.freq;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(char x:s.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(char x:map.keySet()){
            pq.offer(new Pair(x,map.get(x)));
        }
        StringBuilder sb=new StringBuilder();
        Pair p=pq.poll();
        sb.append(p.x);
        p.freq--;
        while(!pq.isEmpty()){
            Pair temp=pq.poll();
            sb.append(temp.x);
            temp.freq--;
            if(p.freq>0){
                pq.offer(p);
            }
            p=temp;
        }
        return sb.toString().length()==s.length()?sb.toString():"";
    }
}