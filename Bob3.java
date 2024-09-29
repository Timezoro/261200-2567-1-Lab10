import  java.awt.*;

public class Bob3 implements Runnable{
    private final Turtle Bob3;
    public Bob3(){
        this.Bob3 = new Turtle();
        Bob3.fillColor(Color.green);
    }

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            Bob3.forward(50);
            Bob3.right(72);
        }
    }
}
