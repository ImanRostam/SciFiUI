package ie.tudublin;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}

	public void reload()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Reload());
		
	}

	// public static void main(String[] args)
	// {
	// 	Main main = new Main();
	// 	main.startUI();			
	// }

	public static void main(String[] args)
	{
		Main main = new Main();
		main.reload();			
	}
}