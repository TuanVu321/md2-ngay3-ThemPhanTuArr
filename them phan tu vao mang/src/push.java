import java.util.Scanner;

public class push {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can chen");
        int number = scanner.nextInt();
        System.out.println("nhap vi tri can chen");
        int id = scanner.nextInt();
        int index = id-1;
        int temp;
        if(index<0 || index>arr.length-1){
            System.out.println("khong thuc hien duoc");
        }else{
            for(;index<arr.length-1;index++){
                temp = arr[index];
                arr[index]=number;
                number = temp;
            }
            arr[arr.length-1]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
