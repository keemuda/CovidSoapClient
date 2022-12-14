/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import services.Covidweek;

/**
 *
 * @author Chayodom
 */
public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Covidweek cov = findCovidDatabyseq(4);
    
            System.out.println("ปีที่แถลง : " + cov.getCovidyear());
            System.out.println("สัปดาห์ที่แถลง : " + cov.getWeeknum());
            System.out.println("จำนวนผู้ป่วยรายใหม่ : " + cov.getNewCase());
            System.out.println("จำนวนผู้ป่วยสะสม : " + cov.getTotalCase());
            System.out.println("จำนวนผู้ป่วยรายใหม่ในไทย : " + cov.getNewCaseExcludeabroad());
            System.out.println("จำนวนผู้ป่วยสะสมในไทย : " + cov.getTotalCaseExcludeabroad());
            System.out.println("จํานวนผู้ป่วยรักษาหายรายใหม่ : " + cov.getNewRecovered());
            System.out.println("จํานวนผู้ป่วยรักษาหายสะสม : " + cov.getTotalRecovered());
            System.out.println("จํานวนผู้ป่วยตายรายใหม่ : " + cov.getNewDeath());
            System.out.println("จํานวนผู้ป่วยตายสะสม : " + cov.getTotalDeath());
            System.out.println("จํานวนผู้ป่วยที่มาจากต่างประเทศ : " + cov.getCaseForeign());
            System.out.println("จํานวนผู้ป่วยที่อยู่ในเรือนจํา : " + cov.getCasePrison());
            System.out.println("จํานวนผู้ป่วยที่เข้ามารับการตรวจ ณ จุดบริการ : " + cov.getCaseWalkin());
            System.out.println("จํานวนผู้ป่วยวันก่อนหน้าของวันปัจจุบัน : " + cov.getCaseNewPrev());
            if(cov.getCaseNewDiff()>=0){System.out.println("จํานวนการเพิ่มขึ้น ของผู้ป่วย : " + cov.getCaseNewDiff());}
            else{System.out.println("จํานวนการลดลง ของผู้ป่วย : " + Math.abs(cov.getCaseNewDiff()));}
            
            
            System.out.println("จํานวนผู้เสียชีวิตวันก่อนหน้าของวันปัจจุบัน : " + cov.getDeathNewPrev());
            
            if(cov.getDeathNewDiff()>=0){System.out.println("จํานวนการเพิ่มขึ้น ของผู้เสียชีวิต : " + cov.getDeathNewDiff());}
            else{System.out.println("จํานวนการลดลง ของผู้เสียชีวิต : " + Math.abs(cov.getDeathNewDiff()));}
            
            System.out.println("วันที่ปรับปรุง service ล่าสุด : " + cov.getUpdateDate());
    }

    private static Covidweek findCovidDatabyseq(int seq) {
        services.SoapDBService_Service service = new services.SoapDBService_Service();
        services.SoapDBService port = service.getSoapDBServicePort();
        return port.findCovidDatabyseq(seq);
    }
    
}
