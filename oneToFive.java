/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number_Shuffle;

import javax.swing.JButton;

public class oneToFive {
    
    //Shuffle numbers arrangement
    private final String[] shf0 = {"1", "2", "3", "4", "5"};
    private final String[] shf1 = {"5", "2", "4", "1", "3"};
    private final String[] shf2 = {"3", "1", "4", "5", "2"};
    private final String[] shf3 = {"2", "4", "5", "1", "3"};
    private final String[] shf4 = {"1", "3", "2", "4", "5"};
    private final String[] shf5 = {"4", "5", "1", "3", "2"};

    
    //Shuffeled numbers to be used on JButtons
    public void OnButtons(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5){
        
        //Generate random number
        int random = (int) (Math.random()*6);
        
        switch(random) {
            
            case 0:
                btn1.setText(shf0[0]);
                btn2.setText(shf0[1]);
                btn3.setText(shf0[2]);
                btn4.setText(shf0[3]);
                btn5.setText(shf0[4]);
                break;
                
            case 1:
                btn1.setText(shf1[0]);
                btn2.setText(shf1[1]);
                btn3.setText(shf1[2]);
                btn4.setText(shf1[3]);
                btn5.setText(shf1[4]);
                break;
            
            case 2:
                btn1.setText(shf2[0]);
                btn2.setText(shf2[1]);
                btn3.setText(shf2[2]);
                btn4.setText(shf2[3]);
                btn5.setText(shf2[4]);
                break;
                
            case 3:
                btn1.setText(shf3[0]);
                btn2.setText(shf3[1]);
                btn3.setText(shf3[2]);
                btn4.setText(shf3[3]);
                btn5.setText(shf3[4]);
                break;
                
            case 4:
                btn1.setText(shf4[0]);
                btn2.setText(shf4[1]);
                btn3.setText(shf4[2]);
                btn4.setText(shf4[3]);
                btn5.setText(shf4[4]);
                break;
                
            case 5:
                btn1.setText(shf5[0]);
                btn2.setText(shf5[1]);
                btn3.setText(shf5[2]);
                btn4.setText(shf5[3]);
                btn5.setText(shf5[4]);
                break;
                
        
        }
    
    }
    
    
}
