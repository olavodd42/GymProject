package com.gymproject;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javax.swing.text.MaskFormatter;

public class InputMasks {

    private final MaskFormatter mf = new MaskFormatter();
    private TextField tf;
    private String charValid;
    private String mask;
    @FXML
    private MenuButton plano;

    //public InputMasks() {
        //mf = new MaskFormatter();
    //}

    public void format(TextField tf, String charValid, String mask) {
        try {
            mf.setMask(mask);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

        mf.setValidCharacters(charValid);
        mf.setValueContainsLiteralCharacters(false);
        String text = tf.getText().replaceAll("[\\W]", "");

        boolean repetir = true;
        while (repetir) {

            char ultimoCaractere;

            if (text.equals("")) {
                break;
            } else {
                ultimoCaractere = text.charAt(text.length() - 1);
            }

            try {
                text = mf.valueToString(text);
                repetir = false;
            } catch (ParseException ex) {
                text = text.replace(ultimoCaractere + "", "");
                repetir = true;
            }

        }

        tf.setText(text);

        if (!text.equals("")) {
            for (int i = 0; tf.getText().charAt(i) != ' ' && i < tf.getLength() - 1; i++) {
                tf.forward();
            }
        }
    }

    public void format(){
        format(this.tf, this.charValid, this.mask);
    }

    /**
     * @return the tf
     */
    public TextField getTf() {
        return tf;
    }

    /**
     * @param tf the tf to set
     */
    public void setTf(TextField tf) {
        this.tf = tf;
    }

    /**
     * @return the charValid
     */
    public String getcharValid() {
        return charValid;
    }

    /**
     * @param charValid the charValid to set
     */
    public void setCharValid(String charValid) {
        this.charValid = charValid;
    }

    public String getMask() {
        return mask;
    }

    /**
     * @param mask the mask to set
     */
    public void setMask(String mask) {
        this.mask = mask;
    }


}