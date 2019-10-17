package com.wdjcdlzmb.ctci.code;

/**
 * @Date: 2019\10\17 0017 23:41
 * @Description:
 */
public class Exchange {

    /**
     * 编写一个函数，函数内不使用任何临时变量，直接交换两个数的值。
     * <p>
     * 给定一个int数组AB，其第零个元素和第一个元素为待交换的值，请返回交换后的数组。
     * <p>
     * 测试样例：
     * [1,2]
     * 返回：[2,1]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] AB = {1, 2, 3, 4};
        new Exchange().exchangeAB(AB);
        for (int i : AB) {
            System.out.println(i);
        }
    }

    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }
}
