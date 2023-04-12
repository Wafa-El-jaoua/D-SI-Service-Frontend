package de.ptb.codataapi.model;




    public class siReal {
        Double value;
        String unit;
        String dateTime;
        expandedUnc expUnc;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public expandedUnc getExpUnc() {
            return expUnc;
        }

        public void setExpUnc(expandedUnc expUnc) {
            this.expUnc = expUnc;
        }

        public siReal(Double value, String unit, String dateTime, expandedUnc expUnc) {
            this.value = value;
            this.unit = unit;
            this.dateTime = dateTime;
            this.expUnc = expUnc;
        }

    }
