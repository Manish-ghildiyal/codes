/*import java.util.ArrayList;
import java.util.Arrays;

public class MazeArrayList {
    public static void main(String[] args) {
        String processed="";
        System.out.println(Arrays.toString(maze(processed,3,3));
    }

    public static list maze(String processed,int row,int col){
        //int n=0;
        if(row==1 && col==1)
        {//System.out.println(processed);
            ArrayList list=new ArrayList();
            list.add(processed);
            return list;
        }
        int count=0;
        if(row>1)
            count+=maze(processed+'V',row-1,col);
        if (col>1)
            count+=maze(processed+'H',row,col-1);
        return count;
    }

}
*/