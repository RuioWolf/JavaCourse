import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Frame4 extends Frame3
{
    private static final long serialVersionUID = 4L;
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("文本文件", "txt");
    File file, txtfile;
    
    public Frame4()
    {
        this.setTitle("简易记事本");
        this.setBounds(100, 200, 350, 320);
        initialize();
    }
    
    private void initialize()
    {
        buttonCut.addActionListener(new ActionHandler());
        buttonCopy.addActionListener(new ActionHandler());
        buttonPaste.addActionListener(new ActionHandler());
        
        menuItemFileNew.addActionListener(new ActionHandler());
        menuItemFileOpen.addActionListener(new ActionHandler());
        menuItemFileSaveAs.addActionListener(new ActionHandler());
        
        checkBoxMenuItemEditAutoWrap.addActionListener(new ActionHandler());
        menuItemEditCut.addActionListener(new ActionHandler());
        menuItemEditCopy.addActionListener(new ActionHandler());
        menuItemEditPaste.addActionListener(new ActionHandler());
        
        menuItemHelpAbout.addActionListener(new ActionHandler());
        
        popupMenuItemCut.addActionListener(new ActionHandler());
        popupMenuItemCopy.addActionListener(new ActionHandler());
        popupMenuItemPaste.addActionListener(new ActionHandler());
        
        fileChooser.setFileFilter(fileFilter);
    }
    
    class ActionHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == buttonCut || e.getSource() == menuItemEditCut || e.getSource() == popupMenuItemCut)
            {
                textArea.cut();
            }
            else if (e.getSource() == buttonCopy || e.getSource() == menuItemEditCopy || e.getSource() == popupMenuItemCopy)
            {
                textArea.copy();
            }
            else if (e.getSource() == buttonPaste || e.getSource() == menuItemEditPaste || e.getSource() == popupMenuItemPaste)
            {
                textArea.paste();
            }
            else if (e.getSource() == menuItemFileNew)
            {
                newFile();
            }
            else if (e.getSource() == menuItemFileOpen)
            {
                openFile();
            }
            else if (e.getSource() == menuItemFileSaveAs)
            {
                saveAsFile();
            }
            else if (e.getSource() == checkBoxMenuItemEditAutoWrap)
            {
                if (checkBoxMenuItemEditAutoWrap.isSelected())
                {
                    textArea.setLineWrap(true);
                }
                else
                {
                    textArea.setLineWrap(false);
                }
            }
            else if (e.getSource() == menuItemHelpAbout)
            {
                JOptionPane.showMessageDialog(null, "程序设计：Ruio\n2017年07月");
            }
        }
    }
    
    void newFile()
    {
        if (!textArea.getText().equals(""))
        {
            saveFile();
        }
        textArea.setText(null);
        file = null;
        this.setTitle("简易记事本");
    }
    
    void openFile()
    {
        if (!textArea.getText().equals(""))
            saveFile();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            file = fileChooser.getSelectedFile();
            try
            {
                FileReader fr = new FileReader(file);
                textArea.read(fr, null);
                this.setTitle(file.getName() + " - 简易记事本");
                fr.close();
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, "异常: " + e.getMessage());
            }
        }
    }
    
    void saveFile()
    {
        if (file != null && file.exists())
        {
            try
            {
                FileWriter fw = new FileWriter(file);
                textArea.write(fw);
                fw.close();
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, "异常: " + e.getMessage());
            }
        }
        else
        {
            saveAsFile();
        }
    }
    
    void saveAsFile()
    {
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION)
        {
            file = fileChooser.getSelectedFile();
//            JOptionPane.showMessageDialog(null,file.getAbsolutePath());
            if (file.getAbsolutePath().toUpperCase().endsWith(".txt".toUpperCase()))
            {
                txtfile = file;
            }
            else
            {
                txtfile = new File(file.getAbsolutePath() + ".txt");
                file = txtfile;
                txtfile = null;
            }
//            JOptionPane.showMessageDialog(null,file.getAbsolutePath());
            try
            {
                FileWriter fw = new FileWriter(file);
                textArea.write(fw);
                this.setTitle(file.getName() + " - 简易记事本");
                fw.close();
            }
            catch (IOException e)
            {
                JOptionPane.showMessageDialog(this, "异常: " + e.getMessage());
            }
        }
    }
}
