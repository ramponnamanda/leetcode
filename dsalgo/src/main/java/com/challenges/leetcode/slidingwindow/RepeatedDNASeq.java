package com.challenges.leetcode.slidingwindow;

class RepeatedDNASeq {

    /**
     * Sliding a window of length 10 over the string and
     * map to keep track of counts, how many times a string is repeated.
     * @param s
     * @return
     */
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(int i = 10; i <= s.length(); i++) {
            String seq = s.substring(i - 10, i);
            int count = map.getOrDefault(seq, 0);
            map.put(seq, ++count);
            if(count == 2) 
                res.add(seq);
        }
        return res;
    }
}