package it.gniado.bets.validator;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("checkboxValidator")
public class CheckboxValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        List<Object> selectedCheckbox = (List<Object>) value;
        if (((List<Object>) value).size() != 2) {
            throw new ValidatorException(new FacesMessage("Musisz wybrać dokładnie dwie drużyny"));
        }
    }
}
