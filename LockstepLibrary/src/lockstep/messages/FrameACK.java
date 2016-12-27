/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockstep.messages;

/**
 *
 * @author Raff
 */
public class FrameACK implements java.io.Serializable
{
    public int hostID;
    public final int cumulativeACK;
    public final int[] selectiveACKs;
    
    public FrameACK(int hostID, int cumulativeACK, int[] selectiveACKs)
    {
        this.hostID = hostID;
        this.cumulativeACK = cumulativeACK;
        this.selectiveACKs = selectiveACKs;
    }
    
    public FrameACK(int cumulativeACK, int[] selectiveACKs)
    {
        this.cumulativeACK = cumulativeACK;
        this.selectiveACKs = selectiveACKs;
        this.hostID = -1;
    }
    
    public int getHostID()
    {
        return hostID;
    }
    
    public void setHostID(int hostID)
    {
        this.hostID = hostID;
    }
}
