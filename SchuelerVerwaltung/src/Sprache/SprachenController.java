package Sprache;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import anwendungslogik.SchülerID;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class SprachenController {

    @FXML
    private Button btSpracheÄndernArabisch;
//
    @FXML
    private ChoiceBox<String> cbTürkischNiveau;

    @FXML
    private ChoiceBox<String> cbArabischNiveau;


    @FXML
    private CheckBox ckEnglisch;

    @FXML
    private CheckBox ckSonstiges;

    @FXML
    private TextField tfTitel;

    @FXML
    private TextField tfSchülerID;

    @FXML
    private TextArea taText;

    @FXML

    private CheckBox ckDeutsch;

    @FXML
    private TextField tfSonstigesNiveau;

    @FXML
    private ChoiceBox<String> cbDeutschNiveau;

    @FXML
    private Button btAnlegenÄndern;

    @FXML
    private Button btSpracheÄndernDeutsch;

    @FXML
    private Button btAuslesen;

    @FXML
    private TextField tfSprachen;


    @FXML
    private CheckBox ckArabisch;

    @FXML
    private ChoiceBox<String> cbSonstigesNiveau;

   @FXML
   private ChoiceBox<String> cbEnglischNiveau;

   @FXML
   private CheckBox ckTürkisch;


	    @FXML
	    void anlegenÄndern(ActionEvent event)
	    {
	    	if(ckDeutsch.isSelected() && cbDeutschNiveau.getValue()!= null)
	    	{
	    		sprechen lsprechen = new sprechen(cbDeutschNiveau.getValue(),"deutsch");
	    		SchülerID lID = new SchülerID();
	    		lID.setSchülerID(Integer.parseInt(tfSchülerID.getText()));
	    		lsprechen.speichernDB(lID);
	    	}

	    	if(ckEnglisch.isSelected() && cbEnglischNiveau.getValue()!= null)
	    	{
	    		sprechen lsprechen = new sprechen(cbEnglischNiveau.getValue(),"englisch");
	    		SchülerID lID = new SchülerID();
	    		lID.setSchülerID(Integer.parseInt(tfSchülerID.getText()));
	    		lsprechen.speichernDB(lID);
	    	}

	    	if(ckTürkisch.isSelected() && cbTürkischNiveau.getValue()!= null)
	    	{
	    		sprechen lsprechen = new sprechen(cbTürkischNiveau.getValue(),"tuerkisch");
	    		SchülerID lID = new SchülerID();
	    		lID.setSchülerID(Integer.parseInt(tfSchülerID.getText()));
	    		lsprechen.speichernDB(lID);
	    	}

	    	if(ckArabisch.isSelected() && cbArabischNiveau.getValue()!= null)
	    	{
	    		sprechen lsprechen = new sprechen(cbArabischNiveau.getValue(),"arabisch");
	    		SchülerID lID = new SchülerID();
	    		lID.setSchülerID(Integer.parseInt(tfSchülerID.getText()));
	    		lsprechen.speichernDB(lID);
	    	}

	    }
	/*    @FXML
	    void auslesen(ActionEvent event)
	    {


	       sprechen lsprechen = new sprechen( Integer.parseInt(tfSprachen.getText()) );

	       lsprechen.ergänzen();
	       ckDeutsch.setSelected(lsprechen.getSprachenDeutsch());
	       ckEnglisch.setSelected(lsprechen.getSprachenEnglisch());
	       ckTürkisch.setSelected(lsprechen.getSprachenTürkisch());
	       ckArabisch.setSelected(lsprechen.getSprachenArabisch());
	       ckSonstiges.setSelected(lsprechen.getSprachenSonstiges());
	       cbDeutschNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbEnglischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbTürkischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));
	       cbArabischNiveau.setId(String.valueOf(lsprechen.getSprachenNiveau()));


	    }*/

	    public void ladenChoiceBox()
	    {
	    	cbDeutschNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbEnglischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbTürkischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    	cbArabischNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	   // 	cbSonstigesNiveau.setItems(FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2"));
	    }

	    @FXML
	    public void initialize()
	    {
	    	ladenChoiceBox();
	    }


	    @FXML
	    void spracheÄndernDeutsch(ActionEvent event) {
	    	((Node)event.getTarget()).getScene().setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
	    	btSpracheÄndernDeutsch.getScene().setRoot(laden(new Locale("de" , "DE")));
	    }

	    @FXML
	    void spracheÄndernArabisch(ActionEvent event) {
	    	((Node)event.getTarget()).getScene().setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
	    	btSpracheÄndernArabisch.getScene().setRoot(laden(new Locale("ar" , "SY")));
	    }

	    private Parent laden(Locale pLocale)
	    {
	    	try
	    	{
	    		return FXMLLoader.load(getClass().getResource("SprachenView.fxml"),
	    			   ResourceBundle.getBundle("Sprache/SchülerManagerResourceBundle",
	    			   pLocale));
	    	}
	    	catch (IOException e)
	    	{
	    		e.printStackTrace();

	    	}
	    	return null;
	    }



}

