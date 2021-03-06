package package01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class PlayerNameFrame extends JFrame implements ActionListener{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public static PlayerNameFrame frame;
	public String name;//PlayerNameSave

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new PlayerNameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlayerNameFrame() {
		setTitle("\u30B2\u30FC\u30E0\u30BF\u30A4\u30C8\u30EB\uFF08\u4EEE\uFF09\u3000\uFF5E\u30D7\u30EC\u30A4\u30E4\u30FC\u60C5\u5831\u5165\u529B\uFF5E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u30D7\u30EC\u30A4\u30E4\u30FC\u540D\u3092\u5165\u529B\u3057\u3066\u304F\u3060\u3055\u3044\u3002");
		lblNewLabel.setFont(new Font("HGS?n?p?p?????", Font.PLAIN, 16));
		lblNewLabel.setBounds(150, 140, 1000, 20);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("MS UI Gothic", Font.PLAIN, 28));
		textField.setBounds(240, 170, 500, 50);
		contentPane.add(textField);
		textField.setColumns(10);


		JButton btnNewButton = new JButton("\u6C7A\u5B9A");
		btnNewButton.setBounds(752, 170, 91, 50);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		name =textField.getText();
		System.out.println(name);
		DepartmentFrame.main(null);
		frame.setVisible(false);

	}
}
