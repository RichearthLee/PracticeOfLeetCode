package main;

import java.util.ArrayList;
import java.util.List;

import solutions.Solution1;
import solutions.Solution2;
import utility.TreeNode;
import test.TestMethod;

/**
 * @program: LeetCode
 * @description:
 * @author: Yukun Lee
 * @create: 2019-05-27 09:48
 */

public class MainAPP {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        Solution2 s2 = new Solution2();
        TestMethod tm = new TestMethod();
//        String[] str = {"flower","flow","flight"};
//        String[] str1 = {"dog","racecar","car"};
//        String[] str2 = {"a"};
//        String[] str3 = {"aa","aa"};
        //System.out.println(s.isValid("{[]}"));
//        List<String> list = new ArrayList<>();
//        list.add("init");
//        int n = 0;
//        String s1 = "init ";
//        for(String str: list){
//            System.out.println(str);
//        }
//        System.out.println(n);
//        System.out.println(s1);
//        int[] arr = {1,2,4};
//        int[] arr2 = {2,3,5};
//        s.findMedianSortedArrays_v1(arr, arr2);
//        String str = "wordgoodgoodgoodbestword";
//        String[] words = {"word","good","best","good"};
//        TreeNode root1 = new TreeNode(0);
//        TreeNode root2 = new TreeNode(0);
//        root1.left = new TreeNode(1);
//        root1.right = new TreeNode(1);
//        root2.right = new TreeNode(1);
//        root2.left = new TreeNode(1);
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //int[][] matrix = {{1}};
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = s2.spiralOrder(matrix);

        System.out.println(res);




    }
}