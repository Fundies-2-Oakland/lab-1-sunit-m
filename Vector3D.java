public class Vector3D {
    public double x;
    public double y;
    public double z;

    public Vector3D(double x, double y, double z) {}

    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double mag = getMagnitude();
        if (mag == 0.0) {
            throw new IllegalStateException("Magnitude is zilch");
        }
        double new_x = x /= mag;
        double new_y = y /= mag;
        double new_z = z /= mag;

        return new Vector3D(new_x, new_y, new_z);
    }

}