class mother{
    int x;
        static void show()
        {
        System.out.println("Hello World");   
    }
}

class child extends mother{
    static void show()
    {
        System.out.println("Hello JUET");   
    }
}

class Main{
    public static void main(String args[]){
        mother m = new mother();
        m.show();
        child ch = new child();
        ch.show();
        mother m1 = new child();
        m1.show();
    }
}