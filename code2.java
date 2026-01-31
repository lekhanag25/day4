 class Animal {
    void animal() {
        System.out.println("animals are cat, human, lion");
    }
}

class Mammals extends Animal {   
    void legs() {
        System.out.println("mammals have four legs");
    }
}

class Human extends Mammals {
    void humans() {
        System.out.println("only humans have two legs");
    }
}

class code2 {
    public static void main(String[] args) {
        Mammals m1 = new Mammals();
        Human h1 = new Human();
        h1.humans();   
        h1.legs();     
    }
}