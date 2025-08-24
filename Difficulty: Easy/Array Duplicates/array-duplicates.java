class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> Hashset= new HashSet<>(); // creating hashset
        ArrayList<Integer> List = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            //int num= arr[i];
            if(Hashset.contains(arr[i])){
                List.add(arr[i]);
            }else{
                Hashset.add(arr[i]);
            }
        }
        return List;
    }
}