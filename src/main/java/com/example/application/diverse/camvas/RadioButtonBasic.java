package com.example.application.diverse.camvas;



import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.radiobutton.RadioGroupVariant;
import com.vaadin.flow.router.Route;

//@Route("radio-button-basic")
public class RadioButtonBasic extends Div {

    public RadioButtonBasic() {
        RadioButtonGroup<String> radioGroup = new RadioButtonGroup<>();
        radioGroup.addThemeVariants(RadioGroupVariant.LUMO_VERTICAL);
        radioGroup.setLabel("Travel class");
        radioGroup.setItems("Economy", "Business", "First Class");
        add(radioGroup);
    }

}

