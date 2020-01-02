public class permutation {

    public static void main(String[] args) {
        perm(new char[]{'A','B','C'},new char[3],new int[]{1,1,1},0);
    }
    public static void perm(char[] input,char[] result,int[] count,int level) {
        if (level==input.length){
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]);
            } 
            System.out.println();
            return;
        }
        else{
            for (int i=0;i<input.length;i++)
            {
                if(count[i]==0){
                    continue;
                }
                else{
                    result[level]=input[i];
                    count[i]=count[i]-1;
                    perm(input, result, count, level+1);
                    count[i]=count[i]+1;
                }
            }
        }
    }
}
