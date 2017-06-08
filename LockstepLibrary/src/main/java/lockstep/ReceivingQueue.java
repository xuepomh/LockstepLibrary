/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockstep;

import java.io.Serializable;
import lockstep.messages.simulation.FrameACK;

/**
 * Interface for the frame queues used at receiving side, provides methods to be
 * used by the receiver to treate the frames received.
 * 
 * Implementations specialize the behavior based on the needs of clients and
 * servers at extraction time.
 * 
 * @param <Command> Application class containing the data to transmit
 */
public interface ReceivingQueue<Command extends Serializable> {

    public FrameInput<Command> pop();
    
    public FrameInput<Command> head();
    
    public FrameACK push(FrameInput[] inputs);
    
    public FrameACK push(FrameInput input);
}