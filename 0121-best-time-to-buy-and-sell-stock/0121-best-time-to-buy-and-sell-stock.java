class Solution {
    public int maxProfit(int[] pr) {
        int minPr=pr[0]; 
        int maxPro=0;     
        for (int i=1;i<pr.length;i++) {
            if (pr[i]>minPr) {
                int dif=pr[i]-minPr;
                maxPro=Math.max(maxPro,dif);
            } else {
                minPr=pr[i];
            }
        }
        return maxPro;
    }
}
