package osgi_calculator;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import osgimath.ConvertService;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		this.createPanel(context);

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

	public void createPanel(BundleContext context) {
		JFrame f = new JFrame();// creating instance of JFrame
		JLabel l1, l2, l3;
		JTextField t1, t2, t3;

		l1 = new JLabel("Birinci Sayý");
		l2 = new JLabel("Ýkinci Sayý");
		l3 = new JLabel("Sonuç");

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		l1.setBounds(50, 50, 100, 30);
		l2.setBounds(50, 100, 100, 30);
		l3.setBounds(50, 150, 100, 30);

		t1.setBounds(150, 50, 500, 30);
		t2.setBounds(150, 100, 500, 30);
		t3.setBounds(150, 150, 500, 30);

		JButton b = new JButton("Topla");// creating instance of JButton
		JButton c = new JButton("Çýkar");
		JButton d = new JButton("Çarp");
		JButton g = new JButton("Böl");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();

				ServiceReference<?> serviceReference = context.getServiceReference(ConvertService.class);
				ConvertService service = (ConvertService) context.getService(serviceReference);
				// Locale lang = Locale.getDefault();
				long x = service.parseTrString(s1);
				long y = service.parseTrString(s2);
				long z = x + y;
				if (z < 1000) {
					System.out.println(z);
					String m = service.convertLessThanOneThousandTurkishNumber((int) z);
					t3.setText(m);

				} else {
					String n = service.convertTurkishNumber(z);
					t3.setText(n);
					System.out.println(n);
				}
			}
		});

		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				ServiceReference<?> serviceReference = context.getServiceReference(ConvertService.class);
				ConvertService service = (ConvertService) context.getService(serviceReference);
				long x = service.parseTrString(s1);
				long y = service.parseTrString(s2);
				long z = x - y;
				if (z < 1000) {
					System.out.println(z);
					String m = service.convertLessThanOneThousandTurkishNumber((int) z);
					t3.setText(m);

				} else {
					String n = service.convertTurkishNumber(z);
					t3.setText(n);
					System.out.println(n);
				}
			}

		});

		d.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();

				ServiceReference<?> serviceReference = context.getServiceReference(ConvertService.class);
				ConvertService service = (ConvertService) context.getService(serviceReference);
				long x = service.parseTrString(s1);
				long y = service.parseTrString(s2);
				long z = x * y;
				if (z < 1000) {
					System.out.println(z);
					String m = service.convertLessThanOneThousandTurkishNumber((int) z);
					t3.setText(m);

				} else {
					String n = service.convertTurkishNumber(z);
					t3.setText(n);
					System.out.println(n);
				}

			}

		});

		g.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				ServiceReference<?> serviceReference = context.getServiceReference(ConvertService.class);
				ConvertService service = (ConvertService) context.getService(serviceReference);
				long x = service.parseTrString(s1);
				long y = service.parseTrString(s2);
				long z = x / y;
				if (z < 1000) {
					System.out.println(z);
					String m = service.convertLessThanOneThousandTurkishNumber((int) z);
					t3.setText(m);
					
				} else {
					String n = service.convertTurkishNumber(z);
					t3.setText(n);
					System.out.println(n);
				}
				
			}

		});

		b.setBounds(100, 400, 100, 40);// x axis, y axis, width, height
		c.setBounds(300, 400, 100, 40);// x axis, y axis, width, height
		d.setBounds(500, 400, 100, 40);// x axis, y axis, width, height
		g.setBounds(700, 400, 100, 40);// x axis, y axis, width, height

		f.add(b);// adding button in JFrame
		f.add(c);
		f.add(d);
		f.add(g);

		f.add(l1);
		f.add(l2);
		f.add(l3);

		f.add(t1);
		f.add(t2);
		f.add(t3);

		f.setSize(900, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible

	}

}
