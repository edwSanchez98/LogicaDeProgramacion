import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class comandoWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        while(sc.hasNext()){
            k++;
            int n =sc.nextInt();
            if(n==0){
                break;
            }
            Bj bj[] = new Bj[n];
            for(int i=0;i<n;i++){
                bj[i]=new Bj();
                bj[i].b = sc.nextInt();
                bj[i].j = sc.nextInt();
            }
            sort(bj);
            int s=0;
            int ans =0;
            for(int i=0;i<n;i++){
                s = s+bj[i].b;
                ans = Math.max(ans, s+bj[i].j);            }
            System.out.println("Case "+k+": "+ans);
        }
    }

    private static void sort(Bj[] bj) {
        Arrays.sort(bj, new Comparator<Bj>() {
            @Override
            public int compare(Bj o1, Bj o2) {
                if(o1.j<o2.j){
                    return 1;
                }
                return -1;
            }
        });
    }
}

class Bj{
    public int b;
    public int j;
}
