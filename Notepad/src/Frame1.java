import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame
{
    private static final long serialVersionUID = 1L;
    JToolBar toolBar = new JToolBar("工具栏");
    ImageIcon iconCut = new ImageIcon("img/cut.gif");
    ImageIcon iconCopy = new ImageIcon("img/copy.gif");
    ImageIcon iconPaste = new ImageIcon("img/paste.gif");
    JButton buttonCut = new JButton("剪切", iconCut);
    JButton buttonCopy = new JButton("复制", iconCopy);
    JButton buttonPaste = new JButton("粘贴", iconPaste);
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    public Frame1()
    {
        this.setTitle("A Windows with Toolbar");
        this.setBounds(100, 200, 240, 220);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
        this.setVisible(true);
    }
    
    private void initialize()
    {
        buttonCut.setToolTipText("剪切所选字符到剪贴板");
        buttonCopy.setToolTipText("复制所选字符到剪贴板");
        buttonPaste.setToolTipText("粘贴剪贴板的内容");
        toolBar.add(buttonCut);
        toolBar.add(buttonCopy);
        toolBar.add(buttonPaste);
        this.add(toolBar, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }
}
