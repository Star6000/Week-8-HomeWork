package poolarea20;

    public class Cuboid extends Rectangle{

        public double height;

        public Cuboid(double width, double length, double height) {
            super(width, length);
            if(height < 0){
                height = 0;
            }else {
                this.height = height;
            }
        }

        public double getHeight(){
            return this.height;
        }

        public double getVolume(){
            return getArea() * height;
        }
    }

