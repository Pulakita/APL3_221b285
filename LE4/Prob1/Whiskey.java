class Whiskey{
    private void Pour(){
        System.out.println("Pour 30 ml of whiskey in a glass");
    }
    private void Add_Condiments(){
        System.out.println("Add ice");
        System.out.println("Add soda");
        System.out.println("Add water");
        System.out.println("Add cold drink");
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