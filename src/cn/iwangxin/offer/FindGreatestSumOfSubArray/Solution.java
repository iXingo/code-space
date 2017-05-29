package cn.iwangxin.offer.FindGreatestSumOfSubArray;

/**
 * Created by 汪欣 on 2017/05/29.
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        //Step1.从头到尾逐个累加数组中的每个数字，初始化和为0；（nCurrSum=0，nGreatestNum=Integer.MIN_VALUE）
        //Step2.首先加上第一个数字，从第二个数字开始累加，依次将累加和保存到一个临时变量（nCurrSum）中；
        //Step3.如果当前累加和（nCurrSum）小于0，那抛弃前面的子数组和，从下一个数字开始重新累加；
        //      相反，则将当前累加和（nCurrSum）与返回累加和（nGreatestNum）进行比较，
        //      如果nCurrSum>nGreatestNum，则更新nGreatestNum。
        //      这样比较进行一次遍历之后，就可以得到最终的最大累加和，时间复杂度是O(n)。
        if (array == null) return 0;
        int currSum = 0;
        int greatestSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (currSum <= 0) {
                currSum = array[i];
            } else {
                currSum += array[i];
            }
            if (currSum > greatestSum) {
                greatestSum = currSum;
            }
        }
        return greatestSum;
    }
    //下图展示了计算数组{1,-2,3,10,-4,7,2,-5}中子数组的最大和的过程：
    /*步骤            操作                 累加的子数组和                  最大的子数组和
       1              加1                       1                            1
       2              加-2                     -1                            1
       3              加3                       3                            3
       4              加10                     13                           13
       5              加-4                      9                           13
       6              加7                      16                           16
       7              加2                      18                           18
       8              加-5                     13                           18
     */

}
