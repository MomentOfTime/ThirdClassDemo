package ExtendsDemo;

public class Main {
    public static void main(String[] args) {
        Temp que = new Temp();
        Liji liji = new Liji();
        System.out.println("我想问一个问题");
        liji.answer(new AnswerInterface() {
            @Override
            public void answer(int qu) {
                System.out.println(qu);
            }
        });
    }
}

class Temp implements AnswerInterface{

    @Override
    public void answer(int qu) {

    }
}
