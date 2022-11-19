
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Stationery extends javax.swing.JFrame  implements ActionListener {
    static JFrame frame1,frame0, frame2, frame3, frame4, frame5, frame6, frame7, frame8,frame9,frame10,frame11,frame12,frame13,frame14,frame15,frame16,frame17,frame18;
    static JButton pen,message,product,price,submit, pencil,print,overview,luxar,graphic,v5, natrajpencil,reset,recipt, natrajeraser, domseraser, classmateeraser, natrajsharpener, domssharpener, classmatesharpener, natrajscale, domsscale, classmatescale, doms, extradark, eraser, sharpener, scale, protector,natrajprotector,domsprotector,classmateprotector , compass,natrajcompass,domscompass,classmatecompass, divider,natrajdivider,domsdivider,classmatedivider, gelpen, ballpen, inkpen, natraj, cello, butterflow, linc, trimax, writometer, back, notebooks,roughnotebook,fairnotebook, books,parker, maxwriter, bob,ja,jav,ds,c,os,cn,ada,compiler,dw,is,cc,coa,b1,b2,b3,b4,cp;
    static JLabel l1,l2,l3,l4,l5,oderno,quantity,ppp,name,mobile,occu,address;
    static JTextField quanti,tppp,tname,tmobile,toccu,result,taddress;
    static String gender[]={" ","MALE","FEMALE","OTHER"};
    static JCheckBox term;
    static JTextArea slip;
    static Container con ;
    static TextField toderno;

    public static void main (String[]args)
        {

            new Stationery();
            frame0 = new JFrame("HOME PAGE");
            frame0.setSize(1500, 750);
            frame0.setLayout(null);

            l1 = new JLabel("WELCOME TO DIGITAL STATIONARY");
            l1.setForeground(Color.white);
            product = new JButton("PRODUCTS");
            message = new JButton("OUR MESSAGE");
            overview = new JButton("OVERVIEW");


            l2 = new JLabel("CONTACT    - 9805294974");
            l2.setForeground(Color.yellow);

            l3 = new JLabel("E-mail        - sc24102001@gmail.com");
            l3.setForeground(Color.yellow);

            l4 = new JLabel("TWITTER   - abc@twitter.com");
            l4.setForeground(Color.yellow);

            occu = new JLabel("ADDRESS - shop-13/b, khera road,palampur");
            occu.setForeground(Color.yellow);

            name = new JLabel("dist - kangra(hp), pin - 176087");
            name.setForeground(Color.yellow);

            l1.setBounds(330, 2, 1200, 70);
            l2.setBounds(23, 3, 200, 20);
            l3.setBounds(23, 33, 230, 20);
            l4.setBounds(23, 18, 200, 20);
            occu.setBounds(23, 48, 300, 20);
            name.setBounds(90, 63, 300, 20);

            product.setBounds(1070, 375, 270, 50);
            message.setBounds(1070, 440, 270, 50);
            overview.setBounds(1070, 505, 270, 50);

            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));

            product.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            message.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            overview.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));

            frame0.add(product);
            frame0.add(message);
            frame0.add(overview);
            frame0.add(l1);
            frame0.add(l2);
            frame0.add(l3);
            frame0.add(l4);
            frame0.add(occu);
            frame0.add(name);

            JLabel zeroimg =new JLabel(new ImageIcon

                    ("zeroimg.jpg"));
            frame0.add(zeroimg);
            zeroimg.setSize(1362,710);

            JLabel home =new JLabel(new ImageIcon

                    ("home.jpg"));
            frame0.add(home);
            home.setSize(1300,600);


            Stationery obj = new Stationery ();

            product.addActionListener(obj);
            message.addActionListener(obj);
            overview.addActionListener(obj);
            frame0.setVisible(true);
        }

    public void actionPerformed (ActionEvent e){
        String button = e.getActionCommand();

        if (button.equals("PRODUCTS")) {
            create_frame1();
        }
        if (button.equals("OUR MESSAGE")) {
            create_frame14();
        }
        if (button.equals("OVERVIEW")) {
            create_frame16();
        }
        if (button.equals("PEN")) {
            create_frame2();
        }
        if (button.equals("GEL-PEN")) {
            create_frame3();
        }
        if (button.equals("BALL-PEN")) {
            create_frame4();
        }
        if (button.equals("PENCIL")) {
            create_frame5();
        }
        if (button.equals("ERASER")) {
            create_frame6();
        }
        if (button.equals("SHARPENER")) {
            create_frame7();
        }
        if (button.equals("SCALE")) {
            create_frame8();
        }
        if (button.equals("PROTECTOR")) {
            create_frame9();
        }
        if (button.equals("COMPASS")) {
            create_frame10();
        }
        if (button.equals("DIVIDER")) {
            create_frame11();
        }
        if (button.equals("NOTEBOOKS")) {
            create_frame12();
        }
        if (button.equals("BOOKS")) {
            create_frame13();
        }
        if (button.equals("NATRAJ 10 RS")) {
            create_frame15();
        }
        if (button.equals("CELLO 20 RS")) {
            create_frame15();
        }
        if (button.equals("LINC 10 RS")) {
            create_frame15();
        }
        if (button.equals("TRIMAX 40 RS")) {
            create_frame15();
        }
        if (button.equals("WRITOMETER 20 RS")) {
            create_frame15();
        }
        if (button.equals("BUTTER_FLOW 50 RS")) {
            create_frame15();
        }
        if (button.equals("PARKER 150 RS")) {
            create_frame15();
        }
        if (button.equals("MAXWRITER 20 RS")) {
            create_frame15();
        }
        if (button.equals("BOB 60 RS")) {
            create_frame15();
        }
        if (button.equals("INK-PEN")) {
            create_frame18();
        }
        if (button.equals("LUXAR 50 RS")) {
            create_frame15();
        }
        if (button.equals("GRAPHIC 70 RS")) {
            create_frame15();
        }
        if (button.equals("V5 150 RS")) {
            create_frame15();
        }
        if (button.equals("LEAD")) {
            create_frame17();
        }
        if (button.equals("DOMS")) {
            create_frame17();
        }
        if (button.equals("EXTRADARK")) {
            create_frame17();
        }
        if (button.equals("MIN 5 RS")) {
            create_frame15();
        }
        if (button.equals("DOS 10 RS")) {
            create_frame15();
        }
        if (button.equals("CLASSMATE 15 RS")) {
            create_frame15();
        }
        if (button.equals("NAT 5 RS")) {
            create_frame15();
        }
        if (button.equals("SHARP 10 RS")) {
            create_frame15();
        }
        if (button.equals("ALOB 15 RS")) {
            create_frame15();
        }
        if (button.equals("MEASURE 10 RS")) {
            create_frame15();
        }
        if (button.equals("BAR 30 RS")) {
            create_frame15();
        }
        if (button.equals("SOS 20 RS")) {
            create_frame15();
        }
        if (button.equals("FINS 10 RS")) {
            create_frame15();
        }
        if (button.equals("DARK 20 RS")) {
            create_frame15();
        }
        if (button.equals("ANGLE 30 RS")) {
            create_frame15();
        }
        if (button.equals("COMP 30 RS")) {
            create_frame15();
        }
        if (button.equals("NIB 50 RS")) {
            create_frame15();
        }
        if (button.equals("STROKE 100 RS")) {
            create_frame15();
        }
        if (button.equals("SATA 50 RS")) {
            create_frame15();
        }
        if (button.equals("NATA 100 RS")) {
            create_frame15();
        }
        if (button.equals("KATA 150 RS")) {
            create_frame15();
        }
        if (button.equals("ROUGH 50 RS")) {
            create_frame15();
        }
        if (button.equals("FAIR 100 RS")) {
            create_frame15();
        }
        if (button.equals("C++ By BJARNE STROUSTRUP")) {
            create_frame15();
        }
        if (button.equals("C++ BY E.BALAGURUSWAMY")) {
            create_frame15();
        }
        if (button.equals("JAVA: A BEGINEER'S GUIDE")) {
            create_frame15();
        }
        if (button.equals("EFFECTIVE JAVA BY BLOCH JOSHUA")) {
            create_frame15();
        }
        if (button.equals("ALGORITHMS BY CORMEN")) {
            create_frame15();
        }
        if (button.equals("2B")) {
            create_frame15();
        }
        if (button.equals("4B")) {
            create_frame15();
        }
        if (button.equals("6B")) {
            create_frame15();
        }
        if (button.equals("8B")) {
            create_frame15();
        }

        if (button.equals("BACK."))
        {
            frame1.dispose();
        }
        if (button.equals("BACK..")) {
            frame2.dispose();
        }
        if (button.equals("BACK...")) {
            frame3.dispose();
        }
        if (button.equals("..BACK..")) {
            frame4.dispose();
        }
        if (button.equals("...BACK..")) {
            frame5.dispose();
        }
        if (button.equals("...BACK...")) {
            frame6.dispose();
        }
        if (button.equals("....BACK...")) {
            frame7.dispose();
        }
        if (button.equals("....BACK....")) {
            frame8.dispose();
        }
        if (button.equals("BACK-")) {
            frame9.dispose();
        }
        if (button.equals("....BACK......")) {
            frame10.dispose();
        }
        if (button.equals("....BACK.......")) {
            frame11.dispose();
        }
        if (button.equals("......BACK......")) {
            frame12.dispose();
        }
        if (button.equals("......BACK.......")) {
            frame13.dispose();
        }
        if (button.equals("......BACK......_.")) {
            frame14.dispose();
        }
        if (button.equals("BACK!")) {
            frame15.dispose();
        }
        if (button.equals("BACK HOME")) {
            frame1.dispose();
        }
        if (button.equals("BACK,")) {
            frame16.dispose();
        }
        if (button.equals("BACK<")) {
            frame17.dispose();
        }
        if (button.equals("BACK(")) {
            frame18.dispose();
        }

        if(e.getSource()==price){
            int a = Integer.parseInt(quanti.getText());
            int b = Integer.parseInt(tppp.getText());
            int con = a*b;
            result.setText( con + " Rs");
        }

        if (button.equals("SUBMIT")) {
            if(tname.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER NAME");
            else if (tmobile.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER MOBILE NUMBER ");
            else if(toccu.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER OCCUPATION ");
            else if(toderno.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER ORDER NUMBER ");
            else if(quanti.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER QUANTITY");
            else if(tppp.getText().length()==0)
                JOptionPane.showMessageDialog(null, "PLEASE ENTER CUSTOMER PERICE PER PIECE");
            else if (term.isSelected())
                 JOptionPane.showMessageDialog(null, "CONGRATULATIONS! YOUR ORDER PLACED SUCCESSFULLY");
            else
                JOptionPane.showMessageDialog(null, "PLEASE ACCEPT THE TERM AND CONDITION");
        }
        if (button.equals("GENERATE SLIP")) {
            slip.setText(slip.getText() + "********** RECIPT **********"+ "\n\n" );
            slip.setText(slip.getText() + "NAME = " +  tname.getText() + "\n\n" );
            slip.setText(slip.getText() + "MOBILE NUMBER = "  +  tmobile.getText() + "\n\n" );

            slip.setText(slip.getText() + "OCCUPATION = " + toccu.getText() + "\n\n" );
            slip.setText(slip.getText() + "ORDER NUMBER = " + toderno.getText() + "\n\n" );
            slip.setText(slip.getText() + "QUANTITY = " + quanti.getText() + "\n\n" );
            slip.setText(slip.getText() + "PRICE PER PIECE = " + tppp.getText() + "\n\n" );
            slip.setText(slip.getText() + "TOTAL PRICE = " +  result.getText() + "\n\n" );
            slip.setText(slip.getText() + "ADDRESS = " +  taddress.getText() + "\n\n" );
            slip.setText(slip.getText() + "********** THANK-YOU **********" +   "\n\n" );
        }
        if (button.equals("PRINT")) {
            try {
                slip.print();
            }
            catch (Exception s)
            {
            }
        }

        if (button.equals("RESET")) {
            String def =" ";
            tname.setText(def);
            tmobile.setText(def);
            toccu.setText(def);
            toderno.setText(def);
            tppp.setText(def);
            quanti.setText(def);

            result.setText(def);
            taddress.setText(def);
            term.setSelected(false);
        }
    }

    public static void create_frame1 () {


            new Stationery  ();
    frame1 = new JFrame("WRITING MATERIALS");
            frame1.setSize(1500, 750);
            frame1.setLayout(null);

    l1 = new JLabel("PRODUCTS");

    pen = new JButton("PEN");
    pencil = new JButton("PENCIL");
    eraser = new JButton("ERASER");
    sharpener = new JButton("SHARPENER");
    scale = new JButton("SCALE");
    protector = new JButton("PROTECTOR");
    compass = new JButton("COMPASS");
    divider = new JButton("DIVIDER");
    notebooks = new JButton("NOTEBOOKS");
    books = new JButton("BOOKS");
    back = new JButton("BACK HOME");

    l1.setForeground(Color.black);
    l1.setBounds(550, 0, 1100, 70);
    pen.setBounds(230, 90, 255, 50);
    protector.setBounds(860, 90, 255, 50);
    pencil.setBounds(230, 190, 255, 50);
    compass.setBounds(860, 190, 255, 50);
    eraser.setBounds(230, 290, 255, 50);
    divider.setBounds(860, 290, 255, 50);
    sharpener.setBounds(230, 390, 255, 50);
    notebooks.setBounds(860, 390, 255, 50);
    scale.setBounds(230, 490, 255, 50);
    books.setBounds(860, 490, 255, 50);
    back.setBounds(550, 490, 255, 50);

    l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
    pen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    pencil.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    eraser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    sharpener.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    scale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    protector.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    compass.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    notebooks.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    books.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    divider.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
    back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));


    frame1.add(pen);
    frame1.add(pencil);
    frame1.add(eraser);
    frame1.add(sharpener);
    frame1.add(scale);
    frame1.add(protector);
    frame1.add(compass);
    frame1.add(divider);
    frame1.add(notebooks);
    frame1.add(books);
    frame1.add(l1);
    frame1.add(back);

    JLabel background1=new JLabel(new ImageIcon

            ("1st.jpg"));
            frame1.add(background1);

            background1.setSize(1362,700);


        Stationery  obj = new Stationery ();

            pen.addActionListener(obj);
            pencil.addActionListener(obj);
            eraser.addActionListener(obj);
            sharpener.addActionListener(obj);
            scale.addActionListener(obj);
            protector.addActionListener(obj);
            compass.addActionListener(obj);
            divider.addActionListener(obj);
            notebooks.addActionListener(obj);
            books.addActionListener(obj);
            back.addActionListener(obj);
            frame1.setVisible(true);
    }


    //function to create Frame 2
        public static void create_frame2 () {

            frame2 = new JFrame("PEN");
            frame2.setSize(1500, 750);

            l1 = new JLabel("SELECT THE TYPE OF PEN ");
            gelpen = new JButton("GEL-PEN");
            ballpen = new JButton("BALL-PEN");
            inkpen = new JButton("INK-PEN");
            back = new JButton("BACK..");

            l1.setBounds(10, 20, 1100, 70);
            gelpen.setBounds(10, 150, 255, 80);
            ballpen.setBounds(10, 300, 255, 80);
            inkpen.setBounds(10, 450, 255, 80);
            back.setBounds(10, 600, 255, 80);

            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
            gelpen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            ballpen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            inkpen.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            l1.setForeground(Color.white);

            frame2.add(l1);
            frame2.add(gelpen);
            frame2.add(ballpen);
            frame2.add(inkpen);
            frame2.add(back);

            JLabel penimg = new JLabel(new ImageIcon
                    ("pen.jpg"));
            frame2.add(penimg);
            penimg.setSize(1362,700);

            Stationery  obj = new Stationery ();
            gelpen.addActionListener(obj);
            ballpen.addActionListener(obj);
            inkpen.addActionListener(obj);
            back.addActionListener(obj);

            frame2.setLayout(null);
            frame2.setVisible(true);

        }

        public static void create_frame3 () {

            frame3 = new JFrame("GEL-PEN");
            frame3.setSize(1500, 750);

            l1 = new JLabel("SELECT THE COMPANY OF PEN ");

            natraj = new JButton("NATRAJ 10 RS");
            cello = new JButton("CELLO 20 RS");
            butterflow = new JButton("BUTTER_FLOW 50 RS");
            linc = new JButton("LINC 10 RS");
            trimax = new JButton("TRIMAX 40 RS");
            writometer = new JButton("WRITOMETER 20 RS");
            back = new JButton("BACK...");

            l1.setBounds(75, 20, 1500, 70);
            natraj.setBounds(75, 150, 270, 50);
            cello.setBounds(75, 300, 270, 50);
            linc.setBounds(75, 450, 270, 50);
            trimax.setBounds(75, 600, 270, 50);
            writometer.setBounds(500, 150, 370, 50);
            butterflow.setBounds(500, 300, 370, 50);
            back.setBounds(500, 450, 370, 50);


            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
            natraj.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            cello.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            butterflow.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            linc.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            trimax.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            writometer.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));

            frame3.add(l1);
            frame3.add(natraj);
            frame3.add(cello);
            frame3.add(butterflow);
            frame3.add(linc);
            frame3.add(trimax);
            frame3.add(writometer);
            frame3.add(back);

            JLabel companyimg = new JLabel(new ImageIcon
                    ("pencompany.jpg"));
            frame3.add(companyimg);
            companyimg.setSize(1362,700);

            Stationery obj = new Stationery ();
            natraj.addActionListener(obj);
            cello.addActionListener(obj);
            butterflow.addActionListener(obj);
            linc.addActionListener(obj);
            trimax.addActionListener(obj);
            writometer.addActionListener(obj);
            back.addActionListener(obj);

            frame3.setLayout(null);
            frame3.setVisible(true);

        }

        public static void create_frame4 () {

            frame4 = new JFrame("BALL-PEN");
            frame4.setSize(1500, 750);

            l1 = new JLabel("SELECT THE COMPANY OF BALL-PEN");
            parker = new JButton("PARKER 150 RS");
            maxwriter = new JButton("MAXWRITER 20 RS");
            bob = new JButton("BOB 60 RS");
            back = new JButton("..BACK..");

            l1.setBounds(10, 20, 1100, 70);
            parker.setBounds(10, 150, 320, 80);
            maxwriter.setBounds(10, 300, 320, 80);
            bob.setBounds(10, 450, 320, 80);
            back.setBounds(10, 600, 320, 80);


            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
            parker.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            maxwriter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            bob.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));

            parker.setBackground(Color.lightGray);
            maxwriter.setBackground(Color.lightGray);
            bob.setBackground(Color.lightGray);
            back.setBackground(Color.lightGray);

            frame4.add(l1);
            frame4.add(parker);
            frame4.add(maxwriter);
            frame4.add(bob);
            frame4.add(back);

            JLabel ballpenimg = new JLabel(new ImageIcon
                    ("ballpen.jpg"));
            frame4.add(ballpenimg);
            ballpenimg.setSize(1362,700);

            Stationery  obj = new Stationery();
            parker.addActionListener(obj);
            maxwriter.addActionListener(obj);
            bob.addActionListener(obj);
            back.addActionListener(obj);

            frame4.setLayout(null);
            frame4.setVisible(true);
        }

        public static void create_frame5 () {

            frame5 = new JFrame("PENCIL");
            frame5.setSize(1500, 750);

            l1 = new JLabel("SELECT THE COMPANY OF PENCIL");
            natrajpencil = new JButton("LEAD");
            doms = new JButton("DOMS");
            extradark = new JButton("EXTRADARK");
            back = new JButton("...BACK..");


            l1.setBounds(10, 20, 1100, 70);
            natrajpencil.setBounds(10, 150, 255, 80);
            doms.setBounds(10, 300, 255, 80);
            extradark.setBounds(10, 450, 255, 80);
            back.setBounds(10, 600, 255, 80);

            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
            natrajpencil.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            doms.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            extradark.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));


            frame5.add(l1);
            frame5.add(natrajpencil);
            frame5.add(doms);
            frame5.add(extradark);
            frame5.add(back);

            JLabel pencilimg = new JLabel(new ImageIcon
                    ("pencil.jpg"));
            frame5.add(pencilimg);
            pencilimg.setSize(1362,700);

            Stationery  obj = new Stationery ();
            natrajpencil.addActionListener(obj);
            doms.addActionListener(obj);
            extradark.addActionListener(obj);
            back.addActionListener(obj);

            frame5.setLayout(null);
            frame5.setVisible(true);

        }

        public static void create_frame6 () {

            frame6 = new JFrame("ERASER");
            frame6.setSize(1500, 750);
            frame6.setBackground(Color.PINK);

            l1 = new JLabel("SELECT THE COMPANY OF ERASER");
            natrajeraser = new JButton("MIN 5 RS");
            domseraser = new JButton("DOS 10 RS");
            classmateeraser = new JButton("CLASSMATE 15 RS");
            back = new JButton("...BACK...");

            l1.setBounds(10, 1, 1100, 70);
            natrajeraser.setBounds(10, 80, 300, 50);
            domseraser.setBounds(10, 150, 300, 50);
            classmateeraser.setBounds(10, 220, 300, 50);
            back.setBounds(10, 290, 300, 50);


            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
            natrajeraser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
            domseraser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
            classmateeraser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));

            frame6.add(l1);
            frame6.add(natrajeraser);
            frame6.add(domseraser);
            frame6.add(classmateeraser);
            frame6.add(back);

            JLabel eraser=new JLabel(new ImageIcon

                    ("eraserimg.png"));
            frame6.add(eraser);
            eraser.setSize(1362,700);

            Stationery  obj = new Stationery ();
            natrajeraser.addActionListener(obj);
            domseraser.addActionListener(obj);
            classmateeraser.addActionListener(obj);
            back.addActionListener(obj);

            frame6.setLayout(null);
            frame6.setVisible(true);
        }
        public static void create_frame7 () {

            frame7 = new JFrame("SHARPENER");
            frame7.setSize(1500, 750);
            frame7.setBackground(Color.GREEN);

            l1 = new JLabel("SELECT THE COMPANY OF SHARPENER");
            natrajsharpener = new JButton("NAT 5 RS");
            domssharpener = new JButton("SHARP 10 RS");
            classmatesharpener = new JButton("ALOB 15 RS");
            back = new JButton("....BACK...");

            l1.setBounds(10, 1, 1100, 70);
            natrajsharpener.setBounds(10, 150, 280, 80);
            domssharpener.setBounds(10, 300, 280, 80);
            classmatesharpener.setBounds(10, 450, 280, 80);
            back.setBounds(10, 600, 280, 80);

            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 45));
            natrajsharpener.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            domssharpener.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            classmatesharpener.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));


            frame7.add(l1);
            frame7.add(natrajsharpener);
            frame7.add(domssharpener);
            frame7.add(classmatesharpener);
            frame7.add(back);

            JLabel sharpnerimg = new JLabel(new ImageIcon
                    ("sharpnerimg.jpg"));
            frame7.add(sharpnerimg);
            sharpnerimg.setSize(1362,700);

            Stationery  obj = new Stationery ();
            natrajsharpener.addActionListener(obj);
            domssharpener.addActionListener(obj);
            classmatesharpener.addActionListener(obj);
            back.addActionListener(obj);

            frame7.setLayout(null);
            frame7.setVisible(true);
        }

        public static void create_frame8 () {

            frame8 = new JFrame("SCALE");
            frame8.setSize(1500, 750);
            frame8.setBackground(Color.GREEN);

            l1 = new JLabel("SELECT THE COMPANY OF SCALE");
            natrajscale = new JButton("MEASURE 10 RS");
            domsscale = new JButton("SOS 20 RS");
            classmatescale = new JButton("BAR 30 RS");
            back = new JButton("....BACK....");

            l1.setBounds(300, 3, 1100, 70);
            natrajscale.setBounds(10, 100, 320, 80);
            domsscale.setBounds(10, 210, 320, 80);
            classmatescale.setBounds(10, 500, 320, 80);
            back.setBounds(10, 600, 320, 80);

            l1.setForeground(Color.yellow);
            natrajscale.setForeground(Color.yellow);
            domsscale.setForeground(Color.yellow);
            classmatescale.setForeground(Color.yellow);
            back.setForeground(Color.yellow);

            l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
            natrajscale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            domsscale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            classmatescale.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
            back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

            natrajscale.setBackground(Color.black);
            domsscale.setBackground(Color.black);
            classmatescale.setBackground(Color.black);
            back.setBackground(Color.black);

            frame8.add(l1);
            frame8.add(natrajscale);
            frame8.add(domsscale);
            frame8.add(classmatescale);
            frame8.add(back);

            JLabel scaleimg = new JLabel(new ImageIcon
                    ("scaleimg.jpg"));
            frame8.add(scaleimg);
            scaleimg.setSize(1362,700);

            Stationery  obj = new Stationery ();
            natrajscale.addActionListener(obj);
            domsscale.addActionListener(obj);
            classmatescale.addActionListener(obj);
            back.addActionListener(obj);

            frame8.setLayout(null);
            frame8.setVisible(true);
        }

    public static void create_frame9 () {

        frame9 = new JFrame("PROTECTOR");
        frame9.setSize(1500, 750);

        l1 = new JLabel("SELECT PROTECTOR");
        natrajprotector = new JButton("FINS 10 RS");
        domsprotector = new JButton("DARK 20 RS");
        classmateprotector = new JButton("ANGLE 30 RS");
        back = new JButton("BACK-");



        l1.setBounds(5, 5, 1100, 70);
        natrajprotector.setBounds (150, 430, 160, 80);
        domsprotector.setBounds(700, 210, 180, 80);
        classmateprotector.setBounds(400, 280, 180, 80);
        back.setBounds(920, 384, 155, 80);

        l1.setForeground(Color.black);
        natrajprotector.setForeground(Color.yellow);
        domsprotector.setForeground(Color.yellow);
        classmateprotector.setForeground(Color.yellow);
        back.setForeground(Color.yellow);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        natrajprotector.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        domsprotector.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        classmateprotector.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));

        natrajprotector.setBackground(Color.black);
        domsprotector.setBackground(Color.black);
        classmateprotector.setBackground(Color.black);
        back.setBackground(Color.black);

        frame9.add(l1);
        frame9.add(natrajprotector);
        frame9.add(domsprotector);
        frame9.add(classmateprotector);
        frame9.add(back);

        JLabel protectorimg = new JLabel(new ImageIcon
                ("protectorimg.jpg"));
        frame9.add(protectorimg);
        protectorimg.setSize(1350,700);


        Stationery  obj = new Stationery ();
        natrajprotector.addActionListener(obj);
        domsprotector.addActionListener(obj);
        classmateprotector.addActionListener(obj);
        back.addActionListener(obj);

        frame9.setLayout(null);
        frame9.setVisible(true);
    }

    public static void create_frame10 () {

        frame10 = new JFrame("COMPASS");
        frame10.setSize(1500, 750);

        l1 = new JLabel("SELECT THE COMPANY OF COMPASS");
        natrajcompass = new JButton("COMP 30 RS");
        domscompass = new JButton("NIB 50 RS");
        classmatecompass = new JButton("STROKE 100 RS");
        back = new JButton("....BACK......");


        l1.setBounds(14, 5, 1100, 70);
        natrajcompass.setBounds(17, 100, 320, 80);
        domscompass.setBounds(17, 200, 320, 80);
        classmatecompass.setBounds(17, 300, 320, 80);
        back.setBounds(17, 400, 320, 80);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        natrajcompass.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        domscompass.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        classmatecompass.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame10.add(l1);
        frame10.add(natrajcompass);
        frame10.add(domscompass);
        frame10.add(classmatecompass);
        frame10.add(back);

        JLabel compassimg = new JLabel(new ImageIcon
                ("compassimg.jpg"));
        frame10.add(compassimg);
        compassimg.setSize(1300,750);

        Stationery  obj = new Stationery ();
        natrajcompass.addActionListener(obj);
        domscompass.addActionListener(obj);
        classmatecompass.addActionListener(obj);
        back.addActionListener(obj);

        frame10.setLayout(null);
        frame10.setVisible(true);
    }

    public static void create_frame11 () {

        frame11 = new JFrame("DIVIDER");
        frame11.setSize(1500, 750);
        frame11.getContentPane().setBackground(Color.white);

        l1 = new JLabel("SELECT DIVIDER");
        natrajdivider = new JButton("SATA 50 RS");
        domsdivider = new JButton("NATA 100 RS");
        classmatedivider= new JButton("KATA 150 RS");
        back = new JButton("....BACK.......");


        l1.setBounds(500, 5, 1100, 70);
        natrajdivider.setBounds(12, 100, 270, 80);
        domsdivider.setBounds(12, 240, 270, 80);
        classmatedivider.setBounds(12, 380, 270, 80);
        back.setBounds(12, 520, 270, 80);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        natrajdivider.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        domsdivider.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        classmatedivider.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame11.add(l1);
        frame11.add(natrajdivider);
        frame11.add(domsdivider);
        frame11.add(classmatedivider);
        frame11.add(back);

        JLabel dividerimg = new JLabel(new ImageIcon
                ("dividerimg.jpg"));
        frame11.add(dividerimg);
        dividerimg.setSize(1500,700);

        Stationery  obj = new Stationery ();
        natrajdivider.addActionListener(obj);
        domsdivider.addActionListener(obj);
        classmatedivider.addActionListener(obj);
        back.addActionListener(obj);

        frame11.setLayout(null);
        frame11.setVisible(true);
    }

    public static void create_frame12 () {

        frame12 = new JFrame("NOTEBOOK");
        frame12.setSize(1500, 750);

        l1 = new JLabel("SELECT - NOTEBOOK");
        roughnotebook = new JButton("ROUGH 50 RS");
        fairnotebook= new JButton("FAIR 100 RS");
        back = new JButton("......BACK......");


        l1.setBounds(460, 50, 1100, 70);
        roughnotebook.setBounds(423, 180, 450, 80);
        fairnotebook.setBounds(423, 350, 450, 80);
        back.setBounds(423, 520, 450, 80);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        roughnotebook.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        fairnotebook.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame12.add(l1);
        frame12.add(roughnotebook);
        frame12.add(fairnotebook);
        frame12.add(back);

        JLabel notebk = new JLabel(new ImageIcon
                ("notebk.jpg"));
        frame12.add(notebk);
        notebk.setSize(1362,700);

        Stationery  obj = new Stationery ();
        roughnotebook.addActionListener(obj);
        fairnotebook.addActionListener(obj);
        back.addActionListener(obj);

        frame12.setLayout(null);
        frame12.setVisible(true);
    }
    public static void create_frame13 () {

        frame13 = new JFrame("BOOKS");
        frame13.setSize(1500, 750);
        l1 = new JLabel("SELECT BOOK");
        c = new JButton("C++ By BJARNE STROUSTRUP");
        cp = new JButton("C++ BY E.BALAGURUSWAMY");
        ja = new JButton("JAVA: A BEGINEER'S GUIDE");
        jav = new JButton("EFFECTIVE JAVA BY BLOCH JOSHUA");
        ds = new JButton("ALGORITHMS BY CORMEN");
        back = new JButton("......BACK.......");

        l1.setBounds(180, 5, 1100, 50);
        c.setBounds(12, 100, 690, 50);
        cp.setBounds(12, 180, 690, 50);
        ja.setBounds (12, 260, 690, 50);
        jav.setBounds(12, 340, 690, 50);
        ds.setBounds (12, 420, 690, 50);
        back.setBounds(12, 500, 690, 50);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        c.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        cp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        ja.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        jav.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        ds.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));


        frame13.add(l1);
        frame13.add(c);
        frame13.add(cp);
        frame13.add(ja);
        frame13.add(jav);
        frame13.add(ds);
        frame13.add(back);

        JLabel javaimg = new JLabel(new ImageIcon
                ("books.jpg"));
        frame13.add(javaimg);
        javaimg.setSize(1362,700);

        Stationery  obj = new Stationery ();
        c.addActionListener(obj);
        cp.addActionListener(obj);
        ja.addActionListener(obj);
        jav.addActionListener(obj);
        ds.addActionListener(obj);
        back.addActionListener(obj);

        frame13.setLayout(null);
        frame13.setVisible(true);
    }

    public static void create_frame14 () {

        frame14 = new JFrame("OUR MESSAGE");
        frame14.setSize(1500, 750);
        l1 = new JLabel("GREAT MESSAGE FOR YOU");
        back = new JButton("......BACK......_.");

        l1.setBounds(350, 5, 1100, 70);
        back.setBounds(830, 620, 500, 80);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame14.add(l1);
        frame14.add(back);

        JLabel me = new JLabel(new ImageIcon
                ("message.jpg"));
        frame14.add(me);
        me.setSize(1362,700);

        Stationery  obj = new Stationery ();
        back.addActionListener(obj);

        frame14.setLayout(null);
        frame14.setVisible(true);
    }
    public static void create_frame15 () {

        frame15 = new JFrame("ORDER DETAILS");
        frame15.setSize(1500, 750);
        l1 = new JLabel("ENTER DETAILS TO CONFIRM ORDER");
        l2 = new JLabel("PAYMENT CASH ON DELIVERY ONLY");
        JLabel t5 = new JLabel("QUANTITY *");
        ppp = new JLabel("PRICE PER PIECE");
        tppp = new JTextField();
        oderno = new JLabel("ORDER NO. *");
        quantity = new JLabel("QUANTITY *");
        name = new JLabel("CUSTOMER NAME *");
        address = new JLabel("ADDRESS *");
        price = new JButton("PRICE");
        submit = new JButton("SUBMIT");
        mobile = new JLabel("MOBILE NO. * ");
        occu = new JLabel("OCCUPATION *");
        back = new JButton("BACK!");
        reset = new JButton("RESET");
        print = new JButton("PRINT");
        term = new JCheckBox("Accept Terms And Conditions.");
        recipt = new JButton("GENERATE SLIP");
        toderno = new TextField();
        quanti = new JTextField();
        tname = new JTextField();
        tmobile = new JTextField();
        toccu = new JTextField();
        result = new JTextField("");
        taddress = new JTextField("");
        slip = new JTextArea();

        JComboBox cb = new JComboBox(gender);
        cb.setBounds(300, 150,200,50);
        JLabel t25 = new JLabel("GENDER");
        t25.setBounds(5, 150, 310, 50);

        l1.setBounds(370, 5, 1100, 70);
        l2.setBounds(5,635, 550, 50);
        name.setBounds(5,80,310,50);
        mobile.setBounds(5,220,310,50);
        occu.setBounds(5,290,310,50);
        oderno.setBounds(5, 360, 200, 50);
        quantity.setBounds(5, 430, 200, 50);
        ppp.setBounds(5, 500, 500, 50);
        price.setBounds(5, 570, 200, 50);
        address.setBounds(740,80,300,50);


        tname.setBounds(300,80,200,50);
        tmobile.setBounds(300,220,200,50);
        toccu.setBounds(300,290,200,50);
        toderno.setBounds(300,360,200,50);
        quanti.setBounds(300, 430, 200, 50);
        tppp.setBounds(300, 500, 200, 50);
        taddress.setBounds(940,80,290,110);
        result.setBounds(300,570,200,50);

        term.setBounds(740,180,500,50);
        submit.setBounds(740,230, 200, 50);
        reset.setBounds(1030,230, 200, 50);
        recipt.setBounds(830,286, 300, 50);
        slip.setBounds(740,345,486,290);
        print.setBounds(740,640, 200, 50);
        back.setBounds(1030, 640, 200, 50);


        con = frame15.getContentPane();
        con.setLayout(null);
        con.add(quanti);
        con.add(oderno);
        con.add(tname);
        con.add(name);
        con.add(toderno);
        con.add(quantity);
        con.add(tppp);
        con.add(price);
        con.add(ppp);
        con.add(l1);
        con.add(l2);
        con.add(cb);
        con.add(t25);
        con.add(address);
        con.add(back);
        con.add(submit);
        con.add(mobile);
        con.add(tmobile);
        con.add(occu);
        con.add(toccu);
        con.add(taddress);
        con.add(term);
        con.add(print);
        con.add(reset);
        con.add(result);
        con.add(slip);
        con.add(recipt);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        l2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        t25.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        cb.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        term.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        tname.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        oderno.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        price.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        toderno.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        quantity.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        ppp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        quanti.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        t5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        tppp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        result.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        mobile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        tmobile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        occu.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        toccu.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        address.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        taddress.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        submit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        reset.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        print.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        recipt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));

        Stationery  obj = new Stationery ();
        back.addActionListener(obj);
        price.addActionListener(obj);
        submit.addActionListener(obj);
        term.addActionListener(obj);
        reset.addActionListener(obj);
        print.addActionListener(obj);
        recipt.addActionListener(obj);


        frame15.setLayout(null);
        frame15.setVisible(true);
    }

    public static void create_frame16 () {

        frame16 = new JFrame("OVERVIEW");
        frame16.setSize(1500, 750);
        l1 = new JLabel("OVERVIEW");
        back = new JButton("BACK,");

        l1.setBounds(550, 5, 1100, 70);
        back.setBounds(1100, 600, 200, 60);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        JLabel overimg = new JLabel(new ImageIcon
                ("overimg.jpg"));
        frame16.add(overimg);
        overimg.setSize(500,750);

        JLabel ov = new JLabel(new ImageIcon
                ("ov.png"));
        frame16.add(ov);
        ov.setSize(1900,700);

        frame16.add(l1);
        frame16.add(back);

        Stationery  obj = new Stationery ();
        back.addActionListener(obj);

        frame16.setLayout(null);
        frame16.setVisible(true);
    }
    public static void create_frame17 () {

        frame17 = new JFrame("PENCIL NUMBER");
        frame17.setSize(1500, 750);
        l1 = new JLabel("PENCIL NUMBER");
        back = new JButton("BACK<");
        l2 = new JLabel("15 RS");
        l3 = new JLabel("10 RS");
        l4 = new JLabel("20 RS");
        l5 = new JLabel("25 RS");

        b1 = new JButton("2B");
        b2 = new JButton("4B");
        b3 = new JButton("6B");
        b4 = new JButton("8B");

        l1.setBounds(520, 1, 1100, 70);
        l2.setBounds(180, 100, 255, 80);
        l3.setBounds(180, 270, 255, 80);
        l4.setBounds(180, 430, 255, 80);
        l5.setBounds(180, 570, 255, 80);

        b1.setBounds(10, 100, 100, 80);
        b2.setBounds(10, 270, 100, 80);
        b3.setBounds(10, 430, 100, 80);
        b4.setBounds(10, 570, 100, 80);
        back.setBounds(1130, 580, 200, 60);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        l2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        l3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        l4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        l5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));

        b1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        b2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        b3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        b4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame17.add(l1);
        frame17.add(l2);
        frame17.add(l3);
        frame17.add(l4);
        frame17.add(l5);

        frame17.add(b1);
        frame17.add(b2);
        frame17.add(b3);
        frame17.add(b4);

        frame17.add(back);

        JLabel pencilnumber = new JLabel(new ImageIcon
                ("pencilnumber.jpg"));
        frame17.add(pencilnumber);
        pencilnumber.setSize(1470,700);

        Stationery  obj = new Stationery ();
        back.addActionListener(obj);
        b1.addActionListener(obj);
        b2.addActionListener(obj);
        b3.addActionListener(obj);
        b4.addActionListener(obj);
        frame17.setLayout(null);
        frame17.setVisible(true);
    }
    public static void create_frame18 () {

        frame18 = new JFrame("INK-PEN");
        frame18.setSize(1500, 750);

        l1 = new JLabel("SELECT COMPANY OF INK-PEN");
        luxar = new JButton("LUXAR 50 RS");
        graphic = new JButton("GRAPHIC 70 RS");
        v5 = new JButton("V5 150 RS");
        back = new JButton("BACK(");


        l1.setBounds(10, 20, 1100, 70);
        luxar.setBounds(10, 150, 320, 80);
        graphic.setBounds(10, 300, 320, 80);
        v5.setBounds(10, 450, 320, 80);
        back.setBounds(10, 600, 320, 80);

        l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
        luxar.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        graphic.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        v5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));
        back.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 35));

        frame18.add(l1);
        frame18.add(luxar);
        frame18.add(graphic);
        frame18.add(v5);
        frame18.add(back);

        JLabel penimg = new JLabel(new ImageIcon
                ("inkpen.jpg"));
        frame18.add(penimg);
        penimg.setSize(1890,830);

        Stationery  obj = new Stationery ();
        luxar.addActionListener(obj);
        graphic.addActionListener(obj);
        v5.addActionListener(obj);
        back.addActionListener(obj);

        frame18.setLayout(null);
        frame18.setVisible(true);

    }
}
