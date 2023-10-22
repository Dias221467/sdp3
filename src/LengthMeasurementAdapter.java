class LengthMeasurementAdapter implements LengthMeasurement {
    private MeterMeasurement meterMeasurement;

    public LengthMeasurementAdapter(MeterMeasurement meterMeasurement) {
        this.meterMeasurement = meterMeasurement;
    }

    @Override
    public double getMeasurement() {
        double meters = meterMeasurement.getMeters();
        return meters * 3.28084;
    }
}