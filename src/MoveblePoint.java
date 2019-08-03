public class MoveblePoint extends Point {
    double xSpeed=0;
    double ySpeed=0;

    public MoveblePoint() {
    }

    public MoveblePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveblePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public  void setSpeed(double xSpeed, double ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed=ySpeed;
    }

    public double[] getSpeed(){
        double[]Speed={this.xSpeed,this.ySpeed};
        return Speed;
    }


    public MoveblePoint move(){
        double x= super.getX();
        double y= super.getY();
        x+=this.xSpeed;
        y+=this.ySpeed;
        super.setX(x);
        super.setY(y);
        return this;

    }
    @Override
    public String toString(){
        return "position: ("+this.getX()+", "+ this.getY()
                +"); speed=("+this.xSpeed+", "+this.ySpeed+")";
    }

}
