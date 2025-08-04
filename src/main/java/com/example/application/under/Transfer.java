package com.example.application.under;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


/**
 *
 * Transfer a file to another place
 * Not in use in these version
 */
public class Transfer extends JFrame
{

    //Initializing the value of
//currCard to 1 .
    private int currCard = 1;

    private static List<String> actualFiles = new ArrayList<String>();

    private Graphics g;
    //Declaring of objects
//of the CardLayout class.
    private CardLayout cObjl;
    private int numberOfFiles;
    private double width;
    private double height;
    private Dimension size;
    private int imagw;
    private int imagh;
    private int maxHeight;
    private int transferIndex;
    private int w;
    private int h;
    private int numberOfCards = 4;   // justering 1. this number 2. More JPanel generated   3. More object generated



    //constructor of the class
    public Transfer( List<String> actualFiles ) {
        this.actualFiles = actualFiles ;
        this.numberOfFiles = this.actualFiles.size();
        if( this.numberOfFiles ==  0 )  {
            System.out.println("No files generated");
            return;
        }

//Method to set the Title of the JFrame
        setTitle("Actual weld paintings ready for transfer");

//Methof for finding the size of output screen
//size = Toolkit.getDefaultToolkit().getScreenSize();
        width = 1920; //size.getWidth();
        height = 1060; //size.getHeight();

        w = (int) width;
        h = (int) height;
        maxHeight = h -40 ;  // get room  for labels under image
        if( h >maxHeight) {
            h = maxHeight;
            maxHeight = h -100 ;  // ?
        }

//Method to set the visibility of the JFrame
        setSize(w, h);

//Creating an Object of the "Jpanel" class
        JPanel cPanel = new JPanel();

//Initializing of the object "cObjl"
//of the CardLayout class.
        cObjl = new CardLayout();

//setting the layout
        cPanel.setLayout(cObjl);
//////////////////Generate new JPanal for use ///////////////////////////////////////////////////////  2. adjustment
//Initializing the object
//"jPanel1" of the JPanel class.
        JPanel jPanel1 = new JPanel();

//Initializing the object
//"jPanel2" of the CardLayout class.
        JPanel jPanel2 = new JPanel();

//Initializing the object
//"jPanel3" of the CardLayout class.
        JPanel jPanel3 = new JPanel();

//Initializing the object
//"jPanel4" of the CardLayout class.
        JPanel jPanel4 = new JPanel();
//////////////////////////////////////////////////////////Initializing actual object/////////////////////////////  3. adjustment
//Initializing the object
//"jl1" of the JLabel class.

        if ( numberOfFiles >= 1 ) {
            cPanel.add(jPanel1 , "1");
            JLabel jLabel1 = new JLabel( actualFiles.get(numberOfFiles -1));

            //Adding JLabel "jLabel" to the JPanel "jPanel1".
            jPanel1.add(jLabel1);
        } else {
            JLabel jLabel1 = new JLabel("C1 " );
            //Adding JLabel "jLabel1" to the JPanel "jPanel1".
            jPanel1.add(jLabel1);
        }

//Initializing the object
//"jLabel2" of the JLabel class.

        if ( numberOfFiles >= 2 ) {
            cPanel.add(jPanel2 , "2");
            JLabel jLabel2 = new JLabel( actualFiles.get(numberOfFiles -2));
//Adding JLabel "jLabel2" to the JPanel "jPanel2".
            jPanel2.add(jLabel2);
        } else {
            JLabel jLabel2 = new JLabel("C2 " );
            //Adding JLabel "jLabel2" to the JPanel "jPanel2".
            jPanel2.add(jLabel2);
        }
//Initializing the object
//"jLabel3" of the JLabel class.

        if ( numberOfFiles >= 3 ) {
            cPanel.add(jPanel3 , "3");
            JLabel jLabel3 = new JLabel( actualFiles.get(numberOfFiles -3));
            //Adding JLabel "jLabel3" to the JPanel "jPanel3".
            jPanel3.add(jLabel3);
        } else {
            JLabel jLabel3 = new JLabel("C3 " );
            jPanel3.add(jLabel3);
        }
//Initializing the object
//"jLabel4" of the JLabel class.

        if ( numberOfFiles >= 4 ) {
            cPanel.add(jPanel4 , "4");
            JLabel jLabel4 = new JLabel( actualFiles.get(numberOfFiles -4));
//Adding JLabel "jLabel4" to the JPanel "jPanel4".
            jPanel4.add(jLabel4);
        } else {
            JLabel jLabel4 = new JLabel("C4 " );
            //Adding JLabel "jLabel4" to the JPanel "jPanel4".
            jPanel4.add(jLabel4);
        }


/////////////////////////////////////////////////////////////////////////4. More image been generated  //////////////////   3. adjustment



        if ( numberOfFiles >= 1 ) {
            //Add the "jPanel1" on cPanel
            cPanel.add(jPanel1, "1");
            ImageIcon imag1 = new ImageIcon(actualFiles.get(numberOfFiles -1));
            imagw = imag1.getIconWidth();
            imagh = imag1.getIconHeight();

            if (imagh > maxHeight) {
                double ww = imagw*maxHeight/imagh;
                w = (int) ww;
                h= maxHeight;
            } else {
                w = imagw;
                h = imagh;
            }
            w = imagw;
            h = imagh-40;

            imag1.setImage(imag1.getImage().getScaledInstance(w,h, java.awt.Image.SCALE_DEFAULT));
            JLabel pic1 = new JLabel(imag1);
            jPanel1.add(pic1);
        }

        if ( numberOfFiles >= 2 ) {
//Add the "jPanel2" on cPanel
            cPanel.add(jPanel2, "2");
            ImageIcon imag2 = new ImageIcon(actualFiles.get(numberOfFiles -2));
            imagw = imag2.getIconWidth();
            imagh = imag2.getIconHeight();

            if (imagh > maxHeight) {
                double ww = imagw*maxHeight/imagh;
                w = (int) ww;
                h= maxHeight;
            } else {
                w = imagw;
                h = imagh;
            }
            w = imagw;
            h = imagh-40;

            imag2.setImage(imag2.getImage().getScaledInstance(w,h, java.awt.Image.SCALE_DEFAULT));
            JLabel pic2 = new JLabel(imag2);
            jPanel2.add(pic2);
        }

        if ( numberOfFiles >= 3 ) {
//Add the "jPanel3" on cPanel
            cPanel.add(jPanel3, "3");
            ImageIcon imag3 = new ImageIcon(actualFiles.get(numberOfFiles -3));

            imagw = imag3.getIconWidth();
            imagh = imag3.getIconHeight();

            if (imagh > maxHeight) {
                double ww = imagw*maxHeight/imagh;
                w = (int) ww;
                h= maxHeight;
            } else {
                w = imagw;
                h = imagh;
            }
            w = imagw;
            h = imagh-40;

            imag3.setImage(imag3.getImage().getScaledInstance(w,h, java.awt.Image.SCALE_DEFAULT));
            JLabel pic3 = new JLabel(imag3);
            jPanel3.add(pic3);
        }

        if ( numberOfFiles >= 4 ) {
//Add the "jPanel4" on cPanel
            cPanel.add(jPanel4, "4");
            ImageIcon imag4 = new ImageIcon(actualFiles.get(numberOfFiles -4));
            imagw = imag4.getIconWidth();
            imagh = imag4.getIconHeight();



            if (imagh > maxHeight) {
                double ww = imagw*maxHeight/imagh;
                w = (int) ww;
                h = maxHeight;
            } else {
                w = imagw;
                h = imagh;
            }
            w = imagw;
            h = imagh-40;

            imag4.setImage(imag4.getImage().getScaledInstance(w,h, java.awt.Image.SCALE_DEFAULT));
            JLabel pic4 = new JLabel(imag4);
            jPanel4.add(pic4);
        }

//////////////////////////////////////////////////////////////////////////////////////

//Creating an Object of the "JPanel" class
        JPanel btnPanel = new JPanel();

//Initializing the object
//"firstButton" of the JButton class.
        JButton firstButton = new JButton("First");

//Initializing the object
//"nextButton" of the JButton class.
        JButton nextButton = new JButton("->");

//Initializing the object
//"previousbtn" of JButton class.
        JButton previousButton = new JButton("<-");

//Initializing the object
//"lastButton" of the JButton class.
        JButton lastButton = new JButton("Last");

//Initializing the object
//"transfertButton" of the JButton class.
        JButton transferButton = new JButton("Transfer image");

//Adding the JButton "firstbutton" on the JPanel.
//btnPanel.add(firstButton);

//Adding the JButton "nextButton" on the JPanel.
//btnPanel.add(nextButton);

//Adding the JButton "previousButton" on the JPanel.
//btnPanel.add(previousButton);

//Adding the JButton "lastButton" on the JPanel.
//btnPanel.add(lastButton);

//Adding the JButton "transferButton" on the JPanel.
        btnPanel.add(transferButton);

//adding firstButton in the ActionListener
        firstButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

//using the first cObjl CardLayout
                cObjl.first(cPanel);

//value of currCard is 1
                currCard = 1;
            }
        });

