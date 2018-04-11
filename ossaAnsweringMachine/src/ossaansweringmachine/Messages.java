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
import java.util.List;

public class Messages {
    
    private List<String> messages;
    
    public void msgArray() {
        messages = new ArrayList<String>();
    }
    
    public List<String> getMessages() {
        return messages;
    }
    
    public void delMsg() {
        // deletes messages from arraylist
        // javaFX function here
        
        currentMsg();
        
    }
    
    public void saveMsg(String msg) {
        // option to save any recorded messages
        // this will be an arraylist of messages
        
        messages.add(msg);
    }
    
    public void recMsg() {
        // will take input from caller
    }
    
    public void currentMsg() {
        // finds out what the current message being displayed
        
        
        
        
    }
}