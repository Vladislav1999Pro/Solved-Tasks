import java.util.Arrays;

public class Hospital {
    public static final float MIN_TEMPERATURE = 32;
    public static final float MAX_TEMPERATURE = 40;
    public static final double MIN_TEMP_HEALTHY = 36.1;
    public static final double MAX_TEMP_HEALTHY = 37;


    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsTemperature.length; i++) {
            patientsTemperature[i] = (float) Math.round(((MAX_TEMPERATURE - MIN_TEMPERATURE) * Math.random() + MIN_TEMPERATURE) * 10) / 10;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        int quantityHealthyPatients = 0;
        float averageTemperature = 0;
        for (float temperatures : temperatureData) {
            averageTemperature += temperatures;
            if ((temperatures > MIN_TEMP_HEALTHY) && (temperatures < MAX_TEMP_HEALTHY)) {
                quantityHealthyPatients++;
            }
        }
        averageTemperature = averageTemperature / temperatureData.length;

        String report =
                "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll("[\\[\\],]", "") +
                        "\nСредняя температура: " + String.format("%.2f", averageTemperature) +
                        "\nКоличество здоровых: " + quantityHealthyPatients;

        return report;
    }
}
