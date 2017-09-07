import javax.swing.*;
import java.awt.event.*;

public class Frame2 extends Frame1
{
    private static final long serialVersionUID = 2L;
    
    JMenuBar menuBar = new JMenuBar();
    
    JMenu menuFile = new JMenu("文件(F)");
    JMenu menuEdit = new JMenu("编辑(E)");
    JMenu menuHelp = new JMenu("帮助(H)");
    
    JMenuItem menuItemFileNew = new JMenuItem("新建(N)");
    JMenuItem menuItemFileOpen = new JMenuItem("打开(O)");
    JMenuItem menuItemFileSaveAs = new JMenuItem("另存为(S)");
    JMenuItem menuItemFileExit = new JMenuItem("退出(X)");
    
    JCheckBoxMenuItem checkBoxMenuItemEditAutoWrap = new JCheckBoxMenuItem("自动换行");
    JMenuItem menuItemEditCut = new JMenuItem("剪切");
    JMenuItem menuItemEditCopy = new JMenuItem("复制");
    JMenuItem menuItemEditPaste = new JMenuItem("粘贴");
    
    JMenuItem menuItemHelpAbout = new JMenuItem("关于(A)");
    
    public Frame2()
    {
        this.setTitle("A Windows with Menu");
        initialize();
        this.setVisible(true);
    }
    
    private void initialize()
    {
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuItemFileNew.setMnemonic(KeyEvent.VK_N);
        menuItemFileOpen.setMnemonic(KeyEvent.VK_O);
        menuItemFileSaveAs.setMnemonic(KeyEvent.VK_S);
        menuItemFileExit.setMnemonic(KeyEvent.VK_X);
        menuItemHelpAbout.setMnemonic(KeyEvent.VK_A);
        
        menuItemFileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK, true));
        menuItemFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK, true));
        menuItemFileSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK, true));
        
        menuFile.add(menuItemFileNew);
        menuFile.add(menuItemFileOpen);
        menuFile.add(menuItemFileSaveAs);
        menuFile.addSeparator();
        menuFile.add(menuItemFileExit);
        
        menuEdit.add(checkBoxMenuItemEditAutoWrap);
        menuEdit.addSeparator();
        menuEdit.add(menuItemEditCut);
        menuEdit.add(menuItemEditCopy);
        menuEdit.add(menuItemEditPaste);
        
        menuHelp.add(menuItemHelpAbout);
        
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        
        this.setJMenuBar(menuBar);
        
        menuItemFileExit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });
    }
}