/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ossaansweringmachine;

/**
 *
 * @author kossa
 */

public class Machine {
    
    private Messages messages;
    
    public void leaveMsg() {
        // this will go to recMsg() in messages
    }
    
    @SuppressWarnings("empty-statement")
    public void playMsg() {
        // this needs to access 'messages' arraylist from Messages class
        // counter to keep track of what message is being played
        int i;
        
       // for (i = 0; i =< messages.size(); i++) {
        
        }
    }
    
    public void stopMsg() {
        // not sure about this one yet?
    }
    
    public void anyMsg() {
        // checks messages arraylist for any messages
        // if arraylist=0, return No Messages
        // if arraylist contains => 1, give admin options
    }
    
    public void checkCallStop() {
        // if caller hung up, go to startOver
    }
    
    public void startOver() {
        // this will playMsg again
    }
}