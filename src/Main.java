import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Map");
		Map map = new Map(800, 800, 32, 32);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setContentPane(map);
		frame.pack();
		
		map.genMap();
		while(true) {
			map.draw(map.getGraphics());
		}
	}
	
}