public class WhiteBoard {
    private String WBtext;
    private int noOfStudents = 0;
    private int count = 0;
    public void attendance()
    {
        noOfStudents++;
    }
    synchronized public void write(String statement)
    {
        while(count != 0)
            try {
                wait();
            }catch (Exception e) {}

        WBtext = statement;
        count = noOfStudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while (count == 0)
            try {
                wait();
            } catch (Exception e){}

        String txt = WBtext;
        count--;
        if(count == 0)
            notify();
        return txt;
    }
}
