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
        System.out.println(blocks);
        Block[] dp = new Block[N];
        dp[0] = blocks.get(0);

        for (int i = 1 ; i < N ; i ++){
            System.out.println("i: " + i );
            for (int j = i-1; j >-1; j --){
                System.out.println("j: " + j );
                dp[i] = dp[i-1];
                if (blocks.get(i).weight <= dp[j].weight){
                    System.out.println("i am small");
                    if (dp[j].height + blocks.get(i).height > dp[i].height){
                        Block newBlock = new Block(blocks.get(i).bottom,dp[j].height + blocks.get(i).height,blocks.get(i).weight);
                        dp[i] = newBlock;
                    }
                }
            }
            System.out.println(Arrays.toString(dp));


        }

        System.out.println(Arrays.toString(dp));
//        for (int i = 1; i < N; i ++){
//            dp[i] =
//        }
    }
}
