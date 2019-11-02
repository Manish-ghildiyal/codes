//package backy;
//
//public class ArrayList<T> {
//     private T []ar;
//    private int size=0;
//    private int DEFAULT_SIZE=2;
//    public ArrayList()
//    {
//     //    ar=new T[DEFAULT_SIZE];
//    }
//    public boolean isFull()
//    {
//        return  size==ar.length;
//    }
//    public void add(T element)
//    {
//        if(isFull()) {
//        //            System.out.println("bhari hai be");
//   //                 resize();
//        }
//        ar[size++]=element;
//        System.out.println("element inserted "+element);
//    }
//    public boolean isEmpty()
//    {
//        return size==0;
//    }
//    public T remove()
//    {
//        if(isEmpty()) {
//            System.out.println("khali hai be");
//            //return 0;
//
//        }T temp=ar[--size];
//        return temp;
//    }
//    public void set(T index,T element)
//    {
//        ar[index]=element;
//        System.out.println("element set");
//    }
//    public T get(T index)
//    {
//        return ar[index];
//    }
//    public void dispplay()
//    {
//        System.out.println("yh le bhai teri array ");
//        for (int i = 0; i <size ; i++) {
//            System.out.println(ar[i]+" ");
//        }
//    }
////    private void resize(){
////        int temp[]=new int[2*ar.length];
////        for (int i = 0; i <ar.length ; i++) {
////            temp[i]=ar[i];
////        }
////        ar=temp;
////        System.out.println("mai badal gaya ");
////    }
//
//
//}
