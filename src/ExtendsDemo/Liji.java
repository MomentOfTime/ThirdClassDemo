package ExtendsDemo;

public class Liji extends Human {

    public Liji() {
        super(16, "liji", "女");
    }

//    @Override
//    public void eat() {
//        System.out.println("里脊吃饭");
//    }

    public void answer(AnswerInterface answerInterface){
        System.out.println("我里脊想了一下，花了半秒时间");
        answerInterface.answer(123456);
    }

}
