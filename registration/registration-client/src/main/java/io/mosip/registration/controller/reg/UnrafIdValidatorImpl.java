package io.mosip.registration.controller.reg;

import org.springframework.stereotype.Component;

/**
 * Class for validation of the UNRafID Field
 */
@Component
public class UnrafIdValidatorImpl{

    private String unrafIdRegex = "\\d{8}";
    public boolean validateId(String unrafId) {
        if (unrafId.matches(unrafIdRegex)) {
            return true;
        }else {
            return false;
        }
    }
}
