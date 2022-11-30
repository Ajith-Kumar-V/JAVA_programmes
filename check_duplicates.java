import java.util.Scanner;
public class check_duplicates {
    static String[] convert_add(int len){
        String array[]=new String[len];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<len;i++){
            Scanner get_obj=new Scanner(System.in);
            array[i] = get_obj.next();
        }
        return array;
    }
    static String check_duplicate(String[] arr,int lent){
        //String otp="No duplicates";
        for (int i=0;i<lent;i++){
            for (int j=i+1;j<lent;j++){
                if (arr[i].equals(arr[j])){
                    return arr[i];}
        }
    } return "No duplicates";
    }
    public static void main(String[] args){
        Scanner scan_obj=new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int lengt=scan_obj.nextInt();
        String[] output=convert_add(lengt);
        String val=check_duplicate(output,output.length);
        System.out.println(val);
        }
    }
