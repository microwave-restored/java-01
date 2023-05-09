package main.domain;

public abstract class Display implements IDevice {
    private String manufactorer;
    private String model;
    private String diagonal;
    private String resolution;
    private String matrix;

    public Display() {
    }

    public Display(String manufactorer, String model, String diagonal, String resolution, String matrix) {
        this.manufactorer = manufactorer;
        this.model = model;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.matrix = matrix;
    }

    public Display(String[] line) {
        manufactorer = line[1];
        model = line[2];
        diagonal = line[3];
        resolution = line[4];
        matrix = line[5];
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public void setManufactorer(String manufactorer) {
        this.manufactorer = manufactorer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String diagonal) {
        this.resolution = resolution;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Производитель: ");
        builder.append(manufactorer);
        builder.append(" | Модель: ");
        builder.append(model);
        builder.append(" | Диагональ: ");
        builder.append(diagonal);
        builder.append(" | Разрешение: ");
        builder.append(resolution);
        builder.append(" | Тип матрицы: ");
        builder.append(matrix);
        return builder.toString();
    }
}
