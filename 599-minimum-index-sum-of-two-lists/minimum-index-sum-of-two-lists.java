class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            hm.put(list1[i],i);
        }
        ArrayList<String> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(hm.containsKey(list2[i])){
                int sum = hm.get(list2[i])+i ;
                if(sum<min){
                    ans.clear();
                    ans.add(list2[i]);
                    min = sum;
                }
                else if(sum == min){
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}