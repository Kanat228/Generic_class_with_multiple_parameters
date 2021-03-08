public class main {
    public static void main(String[] args) {
        //Параметризируем класс типом Integer для ключа и String для значения
        Box<Integer, String> box1 = new Box<>(777, "Java");
        System.out.println(box1);
        //Параметризируем класс типом Boolean для ключа и Integer для значения
        Box<Boolean, Integer> box2 = new Box<>(Boolean.FALSE, 555);
        System.out.println(box2);
    }
}