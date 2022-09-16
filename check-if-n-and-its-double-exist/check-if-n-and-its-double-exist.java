class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> h=new HashSet<>();
        for(int i: arr){
            if(h.contains(2 * i) || i % 2 == 0 && h.contains(i / 2))
                return true;
            h.add(i);
        }
        return false;
    }
}