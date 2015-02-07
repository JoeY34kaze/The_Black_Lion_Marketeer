package joey34Kaze;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main {
	private JFrame_Joey34Kaze jframe_Joey34kaze;
	private JMenu mnNewMenu;
	private JMenu mnFile;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.jframe_Joey34kaze.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jframe_Joey34kaze = new JFrame_Joey34Kaze();
		jframe_Joey34kaze.setBounds(100, 100, 835, 503);
		jframe_Joey34kaze.setDefaultCloseOperation(JFrame_Joey34Kaze.EXIT_ON_CLOSE);
		jframe_Joey34kaze.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JTabbedPane_Joey34kaze tabbedPane_Joey34kaze = new JTabbedPane_Joey34kaze();
		jframe_Joey34kaze.getContentPane().add(tabbedPane_Joey34kaze, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		jframe_Joey34kaze.setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
		mnFile.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Save");
		mnFile.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Save as");
		mnFile.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mnFile.add(mntmNewMenuItem_3);
		
		mnNewMenu = new JMenu("Edit");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Extra1");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Extra2");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		menuBar.add(mnNewMenu_3);
	}
}
