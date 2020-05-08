import java.util.Scanner;

public class TimGTLNMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài mảng: ");
        int height = sc.nextInt();
        System.out.print("Nhập chiều rộng mảng: ");
        int width = sc.nextInt();

        int[][] matrix = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Mời nhập phần tủ [" + i + "][" + j + "] của mảng: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
    }
}
