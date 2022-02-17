import processing.core.PApplet;

class Ball{
    protected int x_axis;
    protected int y_axis;
    protected int speed;
    protected int diameter;

    Ball(int x_axis,int y_axis,int speed,int diameter){
        this.x_axis=x_axis;
        this.y_axis=y_axis;
        this.speed=speed;
        this.diameter=diameter;
    }
    protected void move(){
        this.x_axis+=speed;
    }
}

public class Ellipse extends PApplet {
    static final int HEIGHT = 800;
    static final int WIDTH = 1040;
    static final int DIAMETER = 17;
    static Ball balls[]=new Ball[4];
    public static void main(String[] args) {
        PApplet.main("Ellipse",args);

        for(int ball=0;ball<4;ball++){
            balls[ball]=new Ball(0,(ball+1)*HEIGHT/5,ball+1,DIAMETER);
        }
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        for(int ball=0;ball<4;ball++){
            ellipse(balls[ball].x_axis,balls[ball].y_axis,balls[ball].diameter,balls[ball].diameter);
            balls[ball].move();
        }
    }

}
