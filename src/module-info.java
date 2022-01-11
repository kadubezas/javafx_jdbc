module javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui;
	opens model.entities;
	opens model.services;
}
