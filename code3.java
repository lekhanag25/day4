class Animal {
    void animal() {
        System.out.println("animals are cat, human, lion");
    }
}

class Dog extends Animal {   
    void Bark() {
        System.out.println("Dog");
    }
}

class Human extends Animal {
    void Speak() {
        System.out.println("human");
    }
}

class code3 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Human h1 = new Human();
        h1.animal();
        h1.Speak();
        d1.animal();
        d1.Bark();
    }
}
