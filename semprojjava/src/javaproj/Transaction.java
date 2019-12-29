/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj;

/**
 *
 * @author rakesh
 */
public class Transaction {

	private String sourcename;
    private String destname;
    private Long sum;
	
    public Transaction(String sourcename, String destname, Long sum) {
		super();
		this.sourcename = sourcename;
		this.destname = destname;
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destname == null) ? 0 : destname.hashCode());
		result = prime * result + ((sourcename == null) ? 0 : sourcename.hashCode());
		result = prime * result + ((sum == null) ? 0 : sum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (destname == null) {
			if (other.destname != null)
				return false;
		} else if (!destname.equals(other.destname))
			return false;
		if (sourcename == null) {
			if (other.sourcename != null)
				return false;
		} else if (!sourcename.equals(other.sourcename))
			return false;
		if (sum == null) {
			if (other.sum != null)
				return false;
		} else if (!sum.equals(other.sum))
			return false;
		return true;
	}

}
