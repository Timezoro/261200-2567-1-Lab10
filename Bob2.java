import  java.awt.*;

public class Bob2 implements Runnable{
    private final Turtle Bob2;
    public Bob2(){
        this.Bob2 = new Turtle();
        Bob2.fillColor(Color.blue);
    }

    @Override
    public void run() {
        for(int i = 0;i<3;i++){
            Bob2.forward(50);
            Bob2.right(120);
        }
    }
}
