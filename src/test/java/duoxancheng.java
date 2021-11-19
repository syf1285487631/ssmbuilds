/**
 * @author shaoYF
 * @title: duoxancheng
 * @projectName ssmbuild
 * @description: TODO
 * @date 2021/11/19 11:44
 */
public class duoxancheng{
   public static class newThread extends Thread{
       @Override
       public void run() {
           System.out.println("继承Thread类");
       }
   }

   public static class newThread1 implements Runnable{

       @Override
       public void run() {
           System.out.println("实现Runnable");
       }
   }

    public static void main(String[] args) {
        Thread newThread1=new newThread();
        newThread1.start();

        newThread1 newThread2=new newThread1();

    }
}
