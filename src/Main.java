import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] temp = inputTemp();
        int avgTemp = analyzeWarm(temp);
        System.out.println("Продолжительность положительной среднесуточной температуры: "+avgTemp);

    }

    public static int[] inputTemp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите общее количество дней: ");
        int n = scanner.nextInt();
        int temp[] = new int[n];
        System.out.println("Введите температуру по дням: ");
        for (int i = 0; i < n; i++) {
            temp[i] = scanner.nextInt();
        }
        return temp;
    }
    public static int analyzeWarm(int[] temp){
        int n = temp.length;
        int c = 0;
        int stor = 0;
        for (int i = 0; i < n; i++){
            if (temp[i] <= 0)
                c =0 ;
            else
                c++;
            if (c > stor) stor = c;
        }
        return  stor;
    }
}