package collectionbasics;

public class student {

	   private int said;
	   private String sname;
	   private String sadd;
	   private String scity;
	/**
	 * @return the said
	 */
	public int getSid() {
		return said;
	}
	/**
	 * @param said the said to set
	 */
	public void setSid(int sid) {
		this.said = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sadd
	 */
	public String getSadd() {
		return sadd;
	}
	/**
	 * @param sadd the sadd to set
	 */
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	/**
	 * @return the scity
	 */
	public String getScity() {
		return scity;
	}
	/**
	 * @param scity the scity to set
	 */
	public void setScity(String scity) {
		this.scity = scity;
	}
	@Override
	public String toString() {
		return "Student [sid=" + said + ", sname=" + sname + ", sadd=" + sadd + ", scity=" + scity + "]";
	}
	
}


	  

