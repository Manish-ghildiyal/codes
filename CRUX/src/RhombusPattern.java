import java.util.Scanner;
import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.*;

import static java.lang.StrictMath.sqrt;
public class RhombusPattern {



        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int k=n,row=1,col=0,space=0;
            while(row<=n){
                col=n;
                space=0;
                while (space<n-row){
                    System.out.print(" ");
                    space++;
                }
                while (col>0){
                    if(row==1 || row==n )
                        System.out.print("*");
                    else if(col==1 || col==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    col--;
                }
                row++;
                System.out.println();
                System.out.println();
            }
        }
    }


