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
import java.util.List;
public class Blockchain {

	private int prevhash;
	private  List <Transaction> transaction;
	
	 public Blockchain(int prevhash, List<Transaction> transaction) {
		this.prevhash = prevhash;
		this.transaction = transaction;
	}
	public int getPrevhash() {
		return prevhash;
	}
	public void setPrevhash(int prevhash) {
		this.prevhash = prevhash;
	}
	public List<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + prevhash;
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
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
		Blockchain other = (Blockchain) obj;
		if (prevhash != other.prevhash)
			return false;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		return true;
	}
	
	
	
	
	

}
