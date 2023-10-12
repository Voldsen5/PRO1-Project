package aarhus;

public class gem {
    private final Button btnRegnRabat = new Button("Regn Rabat");

    private final TextField txfRabatSamletPris = new TextField();
    private final Label lblRabatSamletPris = new Label("Pris med Rabat: ");

    HBox hboxRabat = new HBox(lblRabatSamletPris,txfRabatSamletPris);
        pane.add(hboxRabat,1,4);
        txfRabatSamletPris.setMaxWidth(100);
        txfRabatSamletPris.setEditable(false);
        GridPane.setValignment(lblRabatSamletPris,VPos.BOTTOM);

        btnRegnRabat.setOnAction(event -> this.rabatfelt());


    TextField rabat;

    this.rabat = rabat;

    TextField rabat

        if (!rabat.getText().isEmpty()){
        kvittering.appendText("Samlet Pris På Ordre: "+rabat.getText()+"\n");
    } else if (rabat.getText().isEmpty()) {
        kvittering.appendText("Samlet Pris På Ordre: "+Controller.SamletOrdrePris()+"\n");
    }








}
