package backy.Inheritance;

public abstract class Engine {
    public int acceleration_speed=3;
    public void start()
    {
        System.out.println("i start like a generic engine");
    }
    public void stop()
    {
        System.out.println("i stop like a generic engine");
    }
    public void accelerate()
    {
        System.out.println("i accelerate like a generic engine");
    }
    public void accelerate(int acceleration_speed)
    {
        System.out.println("hello");
    }
    public static void hi()
    {
        System.out.println("horri hai hai");
    }
    public abstract void fun();
}
