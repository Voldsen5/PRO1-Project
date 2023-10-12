package ex02;

public class Opgave2App {

    public static void main(String[] args) {

        Child girl = new Child(3, false);
        Child boy = new Child(1, true);

        System.out.println(girl.gender());
        System.out.println(girl.institution());
        System.out.println(girl.team());

        System.out.println(boy.gender());
        System.out.println(boy.institution());
        System.out.println(boy.team());
    }
}
