public class exe3 {
    int value;
    public exe3(){value=0; }
    public void click(){this.value=value+1;}
    public double getvalue(){
        return value;
    }
    public int botton()
    {if(value>0)
        this.value=0;
        return value;
    }

    public static void main(String[] args)
    {
exe3 count=new exe3();
count.click();count.click();count.click();
        System.out.println(count.getvalue());
        count.botton();
        System.out.println(count.getvalue());
        count.botton();
    }
}
