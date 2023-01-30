
package guicoolness;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUI implements ActionListener{
    private static JPanel panel;
    private static JFrame frame;
    private static JTextField userText;
    private static JLabel userlabel;
    private static JLabel passlabel;
    private static JPasswordField passwordText; 
    private static JButton button; 
    private static JLabel success; 
    private static JLabel failure; 
    
    
    
    
    
    public static void main(String[] args) {
         panel = new JPanel(); 
         frame = new JFrame(); 
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel); 
        
        panel.setLayout(null);
        userlabel = new JLabel("User"); 
        userlabel.setBounds(10,20,80,25); 
        panel.add(userlabel);
        
        passlabel = new JLabel("Password"); 
        passlabel.setBounds(10,50,80,25); 
        panel.add(passlabel);
        
        passwordText = new JPasswordField(20); 
        panel.add(passwordText); 
        passwordText.setBounds(100,50,165,25);
        
        userText = new JTextField(20); 
        panel.add(userText); 
        
        button = new JButton("Login"); 
        button.setBounds(10,80,80,25);
        panel.add(button); 
        button.addActionListener(new GUI()); 
        
        userText.setBounds(100,20,165,25);
        frame.setVisible(true); 
        
        success = new JLabel(""); 
        success.setBounds(10,110,300,20);
        panel.add(success);
        
        failure = new JLabel(""); 
        success.setBounds(10,110,300,20);
        panel.add(failure);
        

    }
    
    public void actionPerformed(ActionEvent e){
        int attempt = 0; 
        
        String user = userText.getText();
        String password = passwordText.getText(); 
        
        if (user.equals("Amber") && password.equals("fuk")){
            success.setText("Successs"); 
        }else{
            for(int i = 0; i < 3; i++ ){
                success.setText("Please try again"); 
                attempt++; 
                if(attempt == 3){
                    failure.setText("Over attempt"); 
                
            }
            }
            
            
        }
        
        
                
        
    }
    
    
    
    
}
