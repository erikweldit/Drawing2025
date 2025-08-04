package com.example.application.weld;






import com.example.application.under.ExtraImage;
import com.example.application.views.list.MainLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import java.util.ArrayList;

/**
 * Class for manipulation of images in storages
 * System gives up to 4 images in store on the same page
 *
 *@author Erik Andreas Vold -  erikvold84@gmail.com
 */
@AnonymousAllowed
@Route(value = "atestnew", layout = MainLayout.class)
@PageTitle("Weld IT AS - Menu for weld drawing")

@RouteAlias(value = "", layout = MainLayout.class)
public class ImageStorageNew {

    /////////////////////////////////////////////////////////////
    public ArrayList<ExtraImage> imageList = new ArrayList<>();
    private String userID = CalcValues.userID;
    int userIndex ;

    ////////////////////////////////////////////////////////////
    public  String svgString0;
    public String svgString14;
    public  String svgString7;
    public  String svgString8;
    public  String svgString9;
    public  String svgString10;
    public  String svgString11;
    public  String svgString12;
    public  String svgString15;
    public  String svgString16;
    public  String svgString;
    int ant = 17;
    int[] gang = new int[25];
    public  boolean[] inBuffer = new boolean[17];


    /**
     * Constructor empty the input buffer ang give it to
     * static buffer in class CalcValues
     */
    public ImageStorageNew() {
        boolean registrert = false;

        //ingen user er registrert listen
        if (imageList.size() == 0 ){
            ExtraImage im = new ExtraImage(userID);
            imageList.add(im);
            userIndex = 0;
            registrert = true;
        } else {
            for (int i = 0; i < imageList.size(); i++) {
                ExtraImage tt = imageList.get(i);
                if (tt.getUserID().equals(userID)) {
                    // denne bruker er registret allerede
                    System.out.println("userID indeks " + i);
                    userIndex = i;
                    registrert = true;
                }
            }
        }
        // registrerer en ny bruker
        if (!registrert){
            userIndex = imageList.size();
            ExtraImage imm = new ExtraImage(userID);
            imageList.add(userIndex, imm);
        }

        initializeValues(userIndex);

/////////////////////////////////////////////////////////////////////////////////////////
        for ( int i=0; i<ant; ant++) {
            //     inBuffer[i] = false;
        }
        svgString = "";
        this.gang = CalcValues.gang;
    }
    /// end konstruktør

    public void initializeValues(int userIndex){

        ExtraImage imageRep = imageList.get(userIndex);
        svgString0 = imageRep.getSvgS13();
        svgString14 = imageRep.getSvgS14();
        svgString7 = imageRep.getSvgS7();
        svgString8 = imageRep.getSvgS8();
        svgString9 = imageRep.getSvgS9();
        svgString10 = imageRep.getSvgS10();
        svgString11 = imageRep.getSvgS11();
        svgString12 = imageRep.getSvgS12();
        svgString15 = imageRep.getSvgS15();
        svgString16 = imageRep.getSvgS16();
        svgString   = imageRep.getSvgS();
        inBuffer[0] = imageRep.isInBuff13();
        inBuffer[1] = false;
        inBuffer[2] = false;
        inBuffer[3] = false;
        inBuffer[4] = false;
        inBuffer[5] = false;
        inBuffer[6] = false;
        inBuffer[7] = imageRep.isInBuff7();
        inBuffer[8] = imageRep.isInBuff8();
        inBuffer[9] = imageRep.isInBuff9();
        inBuffer[10] = imageRep.isInBuff10();
        inBuffer[11] = imageRep.isInBuff11();
        inBuffer[12] = imageRep.isInBuff12();
        inBuffer[13] = imageRep.isInBuff13();
        inBuffer[14] = imageRep.isInBuff14();
        inBuffer[15] = imageRep.isInBuff15();
        inBuffer[16] = imageRep.isInBuff16();

    }
    public void emptyBuffer(){
        for ( int i=0; i<ant; ant++) {
            inBuffer[i] = false;
        }
        svgString0 = "";
        svgString14 = "";
        svgString7 = "";
        svgString8 = "";
        svgString9 = "";
        svgString10 = "";
        svgString11 = "";
        svgString12 = "";
        svgString15 = "";
        svgString16 = "";
        svgString = "";


    }
    /**
     *  Set svgString0 from svgString
     * @param svgString
     */
    public void setSvgString0(String svgString)
    {
        String localSvg = svgString;
        svgString0 = localSvg;
        inBuffer[0] = true;
    }

