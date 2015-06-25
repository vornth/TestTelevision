/**
 *  Thomas Hodges
 *  CMIS 141 - Week 6 Discussion
 *  This program tests the Television class to ensure it functions.
 *
 */
public class TestTelevision {

	public static void main(String[] args) {
		
		// Creates a new TV
		Television tv = new Television("Sony", "Bravia", 1920, 1080);
		
		// Get the tv's information
		System.out.println(tv.tvInformation());

		// Let's turn the TV on
		tv.turnOn(true);

		// And now let's set the channel
		tv.setChannel(33);

		// What channel are we on?
		tv.getChannel();

		// Cops isn't on? Channel up!
		tv.channelUp();

		// And again and again and again
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();

		// Missed something
		tv.channelDown();

		// No more TV for today
		tv.turnOff(false);
		tv.getChannel();

	}

}
