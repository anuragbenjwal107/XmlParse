package com.demo.spring;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "findIndividualsResponseMsg")
@XmlAccessorType(XmlAccessType.FIELD)
public class FindIndividualsResponseMsg {
	
	@XmlAttribute(name="xmlns")
	private String _xmlns;

	public String get_xmlns() {
		return _xmlns;
	}

	public void set_xmlns(String _xmlns) {
		this._xmlns = _xmlns;
	}

	private IndividualPagination individualPagination;
	
	private Indivisual individual; 

	public IndividualPagination getIndividualPagination() {
		return individualPagination;
	}

	public void setIndividualPagination(IndividualPagination individualPagination) {
		this.individualPagination = individualPagination;
	}

	public Indivisual getIndividual() {
		return individual;
	}

	public void setIndividual(Indivisual individual) {
		this.individual = individual;
	}

	@Override
	public String toString() {
		return "FindIndividualsResponseMsg [individualPagination=" + individualPagination + ", individual=" + individual
				+ "]";
	}
	
}
