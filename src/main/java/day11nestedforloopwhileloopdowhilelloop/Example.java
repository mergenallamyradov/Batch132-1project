package day11nestedforloopwhileloopdowhilelloop;

public class Example {
    public static void main(String[] args) {
        int m =10;
        int n=2;
        int sum=0;
        while (m>n){
            m--;
            n=n+2;
            sum=sum+m+n;
            System.out.println(sum);
        }
        System.out.println(sum);

        //Q9
        int x=1, y=15;
        while (x<4){
            y--;
            x++;
            System.out.println(x+","+y);
        }
        System.out.println(x+","+y);


        int h=1;
        while (h<=5){
            System.out.println(h);

           h++;
        }

        int hh=1;
        int z=hh+=5;
        System.out.println(z);

    }
}
