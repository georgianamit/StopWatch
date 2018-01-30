/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watch;

/**
 *
 * @author spider
 */
public class Watch implements Runnable{
    int sec=0;
    int min =0;
    int hrs=0;

    /**
     * @param args the command line arguments
     */
    public Watch(){

    }
    
    public void run(){
        
        while(true){
        System.out.flush();
        sec++;
            
            if(sec == 60){
                sec = 0;
                min++;
            }
            if(min == 60){
                min =0;
                hrs++;
            }
            if(hrs < 10){
                System.out.print("0"+hrs+":");
            }else
                System.out.print(""+hrs+":");   
                        if(min < 10){
                System.out.print("0"+min+":");
            }else
                System.out.print(""+min+":");
            if(sec < 10){
                System.out.print("0"+sec);
            }else
                System.out.print(""+sec);


            
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("");
        }
    }

               
    public static void main(String[] args) {
        Thread t = new Thread(new Watch());
        t.start();
    }
    
}
