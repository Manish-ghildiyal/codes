package backy.Interface;

public class JavaTeacher implements Teacher {

    @Override
    public void study() {
        System.out.println("Studies Java");
    }

    @Override
    public void teach() {
        System.out.println("Teach java");
    }
    public void dance()
    {
        System.out.println("I dance in java");
    }
}
