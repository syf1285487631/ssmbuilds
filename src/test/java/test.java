import java.util.Random;

/**
 * @author shaoYF
 * @title: test
 * @projectName ssmbuild
 * @description: TODO
 * @date 2021/11/18 14:10
 */
public class test {
    public static void main(String[] args) {
        LotteryTicket lt = new LotteryTicket();
        int red[] = lt.getRed();
        System.out.print("随机生成的红球为：");
        for(int i=0;i<6;i++){
            System.out.print(" "+red[i]);
        }
        System.out.print("\t蓝球为："+lt.getBlue());
    }
}
class LotteryTicket{
    private int[] red = new int[6];
    public int[] getRed(){ //返回红球
        int i =0;
        for(;i<6;i++){
            red[i] = (int)(Math.random()*33) +1;
            for(int j=0;j<i;j++){ //保证了重复，我个从认为这个彩票好像不能重复吧
                if(red[i]==red[j]){
                    red[i] = (int)(Math.random()*33) +1;
                    j=0;
                }
            }
        }
        return red;
    }
    public int getBlue(){ //返回蓝球
        return (int)(Math.random()*16) +1;
    }
}