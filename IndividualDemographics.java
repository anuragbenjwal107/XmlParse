package com.demo.spring;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "individualDemographics")
public class IndividualDemographics {


	 private String individualIdentifier;
	 private String individualFirstName;
	 private String individualLastName;
	 private String individualMiddleName;
	 private String individualMiddleInitialText;
	 private String birthDate;
	 private String nameSuffixCode;
	 private String genderTypeCode;
	 private String socialSecurityNumber;
	 private String deceasedDate;


	 // Getter Methods 

	 public String getIndividualIdentifier() {
	  return individualIdentifier;
	 }

	 public String getIndividualFirstName() {
	  return individualFirstName;
	 }

	 public String getIndividualLastName() {
	  return individualLastName;
	 }

	 public String getIndividualMiddleName() {
	  return individualMiddleName;
	 }

	 public String getIndividualMiddleInitialText() {
	  return individualMiddleInitialText;
	 }

	 public String getBirthDate() {
	  return birthDate;
	 }

	 public String getNameSuffixCode() {
	  return nameSuffixCode;
	 }

	 public String getGenderTypeCode() {
	  return genderTypeCode;
	 }

	 public String getSocialSecurityNumber() {
	  return socialSecurityNumber;
	 }

	 public String getDeceasedDate() {
	  return deceasedDate;
	 }

	 // Setter Methods 

	 public void setIndividualIdentifier(String individualIdentifier) {
	  this.individualIdentifier = individualIdentifier;
	 }

	 public void setIndividualFirstName(String individualFirstName) {
	  this.individualFirstName = individualFirstName;
	 }

	 public void setIndividualLastName(String individualLastName) {
	  this.individualLastName = individualLastName;
	 }

	 public void setIndividualMiddleName(String individualMiddleName) {
	  this.individualMiddleName = individualMiddleName;
	 }

	 public void setIndividualMiddleInitialText(String individualMiddleInitialText) {
	  this.individualMiddleInitialText = individualMiddleInitialText;
	 }

	 public void setBirthDate(String birthDate) {
	  this.birthDate = birthDate;
	 }

	 public void setNameSuffixCode(String nameSuffixCode) {
	  this.nameSuffixCode = nameSuffixCode;
	 }

	 public void setGenderTypeCode(String genderTypeCode) {
	  this.genderTypeCode = genderTypeCode;
	 }

	 public void setSocialSecurityNumber(String socialSecurityNumber) {
	  this.socialSecurityNumber = socialSecurityNumber;
	 }

	 public void setDeceasedDate(String deceasedDate) {
	  this.deceasedDate = deceasedDate;
	 }

	@Override
	public String toString() {
		return "IndividualDemographics [individualIdentifier=" + individualIdentifier + ", individualFirstName="
				+ individualFirstName + ", individualLastName=" + individualLastName + ", individualMiddleName="
				+ individualMiddleName + ", individualMiddleInitialText=" + individualMiddleInitialText + ", birthDate="
				+ birthDate + ", nameSuffixCode=" + nameSuffixCode + ", genderTypeCode=" + genderTypeCode
				+ ", socialSecurityNumber=" + socialSecurityNumber + ", deceasedDate=" + deceasedDate + "]";
	}

}
