package backy.Inheritance;

import java.util.Collection;
import java.util.Collections;

public class Client {
    public static void main(String ... args) {
        Engine engine=new PetrolEngine();
        engine.start();
        engine.stop();
        engine.accelerate();
        System.out.println(engine.acceleration_speed);
       // engine.makenoise();
        ((PetrolEngine) engine).makenoise();
        PetrolEngine.hi();
        Engine.hi();
       // System.out.println(sum("hello",1,3,4,3,2,4,2,2,4));
        //list <Integer>a= new list ();
        //Collections.sort(ar);

    }
    public static int sum(String s1,int ...ar){
        int s=0;
        for (int i = 0; i <ar.length ; i++) {
            s=s+ar[i];

        }
        return s;
    }
}
