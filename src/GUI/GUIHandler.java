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
    
    JPanel mainpanel;
    JPanel createpanel;
    
    public GUIHandler()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        mainframe = new JFrame();
        mainpanel = new MainPanel();
        mainframe.add(mainpanel);
        mainframe.pack();
        mainframe.setLocationRelativeTo(null);
        
        createframe = new JFrame();
        createpanel = new CreatePanel();
        createframe.add(createpanel);
        createframe.pack();
        createframe.setLocationRelativeTo(null);
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
    
    
    
}
