package GUI;


import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bentsi
 */
public class GUIHandler extends JFrame {
    
    private static JFrame mainframe;
    private static JFrame createframe;
    private static JFrame printframe;

    private static JPanel mainpanel;
    private static JPanel createpanel;
    private static JPanel printpanel;
    
    public GUIHandler()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        mainframe = new JFrame();
        mainpanel = new MainPanel();
        mainframe.add(getMainpanel());
        mainframe.pack();
        mainframe.setLocationRelativeTo(null);
        
        createframe = new JFrame();
        createpanel = new CreatePanel();
        createframe.add(getCreatepanel());
        createframe.pack();
        createframe.setLocationRelativeTo(null);
        
        printframe = new JFrame();
        printpanel = new PrintPanel();
        printframe.add(getPrintpanel());
        printframe.pack();
        printframe.setLocationRelativeTo(null);
    }
    
    public static void setLayoutVisibility(JFrame show , JFrame hide)
    {
        show.setVisible(true);
        hide.setVisible(false);
    }

    /**
     * @return the mainframe
     */
    public static JFrame getMainframe() {
        return mainframe;
    }

    /**
     * @return the createframe
     */
    public static JFrame getCreateframe() {
        return createframe;
    }
    
    /**
     * @return the printframe
     */
    public static JFrame getPrintframe() {
        return printframe;
    }

    /**
     * @return the mainpanel
     */
    public static JPanel getMainpanel() {
        return mainpanel;
    }

    /**
     * @return the createpanel
     */
    public static JPanel getCreatepanel() {
        return createpanel;
    }

    /**
     * @return the printpanel
     */
    public static JPanel getPrintpanel() {
        return printpanel;
    }
    
}
