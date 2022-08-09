import java.util.*;
public class Array {
    public static void main(String[] args) {
        int max,i,min;
        int[] a;
        a=new int[10];
        Scanner s = new Scanner(System.in);
        for(i=0;i<10;i++){
            a[i]=s.nextInt();
        }
        max=a[0];
        for(i=1;i<10;i++){
            if(a[i]>max) {
                max = a[i];
            }
        }
        min=a[0];
        for(i=1;i<10;i++){
            if(a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
