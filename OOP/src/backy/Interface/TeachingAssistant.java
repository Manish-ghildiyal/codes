package backy.Interface;

public class TeachingAssistant implements Student,Teacher {

    @Override
    public void study() {
        System.out.println("I study more like a student");
    }

    @Override
    public void teach() {
        System.out.println("i teach more likea a teacher");
    }

    @Override
    public void bunk() {
        System.out.println("Bunk");
    }
}
