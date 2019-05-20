/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;


public class Sort {

    int[] rank = new int[4];
    int[] player=new int[4];
    String[] pair=new String[4];

    public int sort(String p1) {

        pair= p1.split(",");

        for (int i = 0; i < 4; i++) {
            rank[i] = Integer.parseInt(pair[i]);
            player[i]=i+1;//プレイヤーナンバー

        }
        for (int i = rank.length-1; i > 0; i--) {
            // j は交換する箇所の前からの番号を示している
            for (int j = 0; j < i; j++) {
                if (rank[j] < rank[j + 1]) {

                    int box = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = box;
                    int no=player[j];
                    player[j]=player[j+1];
                    player[j+1]=no;
                    System.out.println(rank[j] + ":" + rank[j + 1]);

                    System.out.println(player[j] + ":" + player[j + 1]);
                } else {
                    //そのまま
                }
            }
        }

        return 0;
    }



    public int getPlayer(int i) {
        if (i >= 0 && 4 > i) {
            return player[i];
        } else {
            return 0;
        }

    }

      public int getRank(int i) {
        if (i >= 0 && 4 > i) {
            return rank[i];
        } else {
            return 0;
        }

    }



}
