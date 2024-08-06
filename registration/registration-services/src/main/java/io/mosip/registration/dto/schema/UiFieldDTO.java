package io.mosip.registration.dto.schema;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.mosip.registration.constants.RegistrationConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class is a DTO which parses with UI Spec json, which decides of how
 * the UI element should be displayed and validated.
 * 
 * And also it contains the validators to validate the respective UI element,
 * label name,controlType, format,whether it is required or not.
 * 
 * @author YASWANTH S
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UiFieldDTO {

	private String id;
	private boolean inputRequired;
	private String type;
	private int minimum;
	private int maximum;
	private String description;
	private HashMap<String, String> label;
	private String controlType;
	private String fieldType;
	private String format;
	private List<Validator> validators;
	private String fieldCategory;
	private String alignmentGroup;
	private HashMap<String, String> alignmentGroupLabel;
	private RequiredOnExpr visible;
	@JsonProperty("required")
	private boolean isRequired;
	@JsonProperty("bioAttributes")
	private List<String> bioAttributes;
	@JsonProperty("requiredOn")
	private List<RequiredOnExpr> requiredOn;
	@JsonProperty("subType")
	private String subType;
	@JsonProperty("firstNameDisabled")
	private boolean isFirstNameDisabled;
	@JsonProperty("middleNameDisabled")
	private boolean isMiddleNameDisabled;
	@JsonProperty("lastNameDisabled")
	private boolean isLastNameDisabled;
	@JsonProperty("dobDisabled")
	private boolean isDobDisabled;
	@JsonProperty("genderDisabled")
	private boolean isGenderDisabled;
	@JsonProperty("dateOfRegistrationDisabled")
	private boolean isDateOfRegDisabled;
	@JsonProperty("nationalityDisabled")
	private boolean isNationalityDisabled;
	@JsonProperty("addressLineDisabled")
	private boolean isAddressLineDisabled;
	@JsonProperty("addressNumberDisabled")
	private boolean isAddressNumberDisabled;
	@JsonProperty("postalCodeDisabled")
	private boolean isPostalCodeDisabled;
	@JsonProperty("userTypeDisabled")
	private boolean isUserTypeDisabled;
	@JsonProperty("IdDisabled")
	private boolean isIdDisabled;
	@JsonProperty("fileNumberDisabled")
	private boolean isFileNumberDisabled;
	@JsonProperty("phoneDisabled")
	private boolean isPhoneDisabled;
	@JsonProperty("emailDisabled")
    private boolean isEmailDisabled;
	private String contactType;
	private String group;
	private HashMap<String, String> groupLabel;
	private String changeAction;
	private boolean transliterate;
	private String templateName;
	private String fieldLayout;
	private List<String> locationHierarchy;
	private List<ConditionalBioAttributes> conditionalBioAttributes;
	@JsonProperty("exceptionPhotoRequired")
	private boolean isExceptionPhotoRequired;


	/**
	 * This method handles the UI-spec with / without exceptionPhotoRequired attribute in the field spec
	 * @return
	 */
	public boolean isExceptionPhotoRequired() {
		return isExceptionPhotoRequired ||
				(subType != null && RegistrationConstants.APPLICANT.equalsIgnoreCase(subType));
	}

}