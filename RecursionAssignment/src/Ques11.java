public class Ques11 {
    public static void main(String[] args) {
        int ar[]={1,0,0,1};
        System.out.println("array is pallindrome "+pallindrome(ar,0,ar.length-1));
    }
    public static boolean pallindrome(int[] ar,int i,int j) {
      if(i>j)
          return true;
      if(ar[i]==ar[j])
          return pallindrome(ar,i+1,j-1);
      else
          return false;
    }
}
