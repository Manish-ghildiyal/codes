import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        //builder.append(a);
        UpperTo(a);

    }
    public static   void UpperTo(String a)
    {
        StringBuilder builder=new StringBuilder(a);
        for (int i = 0; i <builder.length() ; i++) {
            char ch=builder.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
                builder.setCharAt(i,ch);
        }
            else
            {
                ch=(char)(ch+32);
                builder.setCharAt(i,ch);

            }
        }
        System.out.println(builder);
    }

}
