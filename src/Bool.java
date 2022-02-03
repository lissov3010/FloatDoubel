public class Bool {
    public static void main(String[] args) {
        int temp = 20;
        int time = 24;
        boolean late = time >= 23;
        boolean hot = temp > 25;
        if (!hot && late) {//добовляем доп условие с оператором (|| или) если мы хотим чтобы выполнялось два условия нужно ставить (&& и)
            System.out.println("Кондиционер выключен");
        }//это всё операцыии сравнения больше или меньше
    }
}
