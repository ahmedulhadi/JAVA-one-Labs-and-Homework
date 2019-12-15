public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int hours=14;
        int minutes=13;
        int seconds=15;
        
        int secInMin = 60;
        int secInhr = 60*secInMin;
        int secInDay = 24 * secInhr;
        
        int secondsSinceMidnight = hours*secInhr + minutes*secInMin + seconds;
        
        System.out.println("Seconds since midnight= " + secondsSinceMidnight);
        
        int totalSecInDay=24*60*60;
        int SecRemIDay= totalSecInDay-secondsSinceMidnight; 
        
        System.out.println("Seconds remainig in the day= "+SecRemIDay);
        
        int fullMinElabsed=secondsSinceMidnight/60; 
        System.out.println("Full Minutes elapsed= "+fullMinElabsed);
	}

}