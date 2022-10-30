import java.util.*;

class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        int max = 0;
        Map<String, Integer> map = new TreeMap<>();
        Map<String, String> mapOfMaxID = new HashMap<>();
        Map<String, Integer> mapOfMax = new HashMap<>();
        int nc = creators.length;
        for (int i = 0; i < nc; i++) {
            String c = creators[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + views[i]);
                if (views[i] > mapOfMax.get(c)) {
                    mapOfMax.put(c, views[i]);
                    mapOfMaxID.put(c, ids[i]);
                } else if (views[i] == mapOfMax.get(c)) {
                    if (ids[i].compareTo(mapOfMaxID.get(c)) < 0) {
                        mapOfMaxID.put(c, ids[i]);
                    }
                }
            } else {
                map.put(c, views[i]);
                mapOfMaxID.put(c, ids[i]);
                mapOfMax.put(c, views[i]);
            }
            max = Math.max(max, map.get(c));
        }
        List<List<String>> ans = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                ans.add(List.of(s, mapOfMaxID.get(s)));
            }
        }
        return ans;

    }
}