    /**
     * get svgString0
     * @return
     */
    public String getSvgString0()
    {
        return svgString0;
    }
    /**
     *  Set svgString4 from svgString
     * @param svgString
     */
    public void setSvgString14(String svgString)
    {
        String localSvg = svgString;
        svgString14 = localSvg;
        inBuffer[14] = true;
    }
    /**
     * get svgString14
     * @return
     */
    public String getSvgString14()
    {
        return svgString14;
    }
    /**
     *  Set svgString15 from svgString
     * @param svgString
     */
    public void setSvgString15(String svgString)
    {
        String localSvg = svgString;
        svgString15 = localSvg;
        inBuffer[15] = true;
        inBuffer[7] = false;
        inBuffer[9] = false;
        inBuffer[11] = false;
        inBuffer[12] = false;
    }
    /**
     * get svgString15
     * @return
     */
    public String getSvgString15()
    {
        return svgString15;
    }
    /**
     *  Set svgString16 from svgString
     * @param svgString
     */
    public void setSvgString16(String svgString)
    {
        String localSvg = svgString;
        svgString16 = localSvg;
        inBuffer[16] = true;
        inBuffer[8] = false;
        inBuffer[10] = false;
        inBuffer[11] = false;
        inBuffer[12] = false;
    }
    /**
     * get svgString16
     * @return
     */
    public String getSvgString16()
    {
        return svgString16;
    }
    /**
     *  Set svgString11 from svgString
     * @param svgString
     */
    public void setSvgString11(String svgString)
    {
        String localSvg = svgString;
        svgString11 = localSvg;
        inBuffer[11] = true;
        inBuffer[7] = false;
        inBuffer[8] = false;
        inBuffer[15] = false;
        inBuffer[16] = false;
    }
    /**
     * get svgString11
     * @return
     */
    public String getSvgString11()
    {
        return svgString11;
    }
    /**
     *  Set svgString12 from svgString
     * @param svgString
     */
    public void setSvgString12(String svgString)
    {
        String localSvg = svgString;
        svgString12 = localSvg;
        inBuffer[12] = true;
        inBuffer[9] = false;
        inBuffer[10] = false;
        inBuffer[15] = false;
        inBuffer[16] = false;
    }
    /**
     * get svgString12
     * @return
     */
    public String getSvgString12()
    {
        return svgString12;
    }
    /**
     *  Set svgString7 from svgString
     * @param svgString
     */
    public void setSvgString7(String svgString)
    {
        String localSvg = svgString;
        svgString7 = localSvg;
        inBuffer[7] = true;
        inBuffer[11] = false;
        inBuffer[15] = false;
    }
    /**
     * get svgString7
     * @return
     */
    public String getSvgString7()
    {
        return svgString7;
    }
    /**
     *  Set svgString8 from svgString
     * @param svgString
     */
    public void setSvgString8(String svgString)
    {
        String localSvg = svgString;
        svgString8 = localSvg;
        inBuffer[8] = true;
        inBuffer[11] = false;
        inBuffer[16] = false;
    }
    /**
     * get svgString8
     * @return
     */
    public String getSvgString8()
    {
        return svgString8;
    }
    /**
     *  Set svgString9 from svgString
     * @param svgString
     */
    public void setSvgString9(String svgString)
    {
        String localSvg = svgString;
        svgString9 = localSvg;
        inBuffer[9] = true;
        inBuffer[12] = false;
        inBuffer[15] = false;
    }
    /**
     * get svgString9
     * @return
     */
    public String getSvgString9()
    {
        return svgString9;
    }
    /**
     *  Set svgString10 from svgString
     * @param svgString
     */
    public void setSvgString10(String svgString)
    {
        String localSvg = svgString;
        svgString10 = localSvg;
        inBuffer[10] = true;
        inBuffer[12] = false;
        inBuffer[16] = false;
//        System.out.println(" verdi 10 " + svgString10.length());
    }
    /**
     * get svgString10
     * @return
     */
    public String getSvgString10()
    {
        return svgString10;
    }
    /**
     *  Set svgString from svgString
     * @param svgString
     */
    public void setSvgString(String svgString)
    {
        String localSvg = svgString;
        svgString = localSvg;
    }

    /**
     * Method collect actual inages from buffer ang store them on the same page
     * @return svgString
     */
    public String getSvgString()
    {
        if ( gang[2] == 0 ){
            svgString = svgString0;
        }
        if ( gang[2] == 14 ){
            svgString = svgString14;
        }
        if ( gang[2] == 15 ){
            svgString = svgString15;
        }
        if ( gang[2] == 16 ){
            svgString = "";
            if(inBuffer[7])
                svgString = svgString + svgString7;
            if(inBuffer[9])
                svgString = svgString + svgString9;
            if(inBuffer[15])
                svgString = svgString + svgString15;
            if(inBuffer[16])
                svgString = svgString + svgString16;
        }
        if ( gang[2] == 11 ){
            svgString = svgString11;
        }
        if ( gang[2] == 12 ){
            svgString = "";
            if(inBuffer[7])
                svgString = svgString + svgString7;
            if(inBuffer[8])
                svgString = svgString + svgString8;
            if(inBuffer[11])
                svgString = svgString + svgString11;
            if(inBuffer[12])
                svgString = svgString + svgString12;
        }
        if ( gang[2] == 7 ){
            svgString = svgString7;
        }
        if ( gang[2] == 8 ){
            svgString = svgString8;
        }
        if ( gang[2] == 9 ){
            svgString = svgString9;
        }
        if ( gang[2] == 10 ){
            svgString = "";
            if(inBuffer[7])
                svgString = svgString + svgString7;
            if(inBuffer[8])
                svgString = svgString + svgString8;
            if(inBuffer[9])
                svgString = svgString + svgString9;
            if(inBuffer[10])
                svgString = svgString + svgString10;
            if(inBuffer[11])
                svgString = svgString + svgString11;
            if(inBuffer[15])
                svgString = svgString + svgString15;

        }
        if ( gang[2] == 10 || gang[2] == 12 || gang[2] == 16 ) {
            for ( int i=0; i<17; i++) {
                //      inBuffer[i] = false;
            }
        }
        //     System.out.println("har kommet hit ");
        for ( int i=0; i<17; i++) {
            //          System.out.println( "tall " + i + "  " + inBuffer[i] );
        }
        //      System.out.println("Endelig lengde image " + gang[2] + "  "  + svgString.length());
        return svgString;
    }
}




