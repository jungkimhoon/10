package practice;

public class EmployeeDTO {
	
		
		protected String name, position;
		protected int basePay, benefit;
		
		public EmployeeDTO() {}
		
		public EmployeeDTO(String name, String position, int basePay, int benefit ) {
			
			this.name = name;
			this.position = position;
			this.basePay = basePay;
			this.benefit = benefit;									
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public void setbasePay(int basePay) {
			this.basePay = basePay;
		}
		public void setBenefit(int benefit) {
			this.benefit = benefit;
		}
		public String getName() {
			return name;
		}
		
		public String getPosition() {
			return position;
		}
		
		public int getBasePay() {
			return basePay;
		}
		
		public int getBenefit() {
			return benefit;
		}
		
		@Override
		public String toString() {
			
		}
		
		
			
	}


