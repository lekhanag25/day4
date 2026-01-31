interface Payment{
    void pay();
}
class Upi implements Payment{
    public void pay(){
       System.out.println("paying");
    }
}
class code8{
    public static void main(String[] args) {
         Upi gpay=new Upi();
        gpay.pay();
    }
}