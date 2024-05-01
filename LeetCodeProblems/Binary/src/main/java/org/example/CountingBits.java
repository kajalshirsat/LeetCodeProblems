package org.example;

public class CountingBits {

    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                ans[i]=ans[i/2]+1;
            }else{
                ans[i]=ans[i/2];
            }
        }
        return ans;

    }


    //My Solution
    /*public int[] countBits(int n) {
        int[] ans = null;
        if(n==0){
            ans = new int[]{0};
        }
        if(n==1){
            ans = new int[]{0,1};
        }
        if(n>1){
            ans = new int[n+1];
            ans[0] = 0;
            ans[1] = 1;
            int i=2;
            int p=0;
            int lim = 4;
            while(i<(n+1))
            {
                ans[i] = ans[p]+1;
                i++;
                p++;
                if(lim == i){
                    p=0;
                    lim = 2*lim;
                }

            }
        }
        return ans;
    }*/
}
