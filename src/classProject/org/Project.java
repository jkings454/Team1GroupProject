package classProject.org;

import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class Project {

	private JFrame frame;
	private String fileName;
	ArrayList<Contact> contactList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
	}
	

	public void openFile()
	{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(frame);
		if(result == JFileChooser.CANCEL_OPTION)
			System.exit(1);
		Path filePath = fileChooser.getSelectedFile().toPath();
		fileName = filePath.toString();
		openList = (ArrayList<BusinessContact>) ser.deSerialize(fileName);
		if(openList.size() == 0)
		{
			JOptionPane.showMessageDialog(frame, "Invalid File");
			textPhone.getCaretPosition();
			fileLoaded = false;
		}
		else
		{
			fileLoaded = true;
		}
	}
	public void serialize (List<BusinessContact> pList, String fileName)
	{
		try(ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(pList);
		}catch (IOException ex){
			System.out.println("A problem occured during serialization");
			System.out.println(ex.getMessage());
		}
	}

	public List<BusinessContact> deSerialize(String fileName){
		List<BusinessContact> pList = null;
		try(ObjectInputStream in = 
				new ObjectInputStream(new FileInputStream(fileName))){
			pList = (List<BusinessContact>)in.readObject();
		}catch (IOException | ClassNotFoundException ex){
			System.out.printf("A problem occured during deserialization %s%n",fileName);
			System.out.println(ex.getMessage()); 
		}
		return pList;
	}
}
