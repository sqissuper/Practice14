

import java.util.*;

public class Main1 {

    //连续子数组的最大和
//    public int FindGreatestSumOfSubArray(int[] array) {
//        int n = array.length;
//        if(n == 0) return 0;
//        int sum = array[0];
//        int max = array[0];
//        for(int i = 1; i < n; i++) {
//            max = Math.max(array[i] + max,array[i]);
//            sum = Math.max(max,sum);
//        }
//        return sum;
//    }

    //最小的额K个数
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        if(k > input.length) return new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        Arrays.sort(input);
//        for(int i = 0; i < k; i++) {
//            list.add(input[i]);
//        }
//        return list;
//    }
//    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        if (k > input.length) return new ArrayList<>();
//        PriorityQueue<Integer> qu = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < input.length; i++) {
//            qu.offer(input[i]);
//        }
//        while (k != 0) {
//            list.add(qu.poll());
//            k--;
//        }
//        return list;
//    }

    //数组中出现次数超过一半的数
//    public int MoreThanHalfNum_Solution(int [] array) {
//        Arrays.sort(array);
//        int n = array.length;
//        if(n < 2) return array[0];
//        for(int i = 0; i < n/2; i++) {
//            int j = i + n/2;
//            if(array[i] == array[j]) {
//                return array[i];
//            }
//        }
//        return 0;
//    }

    //第一次只出现一次的字符
//    public int FirstNotRepeatingChar(String str) {
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i = 0; i < str.length(); i++) {
//            if(map.containsKey(str.charAt(i))) {
//                int tmp = map.get(str.charAt(i));
//                map.put(str.charAt(i),++tmp);
//            } else {
//                map.put(str.charAt(i),1);
//            }
//        }
//        for(int i = 0;i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(map.get(c) == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }


    //两个链表的额公共节点
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//        if(pHead1 == null || pHead2 == null) return null;
//        ListNode p1 = pHead1;
//        ListNode p2 = pHead2;
//        int len1 = 0,len2 = 0;
//        while(p1 != null) {
//            len1++;
//            p1 = p1.next;
//        }
//        while(p2 != null) {
//            len2++;
//            p2 = p2.next;
//        }
//        int len = len1 - len2;
//        p1 = pHead1;
//        p2 = pHead2;
//        if(len < 0) {
//            len = len2 = len1;
//            p1 = pHead2;
//            p2 = pHead1;
//        }
//        while(len != 0) {
//            p1 = p1.next;
//            len--;
//        }
//        while(p1 != null) {
//            if(p1.val == p2.val) {
//                return p1;
//            }
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//        return null;
//    }

    //统计一个数字在升序数组中出现的次数。
//    public static int GetNumberOfK(int [] array , int k) {
//       if(array.length == 0) return 0;
//        for(int i = 0; i < array.length; i++) {
//            for(int j = array.length - 1; j >= i; j--) {
//                if(array[i] == k && array[i] == array[j]) {
//                    return j - i + 1;
//                }
//            }
//        }
//        return 0;
//    }

    //二叉树深度
//    public int TreeDepth(TreeNode root) {
//        if(root == null) return 0;
//        int lh = TreeDepth(root.left);
//        int rh = TreeDepth(root.right);
//        return lh > rh ? lh + 1 : rh + 1;
//    }

    //数组中只出现一次的两个数字
//    public static int[] FindNumsAppearOnce (int[] array) {
//        // write code here
//        int[] arr = new int[2];
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < array.length; i++) {
//            if(map.containsKey(array[i])) {
//                int tmp = map.get(array[i]);
//                map.put(array[i],tmp + 1);
//            } else {
//                map.put(array[i],1);
//            }
//        }
//        int k = 0;
//        for(int i = 0; i < array.length; i++) {
//            int ret = map.get(array[i]);
//            if(ret == 1) {
//                arr[k++] = array[i];
//            }
//        }
//        return arr;
//    }

    //输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
//    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
//        ArrayList<ArrayList<Integer> > list = new ArrayList<>();
//        int left = 1,right = 2;
//        while(left < right) {
//            int tmp = (left + right) * (right - left + 1) / 2;
//            if(tmp == sum) {
//                ArrayList<Integer> ret = new ArrayList<>();
//                for(int i = left; i <= right; i++) {
//                    ret.add(i);
//                }
//                list.add(ret);
//                left++;
//            } else if (tmp > sum) {
//                left++;
//            } else {
//                right++;
//            }
//        }
//        return list;
//    }

    //对应每个测试案例，输出两个数，小的先输出。
//    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int left = 0,right = array.length - 1;
//        while(left < right) {
//            int tmp = array[left] + array[right];
//            if(tmp == sum) {
//                list.add(array[left]);
//                list.add(array[right]);
//                left++;
//                right--;
//                return list;
//            } else if(tmp > sum) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        return list;
//    }
    public static void main(String[] args) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        HashMap<Integer,Integer> map = new HashMap<>();
//        int[] arr = {1,2,3,3,3,3,4,5};
//        int k = 3;
//        System.out.println(GetNumberOfK(arr, k));

//        int[] arr = {2,4,3,6,3,2,5,5};
//        int[] ret = FindNumsAppearOnce(arr);
//        System.out.println(Arrays.toString(ret));
    }
}
