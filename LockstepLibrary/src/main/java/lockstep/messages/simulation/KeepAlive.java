/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockstep.messages.simulation;

import java.io.Serializable;

/**
 * Void message to be sent in order to keep the connection alive while there is
 * nothing else to send
 */
public class KeepAlive implements Serializable {
    
}
