import java.util.Scanner;
class run {
    public static void comb(int person[], int data[], int start, int index, int target) {
        if(target <= 0){ // target 低於 0 則後面不需要再繼續判斷
            if(target == 0) { // 等於 0 才是我們需要的，印出結果
                for (int i = 0; i < index; i++)
                    System.out.print(data[i] + " ");
                System.out.println();
            }
            return;
        }
        for (int i = start; i <= person.length-1; i++) {
            data[index] = person[i];
            comb(person, data, i+1, index+1, target-person[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt(); // 老師想跑多遠
        int people = input.nextInt(); // 幾個人
        int person[] = new int[people]; // 每個人里程數
        for (int i = 0; i < people; i++) 
            person[i] = input.nextInt();
        int start = 0; // 提取 person[]， start from 0
        int index = 0; // data[] index
        int data[] = new int[person.length]; // result
        comb(person, data, start, index, target);
    }
}