
package a1_builder;

public class Pacient {
    private boolean PatRabatabil;
    private boolean MicDejunInclus;
    private boolean PapuciCamera;
    private boolean HalatInterior;

    private Pacient(Builder Builder) {
        this.PatRabatabil = Builder.PatRabatabil;
        this.MicDejunInclus = Builder.MicDejunInclus;
        this.PapuciCamera = Builder.PapuciCamera;
        this.HalatInterior = Builder.HalatInterior;
    }

    public static class Builder {
        private boolean PatRabatabil = false;
        private boolean MicDejunInclus = false;
        private boolean PapuciCamera = false;
        private boolean HalatInterior = false;

        public Builder CuPatRabatabil() {
            this.PatRabatabil = true;
            return this;
        }

        public Builder CuMicDejun() {
            this.MicDejunInclus = true;
            return this;
        }

        public Builder CuPapuci() {
            this.PapuciCamera = true;
            return this;
        }

        public Builder CuHalat() {
            this.HalatInterior = true;
            return this;
        }

        public Pacient Build() {
            return new Pacient(this);
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "PatRabatabil=" + PatRabatabil +
                ", MicDejunInclus=" + MicDejunInclus +
                ", PapuciCamera=" + PapuciCamera +
                ", HalatInterior=" + HalatInterior +
                '}';
    }
}
