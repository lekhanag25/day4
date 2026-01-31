class Animal{
    void run(){
        System.out.println("cat");
    }
}
class Cat extends Animal{
    public Cat(){
        super.run();
    }

    void sound(){
        System.out.println("meow meow");
    }
}
class code6{
    public static void main(String[] args) {
        Cat ca=new Cat();
        ca.sound();
    }
}

