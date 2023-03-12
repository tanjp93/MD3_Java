package lopStopWatch;

public class ClassStopWatch {
    private long start,end;

    public ClassStopWatch() {
    }

    public long getStart() {
        return  this.start=System.currentTimeMillis();
    }

    public long getEnd() {
        return  this.end=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.end-this.start;
    } ;
}
