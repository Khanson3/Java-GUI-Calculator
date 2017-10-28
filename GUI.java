import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class GUI extends Frame implements WindowListener {
    private TextField upperBorder, txt, lowerBorder;
    private Button btn7, btn8, btn9, btnDiv, btn4, btn5, btn6, btnMult, btn1, btn2, btn3, btnSub, btnPN, btn0, btnDec, btnAdd, btnCE, btnC, btnEq;
    private String num1 = "";
    private String num2 = "";
    private String op = "";

    public GUI() {

        setLayout(new FlowLayout());

        Font txtFont = new Font("SansSerif", Font.BOLD, 60);
        Font borderFont = new Font("SansSerif", Font.BOLD, 1);
        Font btnFont = new Font("SansSerif", Font.BOLD, 70);

        upperBorder = new TextField(396);
        upperBorder.setFont(borderFont);
        upperBorder.setBackground(Color.lightGray);
        upperBorder.setEditable(false);
        add(upperBorder);

        txt = new TextField(12);
        txt.setFont(txtFont);
        txt.setEditable(false);
        add(txt);

        lowerBorder = new TextField(396);
        lowerBorder.setFont(borderFont);
        lowerBorder.setBackground(Color.lightGray);
        lowerBorder.setEditable(false);
        add(lowerBorder);

        btnCE = new Button(" CE ");
        btnCE.setFont(btnFont);
        btnCE.setBackground(Color.red);
        add(btnCE);

        btnC = new Button("  C  ");
        btnC.setFont(btnFont);
        btnC.setBackground(Color.red);
        add(btnC);

        Color colorOp = new Color(255, 140, 0);

        btnDiv = new Button(" ÷ ");
        btnDiv.setFont(btnFont);
        btnDiv.setBackground(colorOp);
        add(btnDiv);

        btn7 = new Button(" 7 ");
        btn7.setFont(btnFont);
        add(btn7);

        btn8 = new Button(" 8 ");
        btn8.setFont(btnFont);
        add(btn8);

        btn9 = new Button(" 9 ");
        btn9.setFont(btnFont);
        add(btn9);

        btnMult = new Button(" × ");
        btnMult.setFont(btnFont);
        btnMult.setBackground(colorOp);
        add(btnMult);

        btn4 = new Button(" 4 ");
        btn4.setFont(btnFont);
        add(btn4);

        btn5 = new Button(" 5 ");
        btn5.setFont(btnFont);
        add(btn5);

        btn6 = new Button(" 6 ");
        btn6.setFont(btnFont);
        add(btn6);

        btnSub = new Button(" − ");
        btnSub.setFont(btnFont);
        btnSub.setBackground(colorOp);
        add(btnSub);

        btn1 = new Button(" 1 ");
        btn1.setFont(btnFont);
        add(btn1);

        btn2 = new Button(" 2 ");
        btn2.setFont(btnFont);
        add(btn2);

        btn3 = new Button(" 3 ");
        btn3.setFont(btnFont);
        add(btn3);

        btnAdd = new Button(" + ");
        btnAdd.setFont(btnFont);
        btnAdd.setBackground(colorOp);
        add(btnAdd);

        Color colorPND = new Color(255, 255, 0);

        btnPN = new Button(" ± ");
        btnPN.setFont(btnFont);
        btnPN.setBackground(colorPND);
        add(btnPN);

        btn0 = new Button(" 0 ");
        btn0.setFont(btnFont);
        add(btn0);

        btnDec = new Button(" .  ");
        btnDec.setFont(btnFont);
        btnDec.setBackground(colorPND);
        add(btnDec);

        Color colorEquals = new Color(2, 100, 2);

        btnEq = new Button(" = ");
        btnEq.setFont(btnFont);
        btnEq.setBackground(colorEquals);
        add(btnEq);

        BtnListener listener = new BtnListener();

        btn7.addActionListener(listener);
        btn8.addActionListener(listener);
        btn9.addActionListener(listener);
        btnDiv.addActionListener(listener);
        btn4.addActionListener(listener);
        btn5.addActionListener(listener);
        btn6.addActionListener(listener);
        btnMult.addActionListener(listener);
        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btnSub.addActionListener(listener);
        btnPN.addActionListener(listener);
        btn0.addActionListener(listener);
        btnDec.addActionListener(listener);
        btnAdd.addActionListener(listener);
        btnCE.addActionListener(listener);
        btnC.addActionListener(listener);
        btnEq.addActionListener(listener);

        addWindowListener(this);

        setTitle("Calculator");
        setSize(490, 700);
        setBackground(Color.darkGray);
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI calc = new GUI();
    }

    public class Calculations {
        public void calculate(Button source) {
            if (source == btn0) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "0";
                    }
                } else {
                    num2 += "0";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn1) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "1";
                    }
                } else {
                    num2 += "1";
                }
                    txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn2) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "2";
                    }
                } else {
                    num2 += "2";
                }
                    txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn3) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "3";
                    }
                } else {
                    num2 += "3";
                }
                    txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn4) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "4";
                    }
                } else {
                    num2 += "4";
                }
                    txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn5) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "5";
                    }
                } else {
                    num2 += "5";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn6) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "6";
                    }
                } else {
                    num2 += "6";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn7) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "7";
                    }
                } else {
                    num2 += "7";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn8) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "8";
                    }
                } else {
                    num2 += "8";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btn9) {
                if (op.equals("")) {
                    if (!num1.equals("UNDEFINED")) {
                        num1 += "9";
                    }
                } else {
                    num2 += "9";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnAdd) {
                if (num1.equals("")) {
                    num1 = "0";
                    op = "+";
                }
                if (!num1.equals("") && !num2.equals("")) {
                    switch (op) {
                        case "+":
                            num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                            op = "+";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "-":
                            num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                            op = "+";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "×":
                            num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                            op = "+";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "÷":
                            if (Double.parseDouble(num2) == 0) {
                                num1 = "UNDEFINED";
                                op = "";
                            } else {
                                num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                                op = "+";
                                if (num1.length() > 7) {
                                    num1 = num1.substring(0, 8);
                                }
                            }
                            num2 = "";
                            break;
                    }
                }
                else if (num1.equals("UNDEFINED")) {
                    op = "";
                }
                else {
                    op = "+";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnSub) {
                if (num1.equals("")) {
                    num1 = "0";
                    op = "-";
                }
                if (!num1.equals("") && !num2.equals("")) {
                    switch (op) {
                        case "+":
                            num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                            op = "-";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "-":
                            num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                            op = "-";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "×":
                            num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                            op = "-";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "÷":
                            if (Double.parseDouble(num2) == 0) {
                                num1 = "UNDEFINED";
                                op = "";
                            } else {
                                num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                                op = "-";
                                if (num1.length() > 7) {
                                    num1 = num1.substring(0, 8);
                                }
                            }
                            num2 = "";
                            break;
                    }
                }
                else if (num1.equals("UNDEFINED")) {
                    op = "";
                }
                else {
                    op = "-";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnMult) {
                if (num1.equals("")) {
                    num1 = "0";
                    op = "×";
                }
                if (!num1.equals("") && !num2.equals("")) {
                    switch (op) {
                        case "+":
                            num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                            op = "×";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "-":
                            num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                            op = "×";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "×":
                            num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                            op = "×";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "÷":
                            if (Double.parseDouble(num2) == 0) {
                                num1 = "UNDEFINED";
                                op = "";
                            } else {
                                num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                                op = "×";
                                if (num1.length() > 7) {
                                    num1 = num1.substring(0, 8);
                                }
                            }
                            num2 = "";
                            break;
                    }
                }
                else if (num1.equals("UNDEFINED")) {
                    op = "";
                }
                else {
                    op = "×";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnDiv) {
                if (num1.equals("")) {
                    num1 = "0";
                    op = "÷";
                }
                else if (!num1.equals("") && !num2.equals("")) {
                    switch (op) {
                        case "+":
                            num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                            op = "÷";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "-":
                            num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                            op = "÷";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "×":
                            num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                            op = "÷";
                            num2 = "";
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                            break;
                        case "÷":
                            if (Double.parseDouble(num2) == 0) {
                                num1 = "UNDEFINED";
                                op = "";
                            } else {
                                num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                                op = "÷";
                                if (num1.length() > 7) {
                                    num1 = num1.substring(0, 8);
                                }
                            }
                            num2 = "";
                            break;
                    }
                }
                else if (num1.equals("UNDEFINED")) {
                    op = "";
                }
                else {
                    op = "÷";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnEq && !num1.equals("") && !num2.equals("")) {
                switch (op) {
                    case "+":
                        num1 = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
                        if (num1.length() > 7) {
                            num1 = num1.substring(0, 8);
                        }
                        txt.setText(num1);
                        break;
                    case "-":
                        num1 = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
                        if (num1.length() > 7) {
                            num1 = num1.substring(0, 8);
                        }
                        txt.setText(num1);
                        break;
                    case "×":
                        num1 = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
                        if (num1.length() > 7) {
                            num1 = num1.substring(0, 8);
                        }
                        txt.setText(num1);
                        break;
                    case "÷":
                        if (Double.parseDouble(num2) == 0) {
                            num1 = "UNDEFINED";
                        }
                        else {
                            num1 = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
                            if (num1.length() > 7) {
                                num1 = num1.substring(0, 8);
                            }
                        }
                        txt.setText(num1);
                        break;
                }
                op = "";
                num2 = "";
            } else if (source == btnPN) {
                if (!num1.equals("") && op.equals("")) {
                    try {
                        num1 = Double.toString(Double.parseDouble(num1) * (-1));
                        txt.setText(num1);
                    }
                    catch (Exception e) {}
                } else if (!num2.equals("")) {
                    num2 = Double.toString(Double.parseDouble(num2) * (-1));
                    txt.setText(num1 + " " + op + " " + num2);
                }
            } else if (source == btnDec) {
                if (op.equals("") && !num1.contains(".")) {
                    if (num1.equals("")) {
                        num1 = "0.";
                    }
                    else if (num1.equals("UNDEFINED")) {}
                    else {
                        num1 += ".";
                    }
                } else if (!op.equals("") && !num2.contains(".")) {
                    if (num2.equals("")) {
                        num2 = "0.";
                    } else {
                        num2 += ".";
                    }
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnCE) {
                if (op.equals("")) {
                    num1 = "";
                } else if (!op.equals("")) {
                    num2 = "";
                }
                txt.setText(num1 + " " + op + " " + num2);
            } else if (source == btnC) {
                num1 = "";
                op = "";
                num2 = "";
                txt.setText(num1 + " " + op + " " + num2);
            }
        }
    }

    private class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            Button source = (Button) evt.getSource();
            Calculations a = new Calculations();
            a.calculate(source);
        }
    }

    @Override
    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent evt) {
    }

    @Override
    public void windowClosed(WindowEvent evt) {
    }

    @Override
    public void windowIconified(WindowEvent evt) {
    }

    @Override
    public void windowDeiconified(WindowEvent evt) {
    }

    @Override
    public void windowActivated(WindowEvent evt) {
    }

    @Override
    public void windowDeactivated(WindowEvent evt) {
    }
}
