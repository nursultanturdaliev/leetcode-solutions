class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> nums1Hash = mapToHash(nums1);
        Map<Integer, Integer> nums2Hash = mapToHash(nums2);
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        nums1Hash.forEach((key, val) -> {
            if(nums2Hash.containsKey(key)) {
                int temp = nums2Hash.get(key);
                int min = temp< val? temp: val;
                
                while(min > 0){
                    result.add(key);
                    min--;
                }
                
            }
        });
        
        return convertIntegers(result);
    }
    
    private Map<Integer, Integer> mapToHash(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);   
            } else {
                map.put(num, 1);
            }
        }
        
        return map;
    }
    
    public int[] convertIntegers(List<Integer> integers)
    {
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
