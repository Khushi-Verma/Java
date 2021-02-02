public class Main{
    public int sum(int x, int y){
        return (x+y);
    }
    public int sum(int x,int y,int z){
        return (x+y+z);
    }
    public double  sum(double x, double y){
        return(x+y);
    }
    public static void main(String[]  args){
        Main s= new Main();
        System.out.println(s.sum(10,10));
        System.out.println(s.sum(10,10,10));
        System.out.println(s.sum(10.1,10.1));
    }
}
