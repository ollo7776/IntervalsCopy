public class Interval {
    private int start;
    private int stop;

    public Interval(int start, int stop) {
    this.start = start;
    this.stop = stop;
    }
public boolean isOverl(Interval other1){
if(stop >= other1.start){
    return true;
}
return false;
}
}
