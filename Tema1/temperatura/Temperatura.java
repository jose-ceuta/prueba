package temperatura;

public class Temperatura{
	public static void main(String[] args) {
		/*
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("194ºF son: "+farenheitACelcius(194)+"ºC");
		System.out.println("90ºC  son: "+celciusAFarenheit(90)+"ºF");
		*/
	}	

	public static double celciusAFarenheit(double celsius){
		return ( (1.8*celsius)+32 );
	}

	public static double farenheitACelcius(double farenheit){
		return ( (farenheit-32)/1.8 );
	}
}


