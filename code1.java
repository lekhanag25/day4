class Animal{
    void show(){
        System.out.println("cat");
    }
}
    class Dog extends Animal{
        void bark(){
            System.out.println("bark");

        }

    }
class code1{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.bark();
        dg.show();
    }
}

