package Donguler;

public class BirleYuzArasindakiAsalSayilar {
    public static void main(String[] args) {
        int multiplier = 2;
        int  x;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                x = i%j;
                if(x==0){
                    multiplier = j;
                    break;
                    }
                }
            if(multiplier == i){
                System.out.print(i + " ");
            }
        }
    }
}