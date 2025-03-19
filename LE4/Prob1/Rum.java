class Rum{
    private void Pour(){
        System.out.println("Pour 60 ml of rum in a glass");
    }
    private void Add_Condiments(){
        System.out.println("Add ice");
        System.out.println("Add soda");
    }
    private void Stir(){
        System.out.println("Stir for 30 sec");
    }
    private void Serve(){
        System.out.println("Serve");
    }
    
    public void templateMethod(){
        Pour();
        Add_Condiments();
        Stir();
        Serve();
    }
}