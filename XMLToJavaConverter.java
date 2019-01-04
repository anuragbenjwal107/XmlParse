package com.demo.spring;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToJavaConverter {

	public static void main(String[] args) {
		String xmlStr = "<findIndividualsResponseMsg xmlns=\"http://enterprise.optum.com/schema/message/v11/c360/find/individual/v5/\">\r\n" + 
				"   <individualPagination>\r\n" + 
				"      <pageNumber>1</pageNumber>\r\n" + 
				"      <pageSize>20</pageSize>\r\n" + 
				"      <recordCount>1</recordCount>\r\n" + 
				"      <totalCount>1</totalCount>\r\n" + 
				"      <totalPages>1</totalPages>\r\n" + 
				"      <recordLimitExceeded>false</recordLimitExceeded>\r\n" + 
				"   </individualPagination>\r\n" + 
				"   <individual>\r\n" + 
				"      <individualDemographics>\r\n" + 
				"         <individualIdentifier>88796151</individualIdentifier>\r\n" + 
				"         <individualFirstName>Alfonzy</individualFirstName>\r\n" + 
				"         <individualLastName>Vaughn</individualLastName>\r\n" + 
				"         <individualMiddleName/>\r\n" + 
				"         <individualMiddleInitialText/>\r\n" + 
				"         <birthDate>1969-08-10</birthDate>\r\n" + 
				"         <nameSuffixCode/>\r\n" + 
				"         <genderTypeCode>M</genderTypeCode>\r\n" + 
				"         <socialSecurityNumber>132668253</socialSecurityNumber>\r\n" + 
				"         <deceasedDate/>\r\n" + 
				"      </individualDemographics>    \r\n" + 
				"   </individual>\r\n" + 
				"</findIndividualsResponseMsg>\r\n" + 
				"";
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(FindIndividualsResponseMsg.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			FindIndividualsResponseMsg employee = (FindIndividualsResponseMsg) jaxbUnmarshaller
					.unmarshal(new StringReader(xmlStr));
			System.out.println(employee);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
