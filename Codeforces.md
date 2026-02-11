1=>  https://codeforces.com/problemset/problem/1875/A


        import java.util.Scanner;
        
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
        
                while (t-- > 0) {
                    long a = sc.nextInt();
                    long b = sc.nextInt();
                    int n = sc.nextInt();
        
                    long count = b;   // initial timer = initial seconds
        
                    for (int i = 0; i < n; i++) {
                        long x = sc.nextInt();
                        count += Math.min(x, a - 1);
                    }
        
                    System.out.println(count);
                }
            }
        }

----------------------------------------------------------------------------------------

2=>  https://codeforces.com/problemset/problem/1904/A


        import java.util.*;
        public class forked {
            static class Pair {
                long x, y;
                Pair(long x, long y) {
                    this.x = x;
                    this.y = y;
                }
                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (!(o instanceof Pair)) return false;
                    Pair p = (Pair) o;
                    return x == p.x && y == p.y;
                }
                @Override
                public int hashCode() {
                    return Objects.hash(x, y);
                }
            }
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while (t-- > 0) {
                    long a = sc.nextLong();
                    long b = sc.nextLong();
                    long xk = sc.nextLong();
                    long yk = sc.nextLong();
                    long xq = sc.nextLong();
                    long yq = sc.nextLong();

                    HashSet<Pair> moves = new HashSet<>();
                    int[] sign = {1, -1};

                    for (int s1 : sign) {
                        for (int s2 : sign) {
                            moves.add(new Pair(s1 * a, s2 * b));
                            moves.add(new Pair(s1 * b, s2 * a));
                        }
                    }
                    HashSet<Pair> kingSet = new HashSet<>();
                    for (Pair m : moves) {
                        kingSet.add(new Pair(xk - m.x, yk - m.y));
                    }
                    int count = 0;
                    for (Pair m : moves) {
                        Pair pos = new Pair(xq - m.x, yq - m.y);
                        if (kingSet.contains(pos)) {
                            count++;
                        }
                    }
                    System.out.println(count);
                }
                sc.close();
            }
        }

---------------------------------------------------------------------------------------

3=> https://codeforces.com/problemset/problem/1559/A

        import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();   // if multiple test cases
                while(t-- > 0){
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                    }
                    int ans = arr[0];
                    for(int i = 1; i < n; i++){
                        ans &= arr[i];
                    }
                    System.out.println(ans);
                }
            }
        }

---------------------------------------------------------------------------------------

4=> https://codeforces.com/problemset/problem/1899/A


        import java.util.Scanner;
        public class game_with_integer {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                    int n=sc.nextInt();
                    System.out.println(n%3==0 ? "Second" : "First");
                }
            }
        }

----------------------------------------------------------------------------------------

5=>  https://codeforces.com/problemset/problem/1783/A

        import java.io.*;
        import java.util.*;
        public class Main {
            public static void main(String[] args) throws Exception {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                int t = Integer.parseInt(br.readLine().trim());
                while(t-- > 0){
                    int n = Integer.parseInt(br.readLine().trim());
                    StringTokenizer st = new StringTokenizer(br.readLine());

                    int[] arr = new int[n];
                    for(int i = 0; i < n; i++){
                        arr[i] = Integer.parseInt(st.nextToken());
                    }

                    Arrays.sort(arr);

                    boolean allSame = true;
                    for(int i = 1; i < n; i++){
                        if(arr[i] != arr[0]){
                            allSame = false;
                            break;
                        }
                    }
                    if(allSame){
                        sb.append("NO\n");
                    } else {
                        sb.append("YES\n");
                        sb.append(arr[n-1]).append(" ");
                        for(int i = 0; i < n-1; i++){
                            sb.append(arr[i]).append(" ");
                        }
                        sb.append("\n");
                    }
                }
                System.out.print(sb);
            }
        }

6=>  


