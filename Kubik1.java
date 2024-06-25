public class Kubik1 {
    double sisi1;
    double sisi2;
    double sisi3;
    public double luasPer () {
        return 2* ((sisi1 * sisi2) + (sisi1 * sisi3) + (sisi2 * sisi3));
    }
    public double volume () {
        return sisi1 * sisi2 * sisi3;
    }
}
