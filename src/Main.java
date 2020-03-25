public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(6.6f, 9.9f);
        System.out.println("point2D: "+point2D.toString());
        for (double values: point2D.getXY()){
            System.out.print(values+"\t");
        }

        System.out.println();

        Point3D point3D = new Point3D(8.8f, 7.7f, 5.5f);
        System.out.println("Point3D: "+point3D.toString());
        for (double values:point3D.getXYZ()){
            System.out.print(values+"\t");
        }
    }
}
