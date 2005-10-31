package prueba;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import javax.swing.JTabbedPane;
//import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;

public class GtalTienda extends JFrame {

	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenuItem savejMenuItem = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel jPanel = null;
	private JPanel jPanel1 = null;
	private JPanel jPanel2 = null;
	private JSplitPane eleccionjSplitPane = null;
	private JButton jButton1 = null;
	private JButton jButton = null;
	private JSplitPane eleccionDjSplitPane = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private JSplitPane sVentajSplitPane = null;
	private JSplitPane leftjSplitPane = null;
	private JSplitPane rightjSplitPane = null;
	private JSplitPane topLjSplitPane = null;
	private JSplitPane topRjSplitPane = null;
	private JSplitPane bottomLjSplitPane = null;
	private JSplitPane bottomRjSplitPane = null;
	private JTextField leftTLjTextField = null;
	private JTextField rightTLjTextField = null;
	private JTextField leftTRjTextField = null;
	private JTextField rightTRjTextField = null;
	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.setPreferredSize(new java.awt.Dimension(321,21));
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setName("File");
			jMenu.setPreferredSize(new java.awt.Dimension(35,19));
			jMenu.setText("File");
			jMenu.setActionCommand("File");
			jMenu.add(getSavejMenuItem());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getSavejMenuItem() {
		if (savejMenuItem == null) {
			savejMenuItem = new JMenuItem();
			savejMenuItem.setActionCommand("Save");
			savejMenuItem.setText("Save");
			savejMenuItem.setPreferredSize(new java.awt.Dimension(85,21));
			savejMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
					Event.CTRL_MASK, true));
		}
		return savejMenuItem;
	}

	/**
	 * This method initializes jTabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setName("Opciones");
			jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.TOP);
			jTabbedPane.setPreferredSize(new java.awt.Dimension(50,27));
			jTabbedPane.addTab("Venta", null, getJPanel(), null);
			jTabbedPane.addTab("Stock", null, getJPanel2(), null);
			jTabbedPane.addTab("Devolucion", null, getJPanel1(), null);
		}
		return jTabbedPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BorderLayout());
			jPanel.setPreferredSize(new java.awt.Dimension(1292,30));
			jPanel.setName("Venta");
			jPanel.add(getEleccionjSplitPane(), java.awt.BorderLayout.SOUTH);
			jPanel.add(getSVentajSplitPane(), java.awt.BorderLayout.NORTH);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.add(getEleccionDjSplitPane(), java.awt.BorderLayout.SOUTH);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
		}
		return jPanel2;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getEleccionjSplitPane() {
		if (eleccionjSplitPane == null) {
			eleccionjSplitPane = new JSplitPane();
			eleccionjSplitPane.setDividerSize(5);
			eleccionjSplitPane.setPreferredSize(new java.awt.Dimension(1292,30));
			eleccionjSplitPane.setOneTouchExpandable(false);
			eleccionjSplitPane.setRightComponent(getJButton1());
			eleccionjSplitPane.setLeftComponent(getJButton());
			int j = this.getBounds().width;
			j= j/2;
			eleccionjSplitPane.setDividerLocation(646);
		}
		return eleccionjSplitPane;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Cancelar");
			jButton1.setPreferredSize(new java.awt.Dimension(646,25));
			jButton1.setToolTipText("La venta aun no se puede formalizar");
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setName("");
			jButton.setToolTipText("La venta ya esta lista para formalizar");
			jButton.setPreferredSize(new java.awt.Dimension(646,25));
			jButton.setText("Venta");
		}
		return jButton;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getEleccionDjSplitPane() {
		if (eleccionDjSplitPane == null) {
			eleccionDjSplitPane = new JSplitPane();
			eleccionDjSplitPane.setDividerSize(5);
			eleccionDjSplitPane.setPreferredSize(new java.awt.Dimension(1292,30));
			eleccionDjSplitPane.setLeftComponent(getJButton2());
			eleccionDjSplitPane.setRightComponent(getJButton3());
			int j = this.getBounds().width;
			j= j/2;
			eleccionDjSplitPane.setDividerLocation(646);
			
		}
		return eleccionDjSplitPane;
	}

	/**
	 * This method initializes jButton2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setPreferredSize(new java.awt.Dimension(646,30));
			jButton2.setToolTipText("La devolución se hara efectiva ahora");
			jButton2.setText("Devolución");
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setPreferredSize(new java.awt.Dimension(641,30));
			jButton3.setToolTipText("Para rechazar la devolución");
			jButton3.setText("Cancelar");
		}
		return jButton3;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getSVentajSplitPane() {
		if (sVentajSplitPane == null) {
			sVentajSplitPane = new JSplitPane();
			sVentajSplitPane.setDividerSize(10);
			sVentajSplitPane.setPreferredSize(new java.awt.Dimension(0,80));
			sVentajSplitPane.setLeftComponent(getLeftjSplitPane());
			sVentajSplitPane.setRightComponent(getRightjSplitPane());
			int j = this.getBounds().width;
			j= j/2;
			sVentajSplitPane.setDividerLocation(j);
		}
		return sVentajSplitPane;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getLeftjSplitPane() {
		if (leftjSplitPane == null) {
			leftjSplitPane = new JSplitPane();
			//int i=sVentajSplitPane.getY();
			leftjSplitPane.setPreferredSize(new java.awt.Dimension(0,80));
			leftjSplitPane.setDividerLocation(45);
			leftjSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
			leftjSplitPane.setDividerSize(3);
			leftjSplitPane.setBottomComponent(getBottomLjSplitPane());
			leftjSplitPane.setTopComponent(getTopLjSplitPane());
		}
		return leftjSplitPane;
	}

	/**
	 * This method initializes jSplitPane1	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getRightjSplitPane() {
		if (rightjSplitPane == null) {
			rightjSplitPane = new JSplitPane();
			rightjSplitPane.setDividerLocation(45);
			rightjSplitPane.setPreferredSize(new java.awt.Dimension(646,80));
			rightjSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
			rightjSplitPane.setTopComponent(getTopRjSplitPane());
			rightjSplitPane.setDividerSize(3);
			rightjSplitPane.setBottomComponent(getBottomRjSplitPane());
		}
		return rightjSplitPane;
	}

	/**
	 * This method initializes jSplitPane2	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getTopLjSplitPane() {
		if (topLjSplitPane == null) {
			topLjSplitPane = new JSplitPane();
			topLjSplitPane.setDividerSize(10);
			topLjSplitPane.setLeftComponent(getLeftTLjTextField());
			topLjSplitPane.setRightComponent(getRightTLjTextField());
			int i = topLjSplitPane.getWidth();		
			i=i/2;
			topLjSplitPane.setPreferredSize(new java.awt.Dimension(0,35));
			topLjSplitPane.setDividerLocation(i);
		
		}
		return topLjSplitPane;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getTopRjSplitPane() {
		if (topRjSplitPane == null) {
			topRjSplitPane = new JSplitPane();
			int i = topRjSplitPane.getWidth();		
			i=i/2;
			topRjSplitPane.setDividerLocation(323);
			topRjSplitPane.setPreferredSize(new java.awt.Dimension(646,35));
			topRjSplitPane.setLeftComponent(getLeftTRjTextField());
			topRjSplitPane.setDividerSize(10);
			topRjSplitPane.setRightComponent(getRightTRjTextField());
		}
		return topRjSplitPane;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getBottomLjSplitPane() {
		if (bottomLjSplitPane == null) {
			bottomLjSplitPane = new JSplitPane();
			int i = bottomLjSplitPane.getWidth();		
			i=i/2;
			int j = leftjSplitPane.getHeight();
			j=j/2;
			bottomLjSplitPane.setDividerLocation(323);
			bottomLjSplitPane.setPreferredSize(new java.awt.Dimension(646,39));
			bottomLjSplitPane.setDividerSize(10);
		}
		return bottomLjSplitPane;
	}

	/**
	 * This method initializes jSplitPane	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getBottomRjSplitPane() {
		if (bottomRjSplitPane == null) {
			bottomRjSplitPane = new JSplitPane();
			bottomRjSplitPane.setDividerSize(10);			
			int i = bottomRjSplitPane.getWidth();		
			i=i/2;
			int j = rightjSplitPane.getHeight();
			j=j/2;
			bottomRjSplitPane.setDividerLocation(323);
			bottomRjSplitPane.setPreferredSize(new java.awt.Dimension(646,39));
		}
		return bottomRjSplitPane;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getLeftTLjTextField() {
		if (leftTLjTextField == null) {
			leftTLjTextField = new JTextField();
			leftTLjTextField.setText("Nombre");
			leftTLjTextField.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
			leftTLjTextField.setForeground(java.awt.Color.black);
			leftTLjTextField.setBackground(java.awt.SystemColor.control);
			leftTLjTextField.setEditable(false);
			int i = topLjSplitPane.getWidth();
			i = i/2;
			leftTLjTextField.setPreferredSize(new java.awt.Dimension(i,35));
			leftTLjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		}
		return leftTLjTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getRightTLjTextField() {
		if (rightTLjTextField == null) {
			rightTLjTextField = new JTextField();
			rightTLjTextField.setBackground(java.awt.SystemColor.control);
			rightTLjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
			rightTLjTextField.setForeground(java.awt.Color.black);
			rightTLjTextField.setText("Cod. Producto");
			rightTLjTextField.setEditable(false);
			int i = topLjSplitPane.getWidth();
			i = i/2;
			rightTLjTextField.setPreferredSize(new java.awt.Dimension(i,35));
			rightTLjTextField.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
		}
		return rightTLjTextField;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getLeftTRjTextField() {
		if (leftTRjTextField == null) {
			leftTRjTextField = new JTextField();
			leftTRjTextField.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
			leftTRjTextField.setForeground(java.awt.Color.black);
			leftTRjTextField.setText("Precio");
			leftTRjTextField.setBackground(java.awt.SystemColor.control);
			leftTRjTextField.setEditable(false);
			int i = topRjSplitPane.getWidth();
			i = i/2;
			leftTRjTextField.setPreferredSize(new java.awt.Dimension(318,35));
			leftTRjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		}
		return leftTRjTextField;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getRightTRjTextField() {
		if (rightTRjTextField == null) {
			rightTRjTextField = new JTextField();
			rightTRjTextField.setEditable(false);
			rightTRjTextField.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
			rightTRjTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
			rightTRjTextField.setText("Cantidad");
			int i = topRjSplitPane.getWidth();
			i = i/2;
			rightTRjTextField.setPreferredSize(new java.awt.Dimension(318,35));
			rightTRjTextField.setBackground(java.awt.SystemColor.control);
		}
		return rightTRjTextField;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GtalTienda ventana = new GtalTienda();
		ventana.show();
	}

	/**
	 * This is the default constructor
	 */
	public GtalTienda() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(809, 536);
		//this.setPreferredSize(new java.awt.Dimension(802,519));
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		this.setContentPane(getJTabbedPane());
		this.setJMenuBar(getJJMenuBar());
		this.setName("GtalTienda");
		this.setTitle("Tienda - Menu Principal ");
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.out.println("Vas a salir de la aplicación"); // TODO Auto-generated Event stub windowClosing()
			}
		});
	}

}  //  @jve:decl-index=0:visual-constraint="42,10"
