public class recrusion {
    public static void main(String[] args){
        int fact=factorials(5);
        System.out.println(fact);
    }
    public static int factorials(int n) {
        int facto=1;
        if (n<2)
        {
            return (1);
        }
        else
        {
            facto=n*factorials(n-1);
        }
        return facto;
    }
}