//add lastButton in ActionListener
        lastButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

//using the last cObjl CardLayout
                cObjl.last(cPanel);

//value of currCard is 4
                currCard = numberOfCards;                //
            }
        });

//add nextButton in ActionListener
        nextButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                if (currCard < numberOfCards)
                {

//increase the value of currCard by 1
                    currCard = currCard + 1;

//show the value of currCard
                    cObjl.show(cPanel, "" + (currCard));
                }
            }
        });

//add previousButton in ActionListener
        previousButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                if (currCard > 1)
                {

//decrease the value
//of currCard by 1
                    currCard = currCard - 1;

//show the value of currCard
                    cObjl.show(cPanel, "" + (currCard));
                }
            }
        });
///////////////////////////Adding button for transfer
//add previousButton in ActionListener
        transferButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                transferIndex = currCard -1;
//System.out.println("Not implemented in this version");
//System.out.println("transfer active image nr  " + transferIndex );
//System.out.println(actualFiles.get(transferIndex ));
                try {
                    SendResponse overfoer = new SendResponse(actualFiles.get(transferIndex ));
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        });
//using to get the content pane
        getContentPane().add(cPanel, BorderLayout.NORTH);

//using to get the content pane
        getContentPane().add(btnPanel, BorderLayout.SOUTH);
    }
/*
BufferedImage newImage = new BufferedImage( actualFiles(0));
public BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
Graphics2D graphics2D = resizedImage.createGraphics();
graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
graphics2D.dispose();
return resizedImage;
}
*/
/*
//Main methods for testing
//main method
public void main(String argvs[])
{

//Creating an object of the Transfer class.
Transfer cll = new Transfer();

//method to set the default operation of the JFrame.
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//method to set the visibility of the JFrame.
cll.setVisible(true);
}
*/
}










