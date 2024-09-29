import  java.awt.*;

public class Bob implements Runnable{
    private final Turtle Bob;
    public Bob(){
        this.Bob = new Turtle();
        Bob.fillColor(Color.red);
    }

    @Override
    public void run() {
        for(int i = 0;i<4;i++){
            Bob.forward(50);
            Bob.right(90);
        }
    }
}
