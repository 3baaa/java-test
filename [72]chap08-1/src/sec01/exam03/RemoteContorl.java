package sec01.exam03;

public interface RemoteContorl {
	public int MAX_VAOLUME=10;
	public int MIN_VOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
