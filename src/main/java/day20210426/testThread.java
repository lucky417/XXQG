package day20210426;

import org.apache.poi.util.SystemOutLogger;

public class testThread {
    public static void test() {
        Thread[] ths= new Thread[3];
        for (int i=0;i<3;i++){
            ths[i]=new Thread(new Runnable() {
                @Override
                public void run(){
                    for (int j=0;j<5;j++){
                        System.out.print(j);
                    }
                    System.out.print(" ");
                }
            });

        }
        for (Thread th:ths){
            th.start();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
