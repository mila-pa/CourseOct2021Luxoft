package hierarchy.valut;

    public class Currency {
        private String name;
        private Double sale;
        private  Double buy;

        public Currency(String name, Double sale, Double buy) {
            this.name = name;
            this.sale = sale;
            this.buy = buy;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getSale() {
            return sale;
        }

        public void setSale(Double sale) {
            this.sale = sale;
        }

        public Double getBuy() {
            return buy;
        }

        public void setBuy(Double buy) {
            this.buy = buy;
        }

        @Override
        public String toString() {
            return "Currency{" +
                    "name='" + name + '\'' +
                    ", sale=" + sale +
                    ", buy=" + buy +
                    '}';
        }
    }
