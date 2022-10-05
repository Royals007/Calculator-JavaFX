package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

public class FlaggenController {

	@FXML
	private Rectangle r1;
	@FXML
	private Rectangle r2;
	@FXML
	private Rectangle r3;
	@FXML
	private Rectangle r4_Japan;
	@FXML
	private Polygon p_Kuwait;
	@FXML
	private Polygon p_Jordanien;
	@FXML
	private Polyline pStar1_Jordanien;
	@FXML
	private Polyline pStar2_Jordanien;
	@FXML
	private Rectangle r5_Schweden;
	@FXML
	private Rectangle r6_Schweden;
	@FXML
	private Rectangle r7_Schweden;
	@FXML
	private Polygon p_Sudan;
	@FXML
	private Circle cJapan;
	@FXML
	private Circle outerCircle_Turkey;
	@FXML
	private Circle innerCircle_Turkey;
	@FXML
	private Polyline pStar_Turkey;
	@FXML
	private Polyline pstar1_China;
	@FXML
	private Polyline pstar2_China;
	@FXML
	private Polyline pstar3_China;
	@FXML
	private Polyline pstar4_China;
	@FXML
	private Polyline pstar5_China;
	@FXML
	private Label l_land;

	@FXML
	public void clear() {
		this.r1.setVisible(false);
		this.r2.setVisible(false);
		this.r3.setVisible(false);
		
		this.r4_Japan.setVisible(false);
		this.cJapan.setVisible(false);
		this.p_Kuwait.setVisible(false);
		this.p_Sudan.setVisible(false);
		this.r5_Schweden.setVisible(false);
		this.r6_Schweden.setVisible(false);
		this.r7_Schweden.setVisible(false);
		
		// Turkei
		this.outerCircle_Turkey.setVisible(false);
		this.innerCircle_Turkey.setVisible(false);
		this.pStar_Turkey.setVisible(false);
		
		//jordan
		this.p_Jordanien.setVisible(false);
		this.pStar1_Jordanien.setVisible(false);
		this.pStar2_Jordanien.setVisible(false);
		
		//china
		this.pstar1_China.setVisible(false);
		this.pstar2_China.setVisible(false);
		this.pstar3_China.setVisible(false);
		this.pstar4_China.setVisible(false);
		this.pstar5_China.setVisible(false);
		
	}
	
	@FXML
	public void rectangleVisible() {
		this.r1.setVisible(true);
		this.r2.setVisible(true);
		this.r3.setVisible(true);
	}
	
	// Deutschland
	@FXML
	public void zeichenDeutchland() {
		// Rechteck sichtbar machen
		clear();
		rectangleVisible();

		//erste Rechteck r1 bekommt die Farbe gelb
		this.r1.setFill(Color.BLACK);
		// zweite Rechteck r2 bekommt die Farbe Schwarz
		this.r2.setFill(Color.RED);
		// drites Rechteck r3 bekommt die Farbe rot
		this.r3.setFill(Color.YELLOW);
		this.l_land.setText("Das ist eine Deutschland - Flag");
	}

	// Frankreich
	@FXML
	public void zeichenFrankreich() {
		clear();
		rectangleVisible();
		this.r1.setFill(Color.BLUE);
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.RED);
		this.l_land.setText("Das ist eine Frankreich - Flag");
	}

	// Italien
	@FXML
	public void zeichenItalien() {
		clear();
		rectangleVisible();
		this.r1.setFill(Color.GREEN);
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.RED);
		this.l_land.setText("Das ist eine Italien - Flag");
	}
	
	// Schweden
	@FXML
	public void zeichenSchweden() {
		clear();
		this.r5_Schweden.setVisible(true);
		this.r6_Schweden.setVisible(true);
		this.r7_Schweden.setVisible(true);
		
		this.r5_Schweden.setFill(Color.BLUE);
		this.r6_Schweden.setFill(Color.YELLOW);
		this.r7_Schweden.setFill(Color.YELLOW);
		this.l_land.setText("Das ist eine Schweden - Flag");
		
	}
	
	// Ungarn
	@FXML
	public void zeichenUngarn() {
		clear();
		rectangleVisible();
		this.r1.setFill(Color.RED);
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.GREEN);
		this.l_land.setText("Das ist eine Ungarn - Flag");
		
	}
	
	// Japan
	@FXML
	public void zeichenJapan() {
		clear();
		this.r4_Japan.setVisible(true);
		this.cJapan.setVisible(true);
		
		this.r4_Japan.setFill(Color.WHITE);
		this.cJapan.setFill(Color.CRIMSON);
		this.l_land.setText("Das ist eine Japan - Flag");
	}
	
	// Sudan
	@FXML
	public void zeichenSudan() {
		clear();
		rectangleVisible();
		this.p_Sudan.setVisible(true);
		
		this.r1.setFill(Color.RED);
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.BLACK);
		this.p_Sudan.setFill(Color.GREEN);
		this.l_land.setText("Das ist eine Sudan - Flag");
	}
	
	// Kuwait
	@FXML
	public void zeichenKuwait() {
		clear();
		rectangleVisible(); 
		this.p_Kuwait.setVisible(true);
		
		this.r1.setFill(Color.GREEN); 
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.RED); 
		this.p_Kuwait.setFill(Color.BLACK);
		this.l_land.setText("Das ist eine Kuwait - Flag"); 		
	}
	
	// Turkei
	@FXML
	public void zeichenTurkei() {
		clear();
		this.r5_Schweden.setVisible(true);
		this.outerCircle_Turkey.setVisible(true);
		this.innerCircle_Turkey.setVisible(true);
		this.pStar_Turkey.setVisible(true);
		
		this.r5_Schweden.setFill(Color.RED);
		this.outerCircle_Turkey.setFill(Color.WHITE);
		this.innerCircle_Turkey.setFill(Color.RED);
		this.pStar_Turkey.setFill(Color.WHITE); ////////////// star
		this.l_land.setText("Das ist eine Turkei - Flag");		
	}
	
	// Jordanien -- perfect
	@FXML
	public void zeichenJordanien() {
		clear();
		rectangleVisible();
		this.p_Jordanien.setVisible(true);
		this.pStar1_Jordanien.setVisible(true);
		this.pStar2_Jordanien.setVisible(true);
		
		this.r1.setFill(Color.BLACK);
		this.r2.setFill(Color.WHITE);
		this.r3.setFill(Color.GREEN);
		this.p_Jordanien.setFill(Color.RED);
		this.pStar1_Jordanien.setFill(Color.WHITE);
		this.pStar2_Jordanien.setFill(Color.WHITE);
		this.l_land.setText("Das ist eine Jordanien - Flag");
	}
	
	// China
	@FXML
	public void zeichenChina() {
		clear();
		this.r5_Schweden.setVisible(true);
		this.pstar1_China.setVisible(true);
		this.pstar2_China.setVisible(true);
		this.pstar3_China.setVisible(true);
		this.pstar4_China.setVisible(true);
		this.pstar5_China.setVisible(true);
		
		this.r5_Schweden.setFill(Color.RED);
		this.pstar1_China.setFill(Color.YELLOW);
		this.pstar2_China.setFill(Color.YELLOW);
		this.pstar3_China.setFill(Color.YELLOW);
		this.pstar4_China.setFill(Color.YELLOW);
		this.pstar5_China.setFill(Color.YELLOW);
		this.l_land.setText("Das ist eine China - Flag");
	}
}
