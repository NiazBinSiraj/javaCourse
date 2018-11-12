package ch.makery.address.view;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class RootLayoutController implements Initializable{
	
	@FXML
    private MenuItem menuClose;

    @FXML
    private MenuItem menuAbout;

    @FXML
    void handleMenuAction(ActionEvent event) {
    	if(event.getSource() == menuClose)
    	{
    		System.exit(0);
    	}
    	
    	else if(event.getSource() == menuAbout)
    	{
    		try {
    		    Desktop.getDesktop().browse(new URL("https://paste.ubuntu.com/p/tb3YMgm8gK/").toURI());
    		} catch (IOException e) {
    		    e.printStackTrace();
    		} catch (URISyntaxException e) {
    		    e.printStackTrace();
    		}
    	}
    }
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
}
