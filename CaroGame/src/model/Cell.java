package model;

import javax.swing.*;
public class Cell extends JButton{
    private boolean status=false;
    private boolean X;
    private boolean O;
    
    /*
     * X --> value = 1
     * O --> value = 2
     * */
    private int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public Cell(boolean status) {
        super();
        this.status = status;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setX(boolean X) {
        this.X = X;
    }
    public boolean isX() {
        return this.X;
    }
    public void setO(boolean O) {
        this.O = O;
    }
    public boolean isO() {
        return this.O;
    }
     
    
}
