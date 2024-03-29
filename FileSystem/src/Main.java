import javax.sound.sampled.*;
import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("secret_message.txt");

		if(file.exists()) {
			System.out.println("That file exists! :o!");
			System.out.println("File is here: " + file.getPath());
			System.out.println("Absolutely here: " + file.getAbsolutePath());
		} else {
			System.out.println("That file doesn't exist :(");
		}

		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \nViolets are blue \n Booty booty booty booty\nRockin' everywhere!");
			writer.append("\n(a poem by bro..)");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileReader filereader = new FileReader("art.txt");

			int data = filereader.read();

			while (data != -1) {
				System.out.print((char) data);
				data = filereader.read();
			}

			filereader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Audio
		Scanner sc = new Scanner(System.in);

		File audioFile = new File("drama-strings.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);

		String response = "";

		while(!response.equals("Q")) {
			System.out.println("P = play, S = stop, R = reset, Q = quit");

			response = sc.next();
			response = response.toUpperCase();

			switch (response) {
				case ("P"):
					clip.start();
					break;
				case ("S"):
					clip.stop();
					break;
				case ("R"):
					clip.setMicrosecondPosition(0);
					break;
				case ("Q"):
					clip.close();
					break;
				default:
					System.out.println("Not a valid response");
			}
		}
	}
}
