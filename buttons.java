import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Input Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.yellow);


        JTextField textField = new JTextField();
        textField.setBounds(25, 50, 200, 30);

        JTextField textField2 = new JTextField();
        textField2.setBounds(25,25,200,30);

        JButton button = new JButton("Submit grade");
        button.setBounds(225,50, 150,30);
        

        JLabel label = new JLabel("Enter class grades for class number 1 in bottom box");
        JLabel label4 = new JLabel ("If class is AP or Honor enter in top box");
        label4.setBounds(50,0,350,300);
        label.setBounds(50, 100, 300, 30); 
        JLabel label2 = new JLabel("");
        JLabel label3 = new JLabel("Congrats on getting a perfect GPA");


        label2.setBounds(50,100,300,30);
        button.addActionListener(new ActionListener() {
            int classes_inputed;
            double grades = 0;
            @Override
            public void actionPerformed(ActionEvent e) {

                while (classes_inputed<7) {
                    
                        String input = textField2.getText();
                        String input2 = textField.getText();
                        classes_inputed++;
                        
                        if(input.equals("A") || input.equals("a") || input.equals("A+") || input.equals("a+")) {
                                grades = grades + 4;

                                if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                    grades++;


                                }

                                else if (input2.equals("honor") || input2.equals ("Honor")) {
                                    grades = grades + 0.5;

                                
                                }

                            }

                            if (input.equals("B") || input.equals("b")) {
                                grades = grades + 3;

                                if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                    grades++;


                                }

                                if (input2.equals("honor") || input2.equals ("Honor")) {
                                    grades = grades + 0.5;

                                
                                }

                            }

                            if (input.equals("c") || input.equals ("C")) {
                                grades = grades + 2;

                                
                                if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                    grades++;


                                }

                                if (input2.equals("honor") || input2.equals ("Honor")) {
                                    grades = grades + 0.5;

                                
                                }
                            }
                        

                            if (input.equals("d") || input.equals ("D")) {
                                grades++;

                                
                                if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                    grades++;


                                }

                                if (input2.equals("honor") || input2.equals ("Honor")) {
                                     grades = grades + 0.5;

                                
                                }

                            }

                            if (input.equals("f") || input.equals("F") || input.equals ("f+") || input.equals("F+") || input.equals("f-") || input.equals("F-")) {
                                grades = grades + 0;

                                
                            }

                            if (input.equals("A-") || input.equals ("a-")) {
                                grades = grades + 3.7;

                                
                                if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                    grades++;


                                }

                                if (input2.equals("honor") || input2.equals ("Honor")) {
                                    grades = grades + 0.5;

                                
                                }

                                if (input.equals("B+") || input.equals ("b+")) {
                                    grades = grades + 3.3;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                                if (input.equals("b-") || input.equals ("B-")) {
                                    grades=grades + 2.7;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                                if (input.equals("C+") || input.equals ("c+")) {
                                    grades=grades + 2.3;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                                if (input.equals("c-") || input.equals ("C-")) {
                                    grades=grades+ 1.7;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                                if (input.equals("D+") || input.equals ("d+")) {
                                    grades = grades + 1.3;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                                if (input.equals("d-") || input.equals ("D-")) {
                                    grades = grades + 0.7;
    
                                    
                                    if (input2.equals("ap") || input2.equals("AP") || input2.equals("aP") ||  input2.equals("Ap")) {
                                        grades++;
    
    
                                    }
    
                                    if (input2.equals("honor") || input2.equals ("Honor")) {
                                        grades = grades + 0.5;
    
                                    
                                    }
    
                                }

                            }

                            

                            

                            

                            double gpa = ((int) ((grades/classes_inputed+ 0.005)*100))/100.0;
                             
                        
                             if (classes_inputed == 7) {

                                 label2.setText("Your GPA this semester is " + gpa);
                            }

                            if (gpa >= 4.0 && classes_inputed ==7) {
                            
                                label3.setBounds(50, 115,300,30);
                                label4.setVisible(false);

                                
                            }
                        
                         if (classes_inputed < 7) {
                            label.setText("Enter class grades for class number " +  (classes_inputed + 1)+" in bottom box");

                        }

                        else {
                            label.setText("");
                        }

                        

                        break;
                        
                    
                }
              
                
               
            }
        });


        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(textField2);
    }
}

    
