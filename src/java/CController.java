/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
@Named(value = "cController")
@SessionScoped
public class CController implements Serializable {
    
    private int number;

    /**
     * Creates a new instance of CController
     */
    public CController() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void calculate(int choice)
    {
    switch(choice)
    {
        case 0:
            break;
    
            case 1:
            break;

    }
    }
    
}
