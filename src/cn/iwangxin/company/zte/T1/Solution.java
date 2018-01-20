package cn.iwangxin.company.zte.T1;
import java.util.*;
class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int maxOnMic(int numGroups, int numMics, int[] groupList)
    {
         ArrayList<Integer> list = new ArrayList<Integer>();
         for(int i = 0;i < groupList.length; i++){
             list.add(groupList[i]);
         }
         numMics -= numGroups;
         while(numMics > 0){
             Collections.sort(list);
             list.remove(list.size()-1);
             int size = list.get(list.size()-1) / 2;
             list.add(size);
             list.add (size);
             numMics --;
             numGroups++;
         }
         Collections.sort(list);
         return list.get(list.size()-1);
    }
    // METHOD SIGNATURE ENDS

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxOnMic(5,7,new int[]{10,8,6,4,3}));
    }
}
