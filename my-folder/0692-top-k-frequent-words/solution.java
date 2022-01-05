class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      Map<String, Integer> freqMap = new HashMap<>();
      
      for (String word : words) {
        if (!freqMap.containsKey(word)) {
          freqMap.put(word, 0);
        }
        
        freqMap.put(word, freqMap.get(word) + 1);
      }
      
      PriorityQueue<String> pq = new PriorityQueue<>((String s1, String s2) -> {
        if (freqMap.get(s1).equals(freqMap.get(s2))) {
          return s2.compareTo(s1);
        }
        
        return freqMap.get(s1) - freqMap.get(s2);
      });
      
      for (String key : freqMap.keySet()) {
        pq.offer(key);
        
        if (pq.size() > k) {
          pq.poll();
        }
      }
      
      List<String> list = new ArrayList<>();
      while (!pq.isEmpty()) {
        list.add(pq.poll());
      }
      
      Collections.reverse(list);
      
      return list;
    }
}
