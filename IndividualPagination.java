package com.demo.spring;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "individualPagination")
public class IndividualPagination {
	 private String pageNumber;
	 private String pageSize;
	 private String recordCount;
	 private String totalCount;
	 private String totalPages;
	 private String recordLimitExceeded;


	 // Getter Methods 

	 public String getPageNumber() {
	  return pageNumber;
	 }

	 public String getPageSize() {
	  return pageSize;
	 }

	 public String getRecordCount() {
	  return recordCount;
	 }

	 public String getTotalCount() {
	  return totalCount;
	 }

	 public String getTotalPages() {
	  return totalPages;
	 }

	 public String getRecordLimitExceeded() {
	  return recordLimitExceeded;
	 }

	 // Setter Methods 

	 public void setPageNumber(String pageNumber) {
	  this.pageNumber = pageNumber;
	 }

	 public void setPageSize(String pageSize) {
	  this.pageSize = pageSize;
	 }

	 public void setRecordCount(String recordCount) {
	  this.recordCount = recordCount;
	 }

	 public void setTotalCount(String totalCount) {
	  this.totalCount = totalCount;
	 }

	 public void setTotalPages(String totalPages) {
	  this.totalPages = totalPages;
	 }

	 public void setRecordLimitExceeded(String recordLimitExceeded) {
	  this.recordLimitExceeded = recordLimitExceeded;
	 }

	@Override
	public String toString() {
		return "IndividualPagination [pageNumber=" + pageNumber + ", pageSize=" + pageSize + ", recordCount="
				+ recordCount + ", totalCount=" + totalCount + ", totalPages=" + totalPages + ", recordLimitExceeded="
				+ recordLimitExceeded + "]";
	}
	
}
