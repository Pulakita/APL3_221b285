class Beer{
    private void Pour(){
        System.out.println("Pour 60 ml of beer in a glass");
    }

    private void Serve(){
        System.out.println("Serve");
    }
    
    public void templateMethod(){
        Pour();
        Serve();
    }
}