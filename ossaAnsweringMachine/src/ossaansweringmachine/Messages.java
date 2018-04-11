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
import java.util.ArrayList;

public class Messages {
    
    ArrayList<String> messages = new ArrayList<>();
    
    public void delMsg() {
        // deletes messages from arraylist
    }
    
    public void saveMsg(String msg) {
        // option to save any recorded messages
        // this will be an arraylist of messages
        
        messages.add(msg);
    }
    
    public void recMsg() {
        // will take input from caller
    }
}