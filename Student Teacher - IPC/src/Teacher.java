public class Teacher extends Thread{
    private WhiteBoard wb;
    private String statements[] = {"Hello Students", "Welcome to Class", "H2O is water", "H2SO4 is acidic", "Acid rain is below 5PH"};
    public Teacher(WhiteBoard wb)
    {
        this.wb = wb;
    }

    public void run()
    {
        for(String statement : statements){
            System.out.println("Teacher: " + statement);
            wb.write(statement);
        }
    }
}
