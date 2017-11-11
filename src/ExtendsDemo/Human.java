package ExtendsDemo;

public abstract class Human {
    int age;
    String name;
    String sex;

    public Human(int age,String name,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void sleep(){
        System.out.println("正在睡觉");
    }

    public void introduce(){
        System.out.println(age + name + sex);
    }

//    public abstract void eat();
}
