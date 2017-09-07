import javax.swing.*;
import java.awt.event.*;

public class Frame3 extends Frame2
{
    private static final long serialVersionUID = 3L;
    JPopupMenu popupMenu = new JPopupMenu();
    
    JMenuItem popupMenuItemCut = new JMenuItem("剪切");
    JMenuItem popupMenuItemCopy = new JMenuItem("复制");
    JMenuItem popupMenuItemPaste = new JMenuItem("粘贴");
    
    public Frame3()
    {
        this.setTitle("Add Popup Menu");
        initialize();
    }
    
    private void initialize()
    {
        popupMenu.add(popupMenuItemCut);
        popupMenu.add(popupMenuItemCopy);
        popupMenu.add(popupMenuItemPaste);
        
        String os=System.getProperty("os.name").toLowerCase();
        
        if (os.indexOf("nux")>=0||os.indexOf("nix")>=0)
        {
            //JOptionPane.showMessageDialog(null,"Linux Mouse Listener Actived");
            textArea.addMouseListener(new MouseAdapter()
            {
                public void mousePressed(MouseEvent e)
                {
                    if (e.isPopupTrigger())
                    {
                        popupMenu.show(textArea, e.getX(), e.getY());
                    }
                }
            });
        }
        else if (os.indexOf("win")>=0)
        {
            //JOptionPane.showMessageDialog(null,"Windows Mouse Listener Actived");
            textArea.addMouseListener(new MouseAdapter()
            {
                public void mouseReleased(MouseEvent e)
                {
                    if (e.isPopupTrigger())
                    {
                        popupMenu.show(textArea, e.getX(), e.getY());
                    }
                }
            });
        }
        else
        {
            //JOptionPane.showMessageDialog(null,"Neither Linux nor Windows Mouse Listener Actived");
            textArea.addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                {
                    if (e.isPopupTrigger())
                    {
                        popupMenu.show(textArea, e.getX(), e.getY());
                    }
                }
            });
        }
    }
}
