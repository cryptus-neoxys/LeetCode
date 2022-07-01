class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int maxU = 0;
        int curr = 0;
        
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        
        for(int i=0;i<boxTypes.length;i++){
            if(curr + boxTypes[i][0] <=truckSize){
                curr = curr + boxTypes[i][0];
                maxU = maxU + boxTypes[i][0]*boxTypes[i][1];
            }else {
                int diff = truckSize - curr;
                curr = curr + diff;
                maxU = maxU + diff * boxTypes[i][1];
                break;
            }
        }
        return maxU;

    }
}