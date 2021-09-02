package Quiz;

import java.awt.Color;

public class TV {
	private int ch, sound;
	private Color color = new Color(0);
	public int getCh() {
		return ch;
	}
	public int getSound() {
		return sound;
	}
	public Color getColor() {
		return color;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public void setSound(int sound) {
		this.sound = sound;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void ChUP() {
		ch++;
		ch%=250; // 249번 까지 있음.
	}
	public void ChDOWN() {
		ch--;
		if(ch==-1) ch=249; 
	}
	public void SoundUP() {
		if(sound<100) sound++;
	}
	public void SoundDOWN() {
		if(sound>0) sound--;
	}
}
