package package01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;

public class StartFrame extends JFrame implements ActionListener{
	public static final long serialVersionUID = 1L;
	public static StartFrame frame;
	public  JButton btnNewButton;
	public  JButton btnNewButton_1;
	public  JPanel contentPane;
	public JPanel panel;
	public JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * �X�^�[�g��ʂ̃t���[�����쐬
	 */
	public StartFrame()
	{
		//初期設定
		setTitle("\u30B2\u30FC\u30E0\u30BF\u30A4\u30C8\u30EB\uFF08\u4EEE\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//初期設定終

		//ラベル
		JLabel lblNewLabel = new JLabel("\u30B2\u30FC\u30E0\u30BF\u30A4\u30C8\u30EB\uFF08\u4EEE\uFF09");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setEnabled(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HGP�n�p�p�޼��UB", Font.PLAIN, 60));
		lblNewLabel.setBounds(332, 254, 600, 80);
		contentPane.add(lblNewLabel);
		//ラベル終

		//スタートボタン
		btnNewButton = new JButton("\u30B2\u30FC\u30E0\u30B9\u30BF\u30FC\u30C8");
		btnNewButton.setFont(new Font("HGP�n�p�p�޼��UB", Font.PLAIN, 24));
		btnNewButton.setBounds(332, 409,250, 28);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		//スタートボタン終

		//ランキングボタン
		btnNewButton_1 = new JButton("\u30E9\u30F3\u30AD\u30F3\u30B0");
		btnNewButton_1.setFont(new Font("HGP�n�p�p�޼��UB", Font.PLAIN, 24));
		btnNewButton_1.setBounds(752, 409, 180, 28);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		//ランキングボタン終

		//第2パネル設定
		panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel);
		//第2パネル設定終

		//説明用ラベル
		lblNewLabel_1 = new JLabel("説明");
		lblNewLabel_1.setSize(100, 100);
		lblNewLabel_1.setLocation(100, 100);
		panel.add(lblNewLabel_1);
		//説明用ラベル終
	}
	public void actionPerformed(ActionEvent e)
	{
		Object b=e.getSource();
		if(b.equals(btnNewButton))
		{
			//スタートボタンの処理(一定時間説明表示)
			contentPane.setVisible(false);
			frame.setContentPane(panel);
			TimerTask task=new Timers();
			Timer timer=new Timer();
			timer.schedule(task,TimeUnit.SECONDS.toMillis(5));
		}
		else if(b.equals(btnNewButton_1))
		{
			//ランキングボタンの処理
			frame.setVisible(false);
			//ランキングフレームへの移動処理
			RankingFrame.main(null);
		}
	}
}
