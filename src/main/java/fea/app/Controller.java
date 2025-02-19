package fea.app;

import javafx.fxml.FXML;

public class Controller {
    boolean maleRobin = true;

    @FXML
    public void switchRobin()
    {
        if(!maleRobin)
        {
            maleRobin = true;
            System.out.println("Robin Gender switched to male");
        }
        else
        {
            maleRobin = false;
            System.out.println("Robin Gender switched to female");
        }



    }
}
