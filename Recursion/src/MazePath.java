public class MazePath {
    public static void main(String[] args) {
        String processed="";
        maze(processed,2,2);
    }

    public static void maze(String processed,int row,int col){
        //int n=0;
        if(row==1 && col==1)
        {System.out.println(processed);
         return;
        }

        if(row>1)
            maze(processed+'V',row-1,col);
        if (col>1)
            maze(processed+'H',row,col-1);
    }
}
