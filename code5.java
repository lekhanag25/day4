class Animal{
    Animal(){
        System.out.println("cat");
    }
}
class Cat extends Animal{
    public Cat(){
        super();
    }

    void sound(){
        System.out.println("meow meow");
    }
}
class code5{
    public static void main(String[] args) {
        Cat ca=new Cat();
        ca.sound();
    }
}
