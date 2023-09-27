public class Student extends Thread{
    private String name;
    private WhiteBoard wb;

    public Student(String name, WhiteBoard wb)
    {
        this.name = name;
        this.wb = wb;
    }

    public void run()
    {
        wb.attendance();
        int i = 0;
        while (i < 5)
        {
            System.out.println(name + ": " + wb.read());
            System.out.flush();
            i++;
        }
    }
}
