/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Knapsack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author astech1012
 */
public class gKnapsack {
    String ans = "";
    int knapCap;
    Random rand = new Random();
    String itemValS="", itemKgS="", inNumS="";
    private void knapInit(){
        //generates 5 items and their values
        
    }
   public void knapsack() {
        
       int itemVal[], itemKg[];
        itemVal = new int[5];
        itemKg = new int[5];
        
        for(int i = 1; i <= 4; i++){
            itemKg[i] = rand.nextInt(4)+1;
            itemKgS += itemKg[i] + "\n";
            itemVal[i] = rand.nextInt(4)+1;
            itemValS += itemVal[i] + "\n";         
        }
        knapCap = rand.nextInt(4)+1;
        
        //knapsack
        int n,W,B[][];
        W = knapCap;
        n = itemVal.length - 1;
        B = new int[n+1][W+1];
        //i = K.length;
        for(int w = 0; w<=W; w++){
            B[0][w] = 0;
        }
        for(int i = 1; i<=n ; i++ ){
            B[i][1] = 0;                       
        }  
        for(int i = 1; i<=n ; i++ ){
            for(int w = 1; w<=W; w++){
                if(itemKg[i] <= w){
                    if((itemVal[i] + B[i-1][w - itemKg[i]]) > (B[i-1][w])){
                        B[i][w] = itemVal[i] + B[i-1][w - itemKg[i]]; 
                    }
                    else{
                        B[i][w] = B[i-1][w]; 
                    }
                }
                else{
                   B[i][w] = B[i-1][w]; 
                }
            }              
        }
        
        for(int w = 0; w<=W; w++){
            for(int i = 0; i<=n ; i++){
                System.out.print(B[i][w]+ " ");
            }
            System.out.print("\n");
        }
        int i = n;
        int k= W;
        while(i>0 || k>0){
            if(((i-1) <= -1)||((i-1) <= -1)){
                return;
            }
            if(B[i][k] != B[i-1][k]){
                //says if it is in the knapsack
                System.out.println("item "+k+" is in the knapsack");  
                ans += "item"+k;
                i--;
                k = k - itemKg[i];
            }
            else{
                i--;
            }
            System.out.println(ans);
        }       
    }
}
