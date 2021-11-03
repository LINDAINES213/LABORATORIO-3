/**
 * Esta clase hereddada de multimedia contiene getters y setters del objeto tipo audio
 * @author: Linda Ines Jimenez Vides
 * @version: 2 - noviembre - 2021
 */
public class Audio extends Multimedia{

    private double samplerate;
    private int bitdepth;

    public double getSampleRate() {
        return samplerate;
    }

    public int getBitDepth() {
        return bitdepth;
    }

    public void setSampleRate(double sampleRate) {
        this.samplerate = sampleRate;
    }

    public void setBitDepth(int bitdepth) {
        this.bitdepth = bitdepth;
    }
}
