import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Block implements Comparable<Block>{
    int bottom;
    int height;
    int weight;

    public Block(int bottom, int height, int weight){
        this.bottom = bottom;
        this.height = height;
        this.weight = weight;
    }

    public int compareTo(Block b){
        return b.bottom - this.bottom;
    }

    public String toString(){
        return "[" + bottom + " " + height + " " + height + "]";
    }
}
public class Test10_4 {

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        int N = sc.nextInt();
        List<Block> blocks = new ArrayList<>();
        for (int i =  0 ; i < N ; i ++){
            int bottom = sc.nextInt();
            int height = sc.nextInt();
            int weight=  sc.nextInt();
            blocks.add(new Block(bottom,height,weight));
        }
        Collections.sort(blocks);
//        System.out.println(blocks);
        int[] dp = new int[N];
        dp[0] = blocks.get(0).height;
        int answer = dp[0];
        for (int i = 1 ; i < N ; i++){
            int maxHeight = 0;
            for (int j =i-1; j >=0; j--){
                if (blocks.get(i).weight < blocks.get(j).weight && dp[j] > maxHeight){
                    maxHeight = dp[j];
                }
            }

            dp[i] = blocks.get(i).height + maxHeight;
            answer = Math.max(dp[i],answer);
        }
        System.out.println(answer);
//        System.out.println(Arrays.toString(dp));

    }
}
