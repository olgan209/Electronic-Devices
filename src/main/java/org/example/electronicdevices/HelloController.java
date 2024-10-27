package org.example.electronicdevices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label label;
    @FXML
    private RadioButton smartphone;
    @FXML
    private RadioButton tablet;
    @FXML
    private RadioButton laptop;
    @FXML
    private Button add;
    @FXML
    private Button remove;
    @FXML
    private TextField name;
    @FXML
    private TextField price;
    @FXML
    private TextField weight;
    @FXML
    private TextField addition1;
    @FXML
    private TextField addition2;
    @FXML
    private ListView<Device> listView;

    private ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(devices);

        // Group the RadioButtons so only one can be selected at a time
        ToggleGroup deviceTypeGroup = new ToggleGroup();
        smartphone.setToggleGroup(deviceTypeGroup);
        tablet.setToggleGroup(deviceTypeGroup);
        laptop.setToggleGroup(deviceTypeGroup);

        // Add listeners for each RadioButton
        smartphone.setOnAction(event -> setSmartphonePrompts());
        tablet.setOnAction(event -> setTabletPrompts());
        laptop.setOnAction(event -> setLaptopPrompts());
    }

    // Methods to set prompt texts based on device type selection
    private void setSmartphonePrompts() {
        addition1.setPromptText("Screen Size (in inches)");
        addition2.setPromptText("Camera Resolution (in MP)");
    }

    private void setTabletPrompts() {
        addition1.setPromptText("Battery Life (in hours)");
        addition2.setPromptText("Has Stylus (yes/no)");
    }

    private void setLaptopPrompts() {
        addition1.setPromptText("RAM Size (in GB)");
        addition2.setPromptText("Processor Type");
    }

    @FXML
    void onAddClick(ActionEvent event) {
        if (smartphone.isSelected()) {
            Smartphone sm = new Smartphone();
            sm.setName(name.getText());
            sm.setType(DeviceType.SMARTPHONE);
            sm.setPrice(Double.parseDouble(price.getText()));
            sm.setWeight(Double.parseDouble(weight.getText()));
            sm.setScreenSize(Double.parseDouble(addition1.getText()));
            sm.setCameraResolution(Double.parseDouble(addition2.getText()));
            devices.add(sm);
        } else if (tablet.isSelected()) {
            Tablet t = new Tablet();
            t.setName(name.getText());
            t.setType(DeviceType.TABLET);
            t.setPrice(Double.parseDouble(price.getText()));
            t.setWeight(Double.parseDouble(weight.getText()));
            t.setBatteryLife(Double.parseDouble(addition1.getText()));
            t.setHasStylus(addition2.getText().equalsIgnoreCase("yes"));
            devices.add(t);
        } else if (laptop.isSelected()) {
            Laptop l = new Laptop();
            l.setName(name.getText());
            l.setType(DeviceType.LAPTOP);
            l.setPrice(Double.parseDouble(price.getText()));
            l.setWeight(Double.parseDouble(weight.getText()));
            l.setRamSize(Integer.parseInt(addition1.getText()));
            l.setProcessorType(addition2.getText());
            devices.add(l);
        }
    }
    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }
}
