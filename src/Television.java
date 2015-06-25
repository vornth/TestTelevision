import java.awt.GridBagConstraints;

/**
 * Thomas Hodges
 * CMIS 141 - Week 6 Discussion
 * This class is for the use of the Television.
 * Just like any normal TV, you can turn it on and off,
 * change the channel, it has brand and model information,
 * as well as a resolution.
 */
public class Television {

    private String brand;
    private String model;
    private Boolean isOn;
    private int screenHorizontal;
    private int screenVertical;
    private String resolution = screenHorizontal + "x" + screenVertical;
    private int channel;

    // Constructor without arguments
    public Television() {
        this.isOn = false;
    }

    // Constructor with arguments
    public Television(String brand, String model, int horizontal, int verticle) {
        this.isOn = false;
        this.brand = brand;
        this.model = model;
        this.screenHorizontal = horizontal;
        this.screenVertical = verticle;
        this.resolution = screenHorizontal + "x" + screenVertical;
    }

    // Method to turn the TV on
    public void turnOn(Boolean on) {
        this.isOn = true;
    }

    // Method to turn the TV off
    public void turnOff(Boolean off) {
        this.isOn = false;
    }

    // Method to change the channel up
    public void channelUp() {
        System.out.println("Channel up.");
        channel++;
        System.out.println(this.channel);
    }

    // Method to change the channel down
    public void channelDown() {
        System.out.println("Channel down.");
        channel--;
        System.out.println(this.channel);
    }

    // Setters

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setResolution(int horizontal, int vertical) {
        this.screenHorizontal = horizontal;
        this.screenVertical = vertical;
        this.resolution = screenHorizontal + "x" + screenVertical;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }


    // Getters

    public String getStatus(Boolean status) {
        this.isOn = status;
        // Creates a string for a friendlier return
        String out;
        // if true return On, if false return Off
        if (isOn) {
            out = "On";
        } else out = "Off";
        return out;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    // Special getter for the channel.
    public void getChannel() {
        if (this.isOn) {
            System.out.println("Channel: " + this.channel);
        } else {
            System.out.println("The TV is off!");
        }

    }

    // Getter method for TV information as a string

    public String tvInformation() {
        return "Brand: " + this.brand
                + "\nModel: " + this.model
                + "\nResolution: " + this.resolution;
    }

}
