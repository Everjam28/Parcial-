
package Parcial;

public class InterfazRed {
    private int OA=3,OB=5,OC=7,OD;
private final Host host[];

    public InterfazRed() {
        host = new Host[OA];
        host[0] = new Host("PC1,IP:192.168.0.1");
    }

    public int getOA() {
        return OA;
    }

    public void setOA(int OA) {
        this.OA = OA;
    }

    public int getOB() {
        return OB;
    }

    public void setOB(int OB) {
        this.OB = OB;
    }

    public int getOC() {
        return OC;
    }

    public void setOC(int OC) {
        this.OC = OC;
    }

    public int getOD() {
        return OD;
    }

    public void setOD(int OD) {
        this.OD = OD;
    }

}