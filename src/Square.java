public class Square {
    public static void main(String[] args) {//площадь круга
       //double r = 10.8;//меняям все переменные на флоат
      //double pi = 3.14;
       //double s = pi * r * r;
        float r = 10.8f;//что бы явно указать что это тип флоат в конце Ф
        float pi = 3.14f;
      float s = pi * r * r;
        System.out.println("Площадь круга" + s);
        double sqrt = Math.sqrt(36);//если нужен корень из числа всегда используем мас скюрт
        System.out.println("Корень 36 равен " + sqrt);
    }
}
