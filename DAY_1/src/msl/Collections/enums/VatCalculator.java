package msl.Collections.enums;

public enum VatCalculator {
		FOOD(0.1){
			@Override
			double calcVat(double price) {
				// TODO Auto-generated method stub
				return price*this.getVat();
			}		
		},
		SERVICE(0.2){

			@Override
			double calcVat(double price) {
				// TODO Auto-generated method stub
				return price*this.getVat();
			}
		}
		,
		FUEL(0.3){

			@Override
			double calcVat(double price) {
				// TODO Auto-generated method stub
				return price*this.getVat();
			}
		
		};
		private double vat;
		abstract double calcVat(double price);
		private VatCalculator(double vat) {
			this.vat = vat;
		}
		
		public double getVat() {
			return vat;
		}
		public double calcVat2(double price) {
			return vat*price;
		}
		public void setVat(double vat) {
			this.vat = vat;
		}

}
