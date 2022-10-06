class TimeMap {
    Map<String,TreeMap<Integer,String>> map = new HashMap<>();
    public TimeMap() {
        this.map = map;
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp,value);
            
        }
        else{
            TreeMap<Integer,String> temp = new TreeMap<>();
            temp.put(timestamp,value);
            map.put(key,temp);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            if(map.get(key).containsKey(timestamp)){
                return map.get(key).get(timestamp);
            }
            Integer res = map.get(key).floorKey(timestamp);
            if(res!=null)
                return map.get(key).get(res);
            return "";

        }
        else{
            return "";
        }
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */