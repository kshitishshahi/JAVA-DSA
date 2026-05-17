public class Greeting_Method {
    void greet(String name){//using object of particular class

        System.out.println("I am "+name);
    }

    static void greetings() {//using static method
        System.out.println("I am KSHITISH SHAHI");
    }

    public static void main(String[] args){

        greetings();
        Greeting_Method g1 = new Greeting_Method();
        g1.greet("KSHITISH");
    }
}