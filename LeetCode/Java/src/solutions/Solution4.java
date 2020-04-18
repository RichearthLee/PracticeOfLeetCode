package solutions;

import java.util.*;

public class Solution4 {

    public void buy() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        if(len == 0){
            System.out.println(0);
            return;
        }
        int[] nums  = new int[len];
        for(int i = 0 ; i < len&&in.hasNext() ; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        long res = 0;
        for(int i = len-1, j = 0; i >= 0 ; i-- , j++){
            if(j < 2){
                res += nums[i];
            }else {
                j = 0;
            }
        }
        System.out.println(res);
    }

    public void hmn(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), hm = in.nextInt();
        int[] nums  = new int[len];
        for(int i = 0 ; i < len&&in.hasNext() ; i++){
            nums[i] = in.nextInt();
        }
        int res = 0;
        for(int i = 0; i < len ; i++){
            int count = 0;
            for(int j = i ; j < len ; j++){
                count += nums[j];
                if(count % hm == 0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    public void luck(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), k = in.nextInt();
        String nums = in.nextLine();
        if(len == 0){
            System.out.println(0);
            System.out.println();
            return;
        }
        int[] arr = new int[len], map = new int[10];
        int res = 0;
        for(int i = 0 ; i < len ; i++){
            arr[i] = nums.charAt(i) - '0';
        }
        Arrays.fill(map,-1);

        for(int i = 0; i < len ; i++){
            if(map[arr[i]] != 0)continue;
            int temp = 0, count = 0;
            for(int j = 0 ; j < 10 ;j++){
                for(int m = 0 ; m < len ; m++){
                    if(arr[i] - arr[m] == j){
                        temp++;
                        count += arr[i] - arr[m];
                    }
                    if(temp == k)break;
                }
                if(temp == k)break;
            }
            map[arr[i]] = count;
        }
        int min = 0, index = 0;
        for(int n : map){
            if(n!=-1){
                min = Math.min(min, n);
            }
        }
        for(int i = 0 ; i < len ; i++){
            if(arr[i] == i){
                index = i;
                break;
            }
        }
        for(int j = 0 ; j < 10 ;j++){
            for(int m = 0 ; m < len ; m++){

            }
        }
        System.out.println();
    }

    public void cube(){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt(), k = in.nextInt();
        int[] nums  = new int[len];
        for(int i = 0 ; i < len&&in.hasNext() ; i++){
            nums[i] = in.nextInt();
        }
        int[] dp = new int[len];
        dp[0] = 1;
        for(int i = 1, tmp = k; i < len ; i++){
            if(nums[i] == nums[i-1] && tmp > 0){
            }
        }
    }

    public void job(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] nums  = new int[m];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0 ; i < n ; i++){
            int key = in.nextInt();
            map.put(key, Math.max(map.getOrDefault(key, 0), in.nextInt()));
        }
        for(int i = 0 ; i < m&&in.hasNext() ; i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        Map.Entry<Integer,Integer> tmp = null;
        for(Map.Entry<Integer, Integer> en : map.entrySet()){
            if(tmp != null){
                map.put(en.getKey(),Math.max(en.getValue(), tmp.getValue()));
            }else {
                tmp = en;
            }
        }
        for(int i = 0 ; i < m ; i++){
            Integer itg = map.floorKey(nums[i]);
            nums[i] = itg == null?0:map.get(itg);
            System.out.println(nums[i]);
        }
    }

    public void job_v1(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int[][] map = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            map[i][0] = in.nextInt();
            map[i][1] = in.nextInt();
        }
        Arrays.sort(map,((o1, o2) -> (o1[0] - o2[0])));
        for(int i = 1; i < N ; i++){
            map[i][1] = Math.max(map[i][1],map[i-1][1]);
        }
        //二分查找
        for(; M > 0; M--){
            int m = in.nextInt(), tmp = 0;
            for(int[] n : map){
                if(n[0] > m)break;
                tmp = n[1];
            }
            System.out.println(tmp);
        }
    }


