public class Pro16{
        int x;
        int y;

        Pro16(){
        }
        public Pro16(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
        public double distance(){
            // between this Point and Point x,y as double.
            //dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
            double distance = Math.sqrt( (this.x-x) * (this.x - y)  + (this.y-y) * (this.y-x) );
            return distance;
        }
        public static void main(String[] args) {
            Pro16 p = new Pro16();
            System.out.println(p.distance());
        }
    }

