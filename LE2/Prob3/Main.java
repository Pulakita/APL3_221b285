class Pack1 {
    protected void display() {
        System.out.println("Display method in Pack1");
    }
}

public class Main extends Pack1 {  
    public static void main(String[] args) {
        Main obj = new Main();  
        obj.display(); 
    }
}