    public void job_v2(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][2];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (e1, e2) -> (int)(e1[0] - e2[0]));
        for(int i = 1; i < arr.length; i++) {
            arr[i][1] = Math.max(arr[i-1][1], arr[i][1]);
        }
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i][0], arr[i][1]);
        }
        for(int i = 0; i < M; i++) {
            int ability = sc.nextInt();
            Integer index = map.floorKey(ability);
            if(index != null) {
                System.out.println(map.get(index));
            } else {
                System.out.println(0);
            }
        }

    }

    public void job_v3(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0 ; i < n ; i++){
            int key = in.nextInt();
            map.put(key, Math.max(map.getOrDefault(key, 0), in.nextInt()));
        }
        Map.Entry<Integer,Integer> tmp = null;
        for(Map.Entry<Integer, Integer> en : map.entrySet()){
            if(tmp != null){
                map.put(en.getKey(),Math.max(en.getValue(), tmp.getValue()));
            }
            tmp = en;
        }
        for(int i = 0 ; i < m ; i++){
            Integer itg = map.floorKey(in.nextInt());
            System.out.println(itg == null?0:map.get(itg));
        }
    }

    public void divideby3(){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(), R = in.nextInt(), res = 0;
        long num = 0;
        for(int i = 1 ; i <= R ; i++){
            num += i;
            if(i >= L && num % 3 == 0 ) res++;
        }
        System.out.println(res);
    }

    public void divideby3_v1(){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(), R = in.nextInt(), res = 0;
        long remainder = 0;
        for(int i = 1 ; i <= R ; i++){
            remainder = (remainder + i)%3;
            if(i >= L && remainder == 0 ) res++;
        }
        System.out.println(res);
    }

    public void light(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(; N > 0 ; N--){
            int len = in.nextInt(), res = 0;
            String arr = in.next();
            for(int i = 0 ; i < len ; i++){
                if(arr.charAt(i) == '.'){
                    res++;
                    i = i + 2;
                }
            }
            System.out.println(res);
        }

    }

    public void direction(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String arr = in.next();
        char[] direction = {'N','W','S','E'};
        int index = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr.charAt(i) == 'R'){
                //index = index == 0 ? 3: index-1;
                index--;
            }else {
                //index = index == 3 ? 0 : index+1;
                index++;
            }
        }
        System.out.println(direction[(index%4+4)%4]);

    }

    public void numPair(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),K = in.nextInt();
        int res = 0;
        for(int i = K+1 ; i <= N ; i++){
            //res += (i - K);
            for(int j = i ; j <= N ; j++){
                if(j % i >= K)res++;
            }
        }
        System.out.println(res);
    }

    public void numPair_v1(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),K = in.nextInt();
        int res = 0;
        for(int i = K ; i <= N ; i++){
            for(int j = K+1 ; j <= i ; j++){
                if(i % j >= K)res++;
            }
            res += (N - i);
        }
        System.out.println(res);
    }

    public void numPair_v2(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),K = in.nextInt();
        long res = 0;
        if(K == 0){
            res = N * N;
        }else {
            for(int i = K+1 ; i <= N ; i++){
                res += (N / i) * (i - K) + Math.max(0, N % i - K + 1);
            }
        }
        System.out.println(res);
    }

    public void sum(){
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long c = a + b;
        System.out.println(c);
    }

    public void distinct(){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Set<Character> set = new HashSet<>();
        StringBuilder  sb = new StringBuilder();
        for(int i = 0, len = str.length() ;i < len ; i++){
            char c = str.charAt(i);
            if(set.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    public void Tetris(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] col = new int[n];
        for(int i = 0; i < m ; i++){
            col[in.nextInt()-1]++;
        }
        int res = 1001;
        for(int num : col){
            res = Math.min(num,res);
        }
        System.out.println(res);
    }

    public void correct(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(;n > 0 ; n--){
            String str = in.next();
            StringBuilder sb = new StringBuilder();
            for(int i = 0, len = str.length() ; i < len ; i++){
                char c = str.charAt(i);
                int size = sb.length();
                if(size > 0 && sb.charAt(size-1) == c){
                    if((size < 2|| sb.charAt(size-2) != c) && (size< 3 ||sb.charAt(size-3) != sb.charAt(size-2))){
                        sb.append(c);
                    }
                }else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }


    public void correct_v1(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();in.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0, len = str[i].length() ; j < len ; j++){
                char c = str[i].charAt(j);
                int size = sb.length();
                if(size > 0 && sb.charAt(size-1) == c){
                    if((size < 2|| sb.charAt(size-2) != c) && (size< 3 ||sb.charAt(size-3) != sb.charAt(size-2))){
                        sb.append(c);
                    }
                }else {
                    sb.append(c);
                }
            }
            str[i] = sb.toString();
        }
        for (String s: str) {
            System.out.println(s);
        }

    }

    public void correct_2(){
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < line; i++) {
            System.out.println(scanner.nextLine()
                    .replaceAll("(.)\\1+","$1$1")
                    .replaceAll("(.)\\1(.)\\2","$1$1$2"));
        }
    }

    public void hw1(){
        Scanner in = new Scanner(System.in);
        String[] str = null;
        try{
            str = in.next().split(",");
        }catch (Exception e){
            System.out.println("error.0001");
            return;
        }
        if(str.length == 0){
            System.out.println("error.0001");
            return;
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int max = 0;
        for(Map.Entry<String, Integer> en : map.entrySet()){
            max = Math.max(max, en.getValue());
        }
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> en : map.entrySet()){
            if(en.getValue() == max){
                list.add(en.getKey());
            }
        }
        if(list.size() == 1){
            System.out.println(list.get(0));
        } else {
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int i = 0, j = 0;
                    while(i< o1.length() && j < o2.length()){
                        if(o1.charAt(i) > o2.charAt(j)){
                            return 1;
                        }if(o1.charAt(i) < o2.charAt(j)){
                            return -1;
                        }
                        i++;
                        j++;
                    }
                    if(i == o1.length())return -1;
                    return 1;
                }
            });
            System.out.println(list.get(0));
        }
    }

    public void hw2(){
        Scanner in = new Scanner(System.in);
        String key = in.next();
        String[] str = in.next().split("],");
        for(String s : str){
            if(s.substring(0, s.indexOf("[")).matches(key)){
                int a = s.indexOf("addr=");
                String addr, mask, val;
                if(a == -1)continue;
                addr = s.substring(a+5, s.indexOf(","));
                a = s.indexOf("mask");
                if(a == -1)continue;
                mask = s.substring(a+5,s.indexOf(","));
                a = s.indexOf("val");
                if(a == -1)continue;
                val = s.substring(a+4);
                if(val.contains("]"))val = val.substring(0,val.indexOf("]"));
                System.out.println();
            }
        }

    }

    private static long res= 0;
    public void hw3(){
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        long[] arr = new long[sum];
        long[][] matrix = new long[sum][sum+1];
        for(int i = 0 ; i< sum ; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < sum; i++) {
            matrix[in.nextInt()-1][0] = in.nextInt();
            for (int j = 1; j <= arr[i]; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < sum; i++) {
            hw3_help(matrix,arr,0,new long[1]);
        }
        System.out.println(res);
    }

    private void hw3_help(long[][] matrix, long[] arr, long i,long[] count){
        count[0] += matrix[(int)i][0];
        if(matrix[(int)i][1] == 0){
            res = Math.max(res, count[0]);
        }
        for (int j = 1; j <= arr[(int)i]; j++) {
            hw3_help(matrix, arr , matrix[(int)i][j]-1, count);
            count[0] -= matrix[(int)matrix[(int)i][j]-1][0];
        }

    }

    public void maxval(){
        Scanner in = new Scanner(System.in);
        int len = 3;
        int[] nums = new int[len];
        for(int i = 0 ; i < len ; i++){
            nums[i] = in.nextInt();
        }
        int[][] dp = new int[len][len];
        for (int i = 0; i < dp[0].length; i++) {
            for (int j = i; j >= 0; j--) {
                if(i == j){
                    dp[j][i] = nums[i];
                }else {
                    for (int k = j; k < i; k++) {
                        dp[j][i] = Math.max(dp[j][k]*dp[k+1][i], dp[j][k] + dp[k+1][i]);
                    }
                }
            }
        }
        System.out.println(dp[0][len-1]);
    }

    public void sleep(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[][] list  = new int[n][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                list[j][i] = in.nextInt();
            }
        }
        int max = 0;
        for (int i = 0, count = 0; i < n; i++) {
            if(list[i][1] == 0) count += list[i][0];
            if(i-k >= 0 && list[i-k][1] == 0) count -= list[i-k][0];
            max = Math.max(max,count);
        }
        for (int i = 0; i < n; i++) {
            if(list[i][1] == 1) max += list[i][0];
        }
        System.out.println(max);
    }

    public void harvest(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list  = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt() + (i>0?list[i-1]:0);
        }
        for (int m = in.nextInt(); m > 0 ; m--) {
            int x = in.nextInt();
//            int left = 0, right = n-1;
//            while(left < right){
//                int tmp = (left + right)/2;
//                if(list[tmp] > x){
//                    right = tmp-1;
//                }else if(list[tmp] < x){
//                    left = tmp+1;
//                }else {
//                    left = tmp;
//                    break;
//                }
//            }
//            System.out.println(list[left] >= x?left+1 :left+1+1);
            int res = Arrays.binarySearch(list, x);
            System.out.println(res > 0 ? res +1 : -res);
        }
    }












}
