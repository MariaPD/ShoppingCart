public class TV {
    private String brand;
    private int channel;
    private int volume;

    public TV (String brand, int channel, int volume) {
        this.brand = brand;
        this.channel = channel;
        this.volume = volume;
    }

    public void increase (int amount) {
        this.volume += amount;
        if (this.volume > 100) this.volume = 100;
    }

    public void decrease (int amount) {
        this.volume -= amount;
        if (this.volume < 0) this.volume = 0;
    }

    public void setChannel (int canal) {
        if(1 <= canal && canal <= 50) this.channel += canal;
    }

    public void reset () {
        this.channel = 1;
        this.volume = 50;
    }

    public String status () {
        return this.brand + " at channel " + this.channel + ", volume" + this.volume;
    }
}
