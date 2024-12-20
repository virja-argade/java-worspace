package com.BikkadIT.BankApp.Model;

public class Account {
	    int accno;
	    
	    String accName;
	    
	    String accAdar;
	    
	    String accPan;
	    
	    double accbal;

		

		public int getAccno() {
			return accno;
		}

		public void setAccno(int accno) {
			this.accno = accno;
		}

		public String getAccName() {
			return accName;
		}

		public void setAccName(String accName) {
			this.accName = accName;
		}

		public String getAccAdar() {
			return accAdar;
		}

		public void setAccAdar(String accAdar) {
			this.accAdar = accAdar;
		}

		public String getAccPan() {
			return accPan;
		}

		public void setAccPan(String accPan) {
			this.accPan = accPan;
		}

		public double getAccbal() {
			return accbal;
		}

		public void setAccbal(double accbal) {
			this.accbal = accbal;
		}

		@Override
		public String toString() {
			return "Account [accno=" + accno + ", accName=" + accName + ", accAdar=" + accAdar + ", accPan=" + accPan
					+ ", accbal=" + accbal + "]";
		}

		
	
    
    
}
