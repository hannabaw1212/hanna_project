package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControlMainMenu {


	// playbutton function that change to another page
		//till now we didn't made the other pages ,will work in the other iteration on it
		public void playButton(ActionEvent e)
		{
			try {
				((Node)e.getSource()).getScene().getWindow().hide();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NAMEOFFXML.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.show();
				}
				catch(Exception e1)
				{
					System.out.println("Cannot load window");
				}
		}
		// manage Question function that change to another page

		public void manageQuestionsButton(ActionEvent e)
		{
			try {
				((Node)e.getSource()).getScene().getWindow().hide();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NAMEOFFXML.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.show();
				}
				catch(Exception e1)
				{
					System.out.println("Cannot load window");
				}
		}
	      //game history function that change to another page
		public void gamesHistoryButton(ActionEvent e)
		{
			try {
				((Node)e.getSource()).getScene().getWindow().hide();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NAMEOFFXML.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.show();
				}
				catch(Exception e1)
				{
					System.out.println("Cannot load window");
				}
		}
	    //game info function that change to another page

		public void infoButton(ActionEvent e)
		{
			try {
				((Node)e.getSource()).getScene().getWindow().hide();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NAMEOFFXML.fxml"));
				Parent root = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root));
				stage.show();
				}
				catch(Exception e1)
				{
					System.out.println("Cannot load window");
				}
		}
		 

	}