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
