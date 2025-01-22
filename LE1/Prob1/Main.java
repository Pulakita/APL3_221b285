class mother{
    int x;
        void show()
        {
        System.out.println("This is mother");   
    }
}

class child extends mother{
    
}

class Main{
    public static void main(String args[]){
        mother m = new mother();
        m.show();
        child ch = new child();
        ch.show();
    }
}