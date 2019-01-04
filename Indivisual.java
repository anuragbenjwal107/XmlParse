package com.demo.spring;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "individual")
public class Indivisual {

	IndividualDemographics IndividualDemographicsObject;
	/*ArrayList<Object> individualOtherIdentifier = new ArrayList<Object>();
	ArrayList<Object> individualPostalAddress = new ArrayList<Object>();
	ArrayList<Object> individualTelephoneNumber = new ArrayList<Object>();*/

	// Getter Methods

	public IndividualDemographics getIndividualDemographics() {
		return IndividualDemographicsObject;
	}

	// Setter Methods

	public void setIndividualDemographics(IndividualDemographics individualDemographicsObject) {
		this.IndividualDemographicsObject = individualDemographicsObject;
	}

	@Override
	public String toString() {
		return "Indivisual [IndividualDemographicsObject=" + IndividualDemographicsObject + "]";
	}
	
}
